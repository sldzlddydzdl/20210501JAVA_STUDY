package application;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javafx.scene.Scene;

public class Client {

	// 서버내 클라이언트 
	
	Socket socket; // 소켓 선언
	
	public Client(Socket socket) {
		
		this.socket = socket;
		receive(); // 접속된 이후부터 메시지 받기 메소드 실행
		
	}
	
	// 메시지 받기 [ 서버내 클라이언트가 메시지를 받음 ] // 멀티쓰레드
	public void receive() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
			
				try {
					while(true) {
						InputStream in = socket.getInputStream(); // 1. 소켓의 스트림 가져오기
						byte[] buffer = new byte[500]; // 스트림 이동단위 = 바이트
						
						int count = in.read(buffer); // 2. 스트림내 바이트를 읽어와서 배열에 저장
						String message = new String(buffer, 0 , count , "UTF-8");
							// 바이트 => 문자열변환 ( 변환 값 , 시작위치 , 끝위치 , 인코딩[ 번역 ] )
							// UTF-8 : 전세계 공용어 지원
						
						 
						for(Client temp : Main.clients) { // (!!! 중요) 받은 메시지를 접속된 클라이언트에게 모두 보내기
							temp.send(message);
						} // for
					} // while
				} // try
				catch (Exception e) {
					// TODO: handle exception
				}
			} // run 끝
		}; // 쓰레드 끝 
		
		Main.threadpool.submit(thread); // 해당쓰레드는 쓰레드풀에 넣기 
		
	}
	
	// 메시지 보내기 
	public void send(String message) {
		
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream(); // 1. 소켓의 출력스트림 가져오기
					byte[] buffer = message.getBytes("UTF-8"); // 문자열 => 바이트열
					out.write(buffer); // 바이트 내보내기 
					out.flush(); // 버퍼 초기화
				
					
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		};// 쓰레드 끝
		
		Main.threadpool.submit(thread);
	
	}
	
}

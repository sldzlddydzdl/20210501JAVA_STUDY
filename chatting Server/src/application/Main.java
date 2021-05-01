package application;
	
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


public class Main extends Application {
	
	public static ExecutorService threadpool; 
			// 쓰레드풀 구현 인터페이스 // 멀티쓰레드 요청순서
	public static Vector< Client > clients = new Vector<>();
		// arraylist[ 동기화x ]  < --- >  vector [ 동기화o ] // 클라이언트 리스트 
	
	
	// 채팅 서버 만들기
		// 준비물 : 서버소켓, 멀티쓰레드 => 쓰레드폴[ 여러개의 쓰레드 관리(순서 매겨서 관리) ] 구현
			// : 접속한 소캣 [ 접속자 ] 관리하는 리스트 => Vector
	
		ServerSocket serverSocket ; // 서버소켓 선언
		// 1. 서버시작
		public void startserver(  ) {  
			
			try {
				serverSocket = new ServerSocket(); // 메모리 할당
				serverSocket.bind(new InetSocketAddress("127.0.0.1" , 5001));
					// 바인딩 [ 서버구현 ] : 호스트명 [ip주소] , 포트번호
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			// 클라이언트 들의 요청을 계속 기다리기
			Runnable thread = new Runnable() { // 멀티쓰레드
				// Runnable 쓰레드 인터페이스 [ 여러개 상속 ]
				// Thread 클래스 [ 한개 상속 ]
				@Override
				public void run() {
					while(true) {
						try {
							Socket socket = serverSocket.accept(); // 서버 연결 수락
							clients.add( new Client(socket) ); // 클라이언트 생성후 => 벡터리스트에 담기
						}
						catch (Exception e) {
							// TODO: handle exception
						}	
					}
				} // run 끝
			}; // 쓰레드 인터페이스 끝
			
			threadpool = Executors.newCachedThreadPool(); // 1. 쓰레드풀의 초기값 설정
			threadpool.submit(thread); // 해당 쓰레드를 쓰레드풀에 넣기 => 해당쓰레드는 쓰레드풀이 관리
			
		}
		
		// 2. 서버중지
		public void stopserver() {
			
			// 1. 접속된 클라이언트 모두 종료 , 2. 모든 서버소켓 닫기 , 3. 쓰레드풀 종료
			
			// 1. 
			try {
				Iterator< Client > iterator = clients.iterator();
					// Iterator : 컬렉션 [ list ,set 등 ] 항목들의 하나씩 순회하는 인터페이스
				while( iterator.hasNext()) {
						// hasNext() : 다음요소가 있는지 여부 확인 T / F
					Client temp = iterator.next();
						// next() : 다음요소로 이동
					temp.socket.close();// 소켓 제거
					iterator.remove();// 이터레이터 제거
				}
				
				// 2. 서버소켓 닫기
				serverSocket.close();
				// 3. 쓰레드풀 닫기
				threadpool.shutdown();
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
			
		// 3. 
	
	
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent parent = FXMLLoader.load(getClass().getResource("server.fxml"));
				// controller 없이 액션 실행
				Button btnstart = (Button) parent.lookup("#btnstart");
				TextArea txtserver = (TextArea) parent.lookup("#txtserver");
			
				// 람다식[익명메소드] 표현 : btnstart.setOnAction(e -> { 실행 코드 } );
				btnstart.setOnAction(e -> {
					
					if(btnstart.getText().equals("서버실행")) {
						
						startserver(); // 서버 시작
						
						Platform.runLater( () -> {
							// runLater 람다식 메소드 : 인수 x
							// runLater : 플래폼[fx] 에 쓰레드를 업데이트
							
							txtserver.appendText("[서버시작]\n"); // 텍스트창에 텍스트 추가
							btnstart.setText("서버중지"); // 버튼의 텍스트를 설정
							
						} );
						
					}
					else {
						stopserver();
						Platform.runLater(() -> {
							
							txtserver.appendText("[서버중지]\n");
							btnstart.setText("서버실행");
							
						} );
					}
					
				});
				
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.setTitle("서버");
			primaryStage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

package application;
	
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	// 클라이언트 만들기
	
	Socket socket; // 소캣 선언
	TextArea txtclient; // 채팅 창 선언
	
	// 1. 클라이언트 시작
	
	public void startclient() {
	
		Thread thread = new Thread() {
			public void run() {
				try {
					socket = new Socket("127.0.0.1" , 5001); // 소캣 메모리할당 [ 서버의 서버주소 , 포트 ]
					receive();
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			};
			
		}; // 쓰레드 끝
		thread.start(); // 쓰레드 시작 // run 메소드 호출
	}
	
	// 2. 클라이언트 종료
	public void stopclient() {
		try {
			socket.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 3. 메시지 받기
	public void receive() {
		
		
		try {
			while(true) {
				InputStream in = socket.getInputStream();
				byte[] buffer = new byte[1000];
				int count = in.read(buffer);
				String message = new String(buffer, 0 , count, "UTF-8");
				
					// 채팅창에 띄우기
					Platform.runLater(() -> {
						
						txtclient.appendText(message);
						
					});
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// 4. 메시지 보내기
	public void send( String message ) {
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream();
					byte[] buffer= message.getBytes("UTF-8");
					out.write(buffer);
					out.flush();
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		};// 쓰레드 끝
		thread.start();
		
		
		
		
	}
	
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
	
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("client.fxml"));
			
				// 컨트롤 가져오기 
				Button btnsend = (Button)parent.lookup("#btnsend");
				Button btnconnect = (Button)parent.lookup("#btnconnect");
				TextField txtinput = (TextField)parent.lookup("#txtinput");
				TextField txtname = (TextField)parent.lookup("#txtname");
				txtclient = (TextArea)parent.lookup("#txtclient");
			
				// 접속하기
				btnconnect.setOnAction(e -> {
					
					if(btnconnect.getText().equals("채팅접속")) {
						
						startclient();
						
						Platform.runLater(() -> {
						
							txtclient.appendText("[" + txtname.getText() + "님이 접속했습니다]\n");
							
						});
						btnconnect.setText("채팅퇴장");
					}
					else {						
						Platform.runLater(() -> {
							
							txtclient.appendText("[" + txtname.getText() + "님이 퇴장 했습니다]\n");
							
						});
						stopclient();
						btnconnect.setText("채팅접속");
					}					
				});
				
				// 채팅 입력후 보내기 버튼 / 엔터 버튼을 눌렀을때
				txtinput.setOnAction(e -> {
					send(txtname.getText() + " : " + txtinput.getText() + "\n");
					txtinput.setText("");				
				});
				
				
				btnsend.setOnAction(e -> {
					send(txtname.getText() + " : " + txtinput.getText() + "\n");
					txtinput.setText("");
				});
				
				
				
				
				
				
			
			
			Scene scene = new Scene(parent);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("채팅방");
			
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

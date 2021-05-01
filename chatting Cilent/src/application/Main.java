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
	
	// Ŭ���̾�Ʈ �����
	
	Socket socket; // ��Ĺ ����
	TextArea txtclient; // ä�� â ����
	
	// 1. Ŭ���̾�Ʈ ����
	
	public void startclient() {
	
		Thread thread = new Thread() {
			public void run() {
				try {
					socket = new Socket("127.0.0.1" , 5001); // ��Ĺ �޸��Ҵ� [ ������ �����ּ� , ��Ʈ ]
					receive();
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			};
			
		}; // ������ ��
		thread.start(); // ������ ���� // run �޼ҵ� ȣ��
	}
	
	// 2. Ŭ���̾�Ʈ ����
	public void stopclient() {
		try {
			socket.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 3. �޽��� �ޱ�
	public void receive() {
		
		
		try {
			while(true) {
				InputStream in = socket.getInputStream();
				byte[] buffer = new byte[1000];
				int count = in.read(buffer);
				String message = new String(buffer, 0 , count, "UTF-8");
				
					// ä��â�� ����
					Platform.runLater(() -> {
						
						txtclient.appendText(message);
						
					});
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// 4. �޽��� ������
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
		};// ������ ��
		thread.start();
		
		
		
		
	}
	
	
	
	
	
	@Override
	public void start(Stage primaryStage) {
	
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("client.fxml"));
			
				// ��Ʈ�� �������� 
				Button btnsend = (Button)parent.lookup("#btnsend");
				Button btnconnect = (Button)parent.lookup("#btnconnect");
				TextField txtinput = (TextField)parent.lookup("#txtinput");
				TextField txtname = (TextField)parent.lookup("#txtname");
				txtclient = (TextArea)parent.lookup("#txtclient");
			
				// �����ϱ�
				btnconnect.setOnAction(e -> {
					
					if(btnconnect.getText().equals("ä������")) {
						
						startclient();
						
						Platform.runLater(() -> {
						
							txtclient.appendText("[" + txtname.getText() + "���� �����߽��ϴ�]\n");
							
						});
						btnconnect.setText("ä������");
					}
					else {						
						Platform.runLater(() -> {
							
							txtclient.appendText("[" + txtname.getText() + "���� ���� �߽��ϴ�]\n");
							
						});
						stopclient();
						btnconnect.setText("ä������");
					}					
				});
				
				// ä�� �Է��� ������ ��ư / ���� ��ư�� ��������
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
			
			primaryStage.setTitle("ä�ù�");
			
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

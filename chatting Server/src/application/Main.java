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
			// ������Ǯ ���� �������̽� // ��Ƽ������ ��û����
	public static Vector< Client > clients = new Vector<>();
		// arraylist[ ����ȭx ]  < --- >  vector [ ����ȭo ] // Ŭ���̾�Ʈ ����Ʈ 
	
	
	// ä�� ���� �����
		// �غ� : ��������, ��Ƽ������ => ��������[ �������� ������ ����(���� �Űܼ� ����) ] ����
			// : ������ ��Ĺ [ ������ ] �����ϴ� ����Ʈ => Vector
	
		ServerSocket serverSocket ; // �������� ����
		// 1. ��������
		public void startserver(  ) {  
			
			try {
				serverSocket = new ServerSocket(); // �޸� �Ҵ�
				serverSocket.bind(new InetSocketAddress("127.0.0.1" , 5001));
					// ���ε� [ �������� ] : ȣ��Ʈ�� [ip�ּ�] , ��Ʈ��ȣ
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			// Ŭ���̾�Ʈ ���� ��û�� ��� ��ٸ���
			Runnable thread = new Runnable() { // ��Ƽ������
				// Runnable ������ �������̽� [ ������ ��� ]
				// Thread Ŭ���� [ �Ѱ� ��� ]
				@Override
				public void run() {
					while(true) {
						try {
							Socket socket = serverSocket.accept(); // ���� ���� ����
							clients.add( new Client(socket) ); // Ŭ���̾�Ʈ ������ => ���͸���Ʈ�� ���
						}
						catch (Exception e) {
							// TODO: handle exception
						}	
					}
				} // run ��
			}; // ������ �������̽� ��
			
			threadpool = Executors.newCachedThreadPool(); // 1. ������Ǯ�� �ʱⰪ ����
			threadpool.submit(thread); // �ش� �����带 ������Ǯ�� �ֱ� => �ش羲����� ������Ǯ�� ����
			
		}
		
		// 2. ��������
		public void stopserver() {
			
			// 1. ���ӵ� Ŭ���̾�Ʈ ��� ���� , 2. ��� �������� �ݱ� , 3. ������Ǯ ����
			
			// 1. 
			try {
				Iterator< Client > iterator = clients.iterator();
					// Iterator : �÷��� [ list ,set �� ] �׸���� �ϳ��� ��ȸ�ϴ� �������̽�
				while( iterator.hasNext()) {
						// hasNext() : ������Ұ� �ִ��� ���� Ȯ�� T / F
					Client temp = iterator.next();
						// next() : ������ҷ� �̵�
					temp.socket.close();// ���� ����
					iterator.remove();// ���ͷ����� ����
				}
				
				// 2. �������� �ݱ�
				serverSocket.close();
				// 3. ������Ǯ �ݱ�
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
				// controller ���� �׼� ����
				Button btnstart = (Button) parent.lookup("#btnstart");
				TextArea txtserver = (TextArea) parent.lookup("#txtserver");
			
				// ���ٽ�[�͸�޼ҵ�] ǥ�� : btnstart.setOnAction(e -> { ���� �ڵ� } );
				btnstart.setOnAction(e -> {
					
					if(btnstart.getText().equals("��������")) {
						
						startserver(); // ���� ����
						
						Platform.runLater( () -> {
							// runLater ���ٽ� �޼ҵ� : �μ� x
							// runLater : �÷���[fx] �� �����带 ������Ʈ
							
							txtserver.appendText("[��������]\n"); // �ؽ�Ʈâ�� �ؽ�Ʈ �߰�
							btnstart.setText("��������"); // ��ư�� �ؽ�Ʈ�� ����
							
						} );
						
					}
					else {
						stopserver();
						Platform.runLater(() -> {
							
							txtserver.appendText("[��������]\n");
							btnstart.setText("��������");
							
						} );
					}
					
				});
				
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.setTitle("����");
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

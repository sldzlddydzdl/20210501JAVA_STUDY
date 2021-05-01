package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class java2_66 extends Application {

	// stage => layout , scene -> control
	
	@Override
	public void start(Stage stage) throws Exception {
		
		// ���̾ƿ� ����
//		VBox ���λ��� = new VBox(); // vbox ����
//		���λ���.setPrefWidth(350); // ���� �� ����
//		���λ���.setPrefHeight(150); // ���� �� ����
//		���λ���.setAlignment(Pos.CENTER); // ��� ����
//		���λ���.setSpacing(20);		// �Ҽӵ� ��Ʈ�ѵ��� ���� ����
//		
//			// ��Ʈ�� ����
//			Label �ۻ��� = new Label();
//			�ۻ���.setText("�ȳ��ϼ��� javafx �Դϴ� ");
//			�ۻ���.setFont(new Font(30));
//			
//			Button ��ư = new Button();
//			��ư.setText("Ȯ��");
//			��ư.setOnAction( e-> { stage.close(); } );
//				// ���ٽ� [ �̸����� �޼ҵ�(�͸�޼ҵ�) ]
//					// �μ�(����) -> { �ڵ� }
//			
//		// ���̾ƿ��� �ۻ��� ���
//		���λ���.getChildren().add(�ۻ���); // ���̺��߰�
//		���λ���.getChildren().add(��ư); // ��ư�߰�
			
		// �� �� �������� ����
//		Scene scene = new Scene(���λ���); // �� ����
//		stage.setScene(scene); // ���������� �� �ֱ�
		stage.setTitle("javafx");  // �������� ����
		stage.setResizable(false); // �������� ũ�⺯�� �Ұ�
		stage.show();// �������� ���� 
		
		
	}
	
	public static void main(String[] args) {
		
		launch(); // launch => start �޼ҵ� ȣ��
		
		
		
	}
	
	// 1. �ش� Ŭ������ extends Application ��� �ޱ�
	// 2. launch => start �޼ҵ� ȣ��
	// 3. javafx ���� : Stage => Scene => ���̾ƿ�[ �����̳� , ��Ʈ�� �� ]
	// 4. �������� ���� 
	
}

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {

		try {
			// ������ ���� => fxml������ �ҷ����� => Ŭ���� : Parent [ ���̾ƿ� ����ִ� Ŭ���� ]
			Parent parent = FXMLLoader.load( getClass().getResource("login.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			stage.setTitle("�α���");
			stage.setResizable(false);
			stage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

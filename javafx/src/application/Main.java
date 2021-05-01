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
			// 씬빌더 만든 => fxml파일을 불러오기 => 클래스 : Parent [ 레이아웃 담아주는 클래스 ]
			Parent parent = FXMLLoader.load( getClass().getResource("login.fxml"));
			
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			stage.setTitle("로그인");
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

package Product;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
		Parent parent = FXMLLoader.load( getClass().getResource("mainpage.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("力前包府橇肺弊伐");
		stage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		
		}
	}
	public static void main(String[] args) {
		launch();
	}

}

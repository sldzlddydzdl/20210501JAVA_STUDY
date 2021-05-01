package Product;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main3 extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub

		Parent parent = FXMLLoader.load(getClass().getResource("mainpage.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		stage.setTitle("Á¦Ç°");
		stage.setResizable(false);
		stage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
}

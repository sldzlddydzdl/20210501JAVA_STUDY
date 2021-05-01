package Product;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class main2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		try {
			Parent parent = FXMLLoader.load( getClass().getResource("mainpage.fxml"));
			
			Scene scene = new Scene(parent);
			stage.setScene(scene);
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

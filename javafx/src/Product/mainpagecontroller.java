package Product;

import java.util.ResourceBundle;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class mainpagecontroller implements Initializable {


    @FXML
    private Button btnadd;

    @FXML
    private Button btnlist;

    @FXML
    private Button btnupdate;

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void addAction() {
		
		try {
			Stage stage = (Stage)btnadd.getScene().getWindow();
			Parent parent = FXMLLoader.load(getClass().getResource("productadd.fxml"));
			
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
	
}

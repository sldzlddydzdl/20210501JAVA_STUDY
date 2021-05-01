package Product;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class mainpagecontroller implements Initializable  {
	
    @FXML
    private Button btnadd;

    @FXML
    private Button btnlist;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btnchatting;

    @FXML
    private Button btnserver;
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	// ��ǰ �߰� ��ư�� Ŭ�������� 
	public void addAction() {
		try {
			Stage stage = (Stage) btnadd.getScene().getWindow(); // ���� ���������� ��������
			Parent parent = FXMLLoader.load( getClass().getResource("productadd.fxml"));
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("��ǰ�������α׷�");
			stage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	 @FXML // ����Ʈ ��ư�� Ŭ�������� 
	    void listAction(ActionEvent event) {
	    	
		   try {
				Stage stage = (Stage) btnadd.getScene().getWindow(); // ���� ���������� ��������
				Parent parent = FXMLLoader.load( getClass().getResource("productlist.fxml"));
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.setTitle("��ǰ�������α׷�");
				stage.show();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		   

	    }
	
	// ��ǰ �߰� ��ư�� Ŭ�������� 
		public void serverAction() {
			try {
				Stage stage = new Stage();
				Parent parent = FXMLLoader.load( getClass().getResource("server.fxml"));
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.setTitle("��ǰ�������α׷�");
				stage.show();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public void chattingAction() {
			try {
				Stage stage = new Stage();
				Parent parent = FXMLLoader.load( getClass().getResource("client.fxml"));
				Scene scene = new Scene(parent);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.setTitle("��ǰ�������α׷�");
				stage.show();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
}

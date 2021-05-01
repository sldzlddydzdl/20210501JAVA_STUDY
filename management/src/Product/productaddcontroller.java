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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class productaddcontroller implements Initializable  {
	
    @FXML
    private TextField txtpanme;

    @FXML
    private TextField txtpcategory;

    @FXML
    private TextField txtpprice;

    @FXML
    private TextField txtpcode;

    @FXML
    private Button btnadd;
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		DAO dao = DAO.getdao();
		
		
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
	
	//  �߰� ��ư�� Ŭ�������� 
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
	
	// ��ǰ �߰� ��ư�� Ŭ�������� 
	public void addproduct() {
		
		Product temp = new Product(
				txtpcode.getText(), 
				txtpanme.getText(), 
				txtpcategory.getText(), 
				txtpprice.getText() );
		
		DAO dao = DAO.getdao();
		dao.addproduct(temp);
		
	}
	

	
	
}

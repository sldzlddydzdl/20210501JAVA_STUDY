package Product;

import java.util.ResourceBundle;

import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class productaddcontroller implements Initializable {



    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtpcategory;

    @FXML
    private TextField pprice;

    @FXML
    private TextField txtpcode;

    @FXML
    private Button btnadd;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		DAO dao = DAO.getdao();
	}
	
	// ��ǰ �߰���ư ��������
	public void addAction() {
		
		try {
			Stage stage = (Stage)btnadd.getScene().getWindow();
			Parent parent = FXMLLoader.load(getClass().getResource("productadd.fxml"));
			
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
	public void addprodcut() {
		
		Product temp = new Product(txtpcode.getText()
				, txtpname.getText()
				, txtpcategory.getText()
				, pprice.getText());
		
		DAO dao = DAO.getdao();
		dao.addproduct(temp);
	}
	
}

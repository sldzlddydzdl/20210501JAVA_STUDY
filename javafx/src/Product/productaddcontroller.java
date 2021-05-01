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
	
	// 제품 추가버튼 눌렀을때
	public void addAction() {
		
		try {
			Stage stage = (Stage)btnadd.getScene().getWindow();
			Parent parent = FXMLLoader.load(getClass().getResource("productadd.fxml"));
			
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("제품관리프로그램");
			stage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 제품 추가 버튼을 클릭했을때
	public void addprodcut() {
		
		Product temp = new Product(txtpcode.getText()
				, txtpname.getText()
				, txtpcategory.getText()
				, pprice.getText());
		
		DAO dao = DAO.getdao();
		dao.addproduct(temp);
	}
	
}

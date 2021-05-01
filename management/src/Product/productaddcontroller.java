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
	
	@FXML // 리스트 버튼을 클릭했을때 
	void listAction(ActionEvent event) {
		
	   try {
			Stage stage = (Stage) btnadd.getScene().getWindow(); // 기존 스테이지를 가져오기
			Parent parent = FXMLLoader.load( getClass().getResource("productlist.fxml"));
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
	
	//  추가 버튼을 클릭했을때 
	public void addAction() {
		try {
			Stage stage = (Stage) btnadd.getScene().getWindow(); // 기존 스테이지를 가져오기
			Parent parent = FXMLLoader.load( getClass().getResource("productadd.fxml"));
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

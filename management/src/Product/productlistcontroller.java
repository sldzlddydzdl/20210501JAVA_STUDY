package Product;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class productlistcontroller implements Initializable  {
	

    @FXML
    private Button btnadd;

    @FXML
    private Button btnlist;

    @FXML
    private TableView< Product > producttable;

    
    private ObservableList<Product> productlist;
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// db 객체 생성 
		DAO dao = DAO.getdao();
		
		// 리스트에 메모리 할당 
		productlist = FXCollections.observableArrayList(); // 메모리 할당 
		// db에서 모든 제품 가져오기 
		productlist = dao.listproduct();
		
		// 테이블에 넣기 
		TableColumn tc = producttable.getColumns().get(0); // 첫번째 열 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("pcode")  ); // 첫번재 열에 리스트내 첫번째 필드 저장
		
		tc = producttable.getColumns().get(1); // 두번째 열 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("pname")  ); // 두번재 열에 리스트내 첫번째 필드 저장
		
		tc = producttable.getColumns().get(2); // 세번째 열 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("pcategory")  ); // 세번재 열에 리스트내 첫번째 필드 저장
		
		tc = producttable.getColumns().get(3); // 네번째 열 가져오기 
		tc.setCellValueFactory( new PropertyValueFactory("pprice")  ); // 네번재 열에 리스트내 첫번째 필드 저장
		
		producttable.setItems(productlist);
		
		
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

	
	
	
	
}


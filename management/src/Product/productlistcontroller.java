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
		
		// db ��ü ���� 
		DAO dao = DAO.getdao();
		
		// ����Ʈ�� �޸� �Ҵ� 
		productlist = FXCollections.observableArrayList(); // �޸� �Ҵ� 
		// db���� ��� ��ǰ �������� 
		productlist = dao.listproduct();
		
		// ���̺� �ֱ� 
		TableColumn tc = producttable.getColumns().get(0); // ù��° �� �������� 
		tc.setCellValueFactory( new PropertyValueFactory("pcode")  ); // ù���� ���� ����Ʈ�� ù��° �ʵ� ����
		
		tc = producttable.getColumns().get(1); // �ι�° �� �������� 
		tc.setCellValueFactory( new PropertyValueFactory("pname")  ); // �ι��� ���� ����Ʈ�� ù��° �ʵ� ����
		
		tc = producttable.getColumns().get(2); // ����° �� �������� 
		tc.setCellValueFactory( new PropertyValueFactory("pcategory")  ); // ������ ���� ����Ʈ�� ù��° �ʵ� ����
		
		tc = producttable.getColumns().get(3); // �׹�° �� �������� 
		tc.setCellValueFactory( new PropertyValueFactory("pprice")  ); // �׹��� ���� ����Ʈ�� ù��° �ʵ� ����
		
		producttable.setItems(productlist);
		
		
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

	
	
	
	
}


package application;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class loginController implements Initializable {


    @FXML
    private TextField loginid;

    @FXML
    private PasswordField loginpw;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;
	
    @FXML
    private Button btnstudentadd;

    @FXML
    private Button btnstudentdel;
    
    
    private ObservableList<Member> memberlist;
    private ObservableList<Student> studentlist;
    TableView<Student> studenttableview;
	TableView<Member> membertableview;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		memberlist = FXCollections.observableArrayList(); // �޸� �Ҵ�
		studentlist = FXCollections.observableArrayList();
		
	}
	


	
	@FXML
	// �α��� ����������
	public void loginmain(String loginid) {
		
		btnsignup.getScene().getWindow().hide();
		
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
				// parent Ŭ���� : �ش� fxml ������ ��� ���̾ƿ��� ��Ʈ�� ��� ����[ fx:id]
				
				// �α׾ƿ�
				Button btnlogout = (Button)parent.lookup("#btnlogout");
				btnlogout.setOnAction(e2 -> {
					
					stage.close(); // �ش� �������� ����
					Stage newstage = new Stage(); // �� �������� ����
					
					newstage = (Stage)btnsignup.getScene().getWindow(); // �ش��ư�� �����ϴ� ���� ������ ��������
					
					try {
						newstage.show(); // 
					}
					catch (Exception e) {
						// TODO: handle exception
					}
				});
				
				// ȸ�� ���̺� 
				 membertableview = (TableView<Member>)parent.lookup("#membertableview");
				
				TableColumn tc = membertableview.getColumns().get(0); // ù��° �� ȣ��
				tc.setCellValueFactory(new PropertyValueFactory("id"));
				
				tc = membertableview.getColumns().get(1);
				tc.setCellValueFactory(new PropertyValueFactory("name"));
				
				tc = membertableview.getColumns().get(2); // �ι�° �� ȣ��
				tc.setCellValueFactory(new PropertyValueFactory("date"));
				
				
				membertableview.setItems(memberlist);
				
				// ȸ�� Ż��
				Button btnmemberdel = (Button)parent.lookup("#btnmemberdel");
				
				btnmemberdel.setOnAction(e4 -> {
					try {
						
						Alert alert = new Alert(AlertType.CONFIRMATION);
						
						alert.setContentText(" ���� Ż�� �Ͻðڽ��ϱ�? "); // ���â ����
						alert.setTitle("�˸�"); // ���â ���� 
						alert.setHeaderText("ȸ��Ż��"); // ���â�� ����		
						
						Optional<ButtonType> result = alert.showAndWait();
							// ButtonType Ŭ������ �̿��� ��[OK]/�ƴϿ�[Cancle] �ν� 
						if(result.get() == ButtonType.OK) {
							ObservableList<Member> members = membertableview.getItems(); // ��ü�л�
							// ���� ���̺� �����ϴ� ������[������]�� ����Ʈ�� �ű��
							ObservableList<Member> membersdel = membertableview.getSelectionModel().getSelectedItems();
								// ���̺� Ŭ���� ���� ������[������] ��������
							
							// ���õ� �л� ����
		//					membersdel.forEach(members :: remove);
								
							// 
							
							for(int i = 0 ; i < members.size(); i++) {
								if(members.get(i).id.equals(membersdel.get(0).id) ) {
									
									if(members.get(i).id.equals(loginid)) {
										members.remove(i); // ����
										membertableview.setItems(members); // ���̺� �ٽ� ����
										break;
									}
									else {
										alert.setContentText(" ��ȯ�� �����ϴ�. "); // ���â ����
										alert.setTitle("�˸�"); // ���â ���� 
										alert.setHeaderText("���� ����"); // ���â�� ����	
										alert.showAndWait();
										break;
									}
									// ��ü�л����� �ش��л��� ã����
									
								}
							}
						}
			
					}
					
					
					
					catch (Exception e) {
						// TODO: handle exception
					}
				});
				// �л� ���̺� 
				studenttableview = (TableView)parent.lookup("#studenttableview");
				
				tc = studenttableview.getColumns().get(0); // ù��° �� ȣ��
				tc.setCellValueFactory(new PropertyValueFactory("name"));
				
				tc = studenttableview.getColumns().get(1);
				tc.setCellValueFactory(new PropertyValueFactory("korean"));
				
				tc = studenttableview.getColumns().get(2); // ����° �� ȣ��
				tc.setCellValueFactory(new PropertyValueFactory("english"));
				
				tc = studenttableview.getColumns().get(3); // �׹�° �� ȣ��
				tc.setCellValueFactory(new PropertyValueFactory("math"));
				
				studenttableview.setItems(studentlist);
				
			Button btnrefresh = (Button)parent.lookup("#btnrefresh");
			
			btnrefresh.setOnAction(e5 -> {
				
				studenttableview.refresh();
				
			});
				
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("�л����� �������α׷�");
			stage.setResizable(false);
			stage.show();
			
//			Button btnlogout = (Button)parent.lookup("#btnlogout");
//			btnlogout.setOnAction(e4 -> {
//				
//				try {
//					btnlogout.getScene().getWindow().hide();
//					Stage stage1 = new Stage();
//					Parent parent1 = FXMLLoader.load(getClass().getResource("login.fxml"));
//					
//					Scene scene1 = new Scene(parent1);
//					stage1.setScene(scene1);
//					stage1.setTitle("�α���");
//					stage1.setResizable(false);
//					stage1.show();
//				}
//				catch (Exception e) {
//					// TODO: handle exception
//				}
//			});
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void reAction() {
		studenttableview.refresh();
	}
	
	
	// �α��� ��ư �޼ҵ�
	@FXML
	public void login() {
		
		int count = 0;
		
		for(int i = 0 ; i < memberlist.size(); i++) {
			if( loginid.getText().equals(memberlist.get(i).getId()) && loginpw.getText().equals(memberlist.get(i).getPw())) {
				count++;	
				String logid = loginid.getText(); // �α��� ������ ���̵� ����
					Date date = new Date(); // �α��� ������ �ֱ� ������ ����
					SimpleDateFormat format = new SimpleDateFormat("MM�� dd�� HH�� mm��");
					
					memberlist.get(i).setDate(format.format(date));
				loginmain(logid); // �޼ҵ忡 �μ��� �ѱ��
			}
		}
		if(count == 0) {
			Alert alert = new Alert(AlertType.INFORMATION);
			
			alert.setContentText(" ȸ�������� �����ϴ� "); // ���â ����
			alert.setTitle("�޽���"); // ���â ���� 
			alert.setHeaderText("�α��ν���"); // ���â�� ����
			alert.showAndWait();
			
			return;
		}
		
		
	}
	
	@FXML
	public void signup(ActionEvent event) {
		
		try {
			
			Stage stage= new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("signup.fxml"));
			
			Button btnsignup =(Button)parent.lookup("#btnsignup");
			
			// �͸�޼ҵ�
		//	btnsignup.setOnAction(e -> {               �����ڵ�                   });
			
			btnsignup.setOnAction(e -> {
				
				TextField id = (TextField) parent.lookup("#signid");
				TextField pw = (TextField) parent.lookup("#signpw");
				TextField name = (TextField) parent.lookup("#signname");
				
				// ���̵� , ��й�ȣ , �̸��� �Է� �������� 
				if(id.getText().equals("") || pw.getText().equals("") || name.getText().equals("")) {
					// ���â ���� Ŭ���� : Alert 
					Alert alert = new Alert(AlertType.INFORMATION);
					
						alert.setContentText(" �Է� �ȵ� ������ �ֽ��ϴ�. "); // ���â ����
						alert.setTitle("�޽���"); // ���â ���� 
						alert.setHeaderText("���Խ���"); // ���â�� ����
						alert.showAndWait();
						
						return;
						
				}
				
				// ���࿡ �ߺ��� ���̵� ������� 
				for(int i = 0 ; i < memberlist.size(); i++) {
					if( memberlist.get(i).id.equals(id.getText())) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						
						alert.setContentText(" ������� ���̵� �Դϴ�. \n �ٸ����̵� �Է����ּ��� "); // ���â ����
						alert.setTitle("�˸�"); // ���â ���� 
						alert.setHeaderText("���Խ���"); // ���â�� ����
						alert.showAndWait();
						
						return;
					}
				}
				
				Member temp = new Member(id.getText(), pw.getText(), name.getText());
				
				memberlist.add(temp);
				
				stage.close();
			});
			
			Button btnclose = (Button)parent.lookup("#btnclose");
			
			btnclose.setOnAction(e3 -> {
				
				stage.close();
				
			});
			
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("ȸ������");
			stage.setResizable(false);
			stage.show();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// �л��߰� ��ư�� Ŭ��������
	public void studentAction() {
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("studentadd.fxml"));
			
			Button btncancel = (Button)parent.lookup("#btncancel");
			btncancel.setOnAction(e1 -> {
				
				stage.close();
				
			});
			
				Button btnadd = (Button)parent.lookup("#btnadd");
				
				btnadd.setOnAction(e ->{
					
			
				TextField txtname = (TextField)parent.lookup("#txtname"); 
				TextField txtkorean = (TextField)parent.lookup("#txtkorean"); 
				TextField txtenglish = (TextField)parent.lookup("#txtenglish"); 
				TextField txtmath = (TextField)parent.lookup("#txtmath"); 
				
				Student temp = new Student(txtname.getText(), 
										   Integer.parseInt(txtkorean.getText()),
										   Integer.parseInt(txtenglish.getText()),
										   Integer.parseInt(txtmath.getText()));
				
				studentlist.add(temp);
				stage.close();
				
				});
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			
			stage.show();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

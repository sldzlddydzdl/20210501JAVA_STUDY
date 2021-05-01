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
		
		memberlist = FXCollections.observableArrayList(); // 메모리 할당
		studentlist = FXCollections.observableArrayList();
		
	}
	


	
	@FXML
	// 로그인 성공했을때
	public void loginmain(String loginid) {
		
		btnsignup.getScene().getWindow().hide();
		
		try {
			Stage stage = new Stage();
			Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
				// parent 클래스 : 해당 fxml 파일의 모든 레이아웃과 컨트롤 담고 있음[ fx:id]
				
				// 로그아웃
				Button btnlogout = (Button)parent.lookup("#btnlogout");
				btnlogout.setOnAction(e2 -> {
					
					stage.close(); // 해당 스테이지 종료
					Stage newstage = new Stage(); // 새 스테이지 생성
					
					newstage = (Stage)btnsignup.getScene().getWindow(); // 해당버튼이 존재하는 씬의 윈도우 가져오기
					
					try {
						newstage.show(); // 
					}
					catch (Exception e) {
						// TODO: handle exception
					}
				});
				
				// 회원 테이블 
				 membertableview = (TableView<Member>)parent.lookup("#membertableview");
				
				TableColumn tc = membertableview.getColumns().get(0); // 첫번째 열 호출
				tc.setCellValueFactory(new PropertyValueFactory("id"));
				
				tc = membertableview.getColumns().get(1);
				tc.setCellValueFactory(new PropertyValueFactory("name"));
				
				tc = membertableview.getColumns().get(2); // 두번째 열 호출
				tc.setCellValueFactory(new PropertyValueFactory("date"));
				
				
				membertableview.setItems(memberlist);
				
				// 회원 탈퇴
				Button btnmemberdel = (Button)parent.lookup("#btnmemberdel");
				
				btnmemberdel.setOnAction(e4 -> {
					try {
						
						Alert alert = new Alert(AlertType.CONFIRMATION);
						
						alert.setContentText(" 정말 탈퇴 하시겠습니까? "); // 경고창 내용
						alert.setTitle("알림"); // 경고창 제목 
						alert.setHeaderText("회원탈퇴"); // 경고창내 제목		
						
						Optional<ButtonType> result = alert.showAndWait();
							// ButtonType 클래스를 이용한 예[OK]/아니요[Cancle] 인식 
						if(result.get() == ButtonType.OK) {
							ObservableList<Member> members = membertableview.getItems(); // 전체학생
							// 현재 테이블 존재하는 아이템[데이터]를 리스트에 옮기기
							ObservableList<Member> membersdel = membertableview.getSelectionModel().getSelectedItems();
								// 테이블에 클릭된 행의 아이템[데이터] 가져오기
							
							// 선택된 학생 삭제
		//					membersdel.forEach(members :: remove);
								
							// 
							
							for(int i = 0 ; i < members.size(); i++) {
								if(members.get(i).id.equals(membersdel.get(0).id) ) {
									
									if(members.get(i).id.equals(loginid)) {
										members.remove(i); // 삭제
										membertableview.setItems(members); // 테이블값 다시 셋팅
										break;
									}
									else {
										alert.setContentText(" 권환이 없습니다. "); // 경고창 내용
										alert.setTitle("알림"); // 경고창 제목 
										alert.setHeaderText("삭제 실패"); // 경고창내 제목	
										alert.showAndWait();
										break;
									}
									// 전체학생에서 해당학생을 찾으면
									
								}
							}
						}
			
					}
					
					
					
					catch (Exception e) {
						// TODO: handle exception
					}
				});
				// 학생 테이블 
				studenttableview = (TableView)parent.lookup("#studenttableview");
				
				tc = studenttableview.getColumns().get(0); // 첫번째 열 호출
				tc.setCellValueFactory(new PropertyValueFactory("name"));
				
				tc = studenttableview.getColumns().get(1);
				tc.setCellValueFactory(new PropertyValueFactory("korean"));
				
				tc = studenttableview.getColumns().get(2); // 세번째 열 호출
				tc.setCellValueFactory(new PropertyValueFactory("english"));
				
				tc = studenttableview.getColumns().get(3); // 네번째 열 호출
				tc.setCellValueFactory(new PropertyValueFactory("math"));
				
				studenttableview.setItems(studentlist);
				
			Button btnrefresh = (Button)parent.lookup("#btnrefresh");
			
			btnrefresh.setOnAction(e5 -> {
				
				studenttableview.refresh();
				
			});
				
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.setTitle("학생점수 관리프로그램");
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
//					stage1.setTitle("로그인");
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
	
	
	// 로그인 버튼 메소드
	@FXML
	public void login() {
		
		int count = 0;
		
		for(int i = 0 ; i < memberlist.size(); i++) {
			if( loginid.getText().equals(memberlist.get(i).getId()) && loginpw.getText().equals(memberlist.get(i).getPw())) {
				count++;	
				String logid = loginid.getText(); // 로그인 성공한 아이디 저장
					Date date = new Date(); // 로그인 성공시 최근 접속일 저장
					SimpleDateFormat format = new SimpleDateFormat("MM월 dd일 HH시 mm분");
					
					memberlist.get(i).setDate(format.format(date));
				loginmain(logid); // 메소드에 인수로 넘기기
			}
		}
		if(count == 0) {
			Alert alert = new Alert(AlertType.INFORMATION);
			
			alert.setContentText(" 회원정보가 없습니다 "); // 경고창 내용
			alert.setTitle("메시지"); // 경고창 제목 
			alert.setHeaderText("로그인실패"); // 경고창내 제목
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
			
			// 익명메소드
		//	btnsignup.setOnAction(e -> {               실행코드                   });
			
			btnsignup.setOnAction(e -> {
				
				TextField id = (TextField) parent.lookup("#signid");
				TextField pw = (TextField) parent.lookup("#signpw");
				TextField name = (TextField) parent.lookup("#signname");
				
				// 아이디 , 비밀번호 , 이름을 입력 안했을때 
				if(id.getText().equals("") || pw.getText().equals("") || name.getText().equals("")) {
					// 경고창 띄우는 클래스 : Alert 
					Alert alert = new Alert(AlertType.INFORMATION);
					
						alert.setContentText(" 입력 안된 사항이 있습니다. "); // 경고창 내용
						alert.setTitle("메시지"); // 경고창 제목 
						alert.setHeaderText("가입실패"); // 경고창내 제목
						alert.showAndWait();
						
						return;
						
				}
				
				// 만약에 중복된 아이디가 있을경우 
				for(int i = 0 ; i < memberlist.size(); i++) {
					if( memberlist.get(i).id.equals(id.getText())) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						
						alert.setContentText(" 사용중인 아이디 입니다. \n 다른아이디를 입력해주세요 "); // 경고창 내용
						alert.setTitle("알림"); // 경고창 제목 
						alert.setHeaderText("가입실패"); // 경고창내 제목
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
			stage.setTitle("회원가입");
			stage.setResizable(false);
			stage.show();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	// 학생추가 버튼을 클릭했을때
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

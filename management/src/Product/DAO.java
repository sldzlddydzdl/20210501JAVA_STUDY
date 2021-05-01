package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DAO {

	Connection conn;
	
	public static DAO dao = new DAO();
	
	public static DAO getdao() {
		
		return dao;
	}
	
	public DAO() { // 생성자
		
		// DB 연동
		
		try {
			// 1. 사용하고 있는 db 회사의 드라이버 주소
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. 연결주소
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product" , "root" , "1234");
												// db 주소 : // 호스트명:포트번호/db명 , "계정명" , "비밀번호"
			System.out.println("db 연동 성공");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	// 제품을 저장하는 메소드
	public int addproduct(Product temp) {
		
		String sql = "insert into product values(?,?,?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
				// PreparedStatement : sql 제어 / 조작 인터페이스
			pstmt.setString(1, temp.pcode); // 첫번째 ? 에 값 대입
			pstmt.setString(2, temp.pname); // 두번째 ? 에 값 대입
			pstmt.setString(3, temp.pcategory); // 세번째 ? 에 값 대입
			pstmt.setString(4, temp.pprice); // 네번째 ? 에 값 대입
			
			pstmt.executeUpdate();
			return 1;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;
	}
	
	// 모든 제품을 호출 하는 메소드
	public ObservableList<Product> listproduct() {
		
		ObservableList<Product> list = FXCollections.observableArrayList(); // 리스트 생성
		
		String SQL = "select * from product ";
				// select 필드명[*:모든필드] from 테이블명 ;
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery(); // 쿼리 == 검색 결과
				// ResultSet : 쿼리 결과 연결 인터페이스
			
			while(rs.next()) { // 쿼리에서 다음결과 가져오기 [ 하나씩 호출 ]
				
				Product temp = new Product(); // 임시 제품 객체 생성
				
				temp.setPcode(rs.getString(1)); // 임시객체의 쿼리 결과 첫번째 필드 저장하기
				temp.setPname(rs.getString(2)); // 임시객체의 쿼리 결과 두번째 필드 저장하기
				temp.setPcategory(rs.getString(3)); // 임시객체의 쿼리 결과 세번째 필드 저장하기
				temp.setPprice(rs.getString(4)); // 임시객체의 쿼리 결과 네번재 필드 저장하기
				
				list.add(temp); // 임시객체를 리스트에 담기
				
			}
			
			return list;
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		
	}
	
	
	
}

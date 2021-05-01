package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO { // DB 연동 하는 클래스
	
	Connection conn; // db 연결 인터페이스 선언
	
	public static DAO dao = new DAO(); // 자기 자신의 객체 선언 => 생성자[ db 연동 ]
	
	public static DAO getdao() { // db 객체 호출
		
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
	
	
	
	
}

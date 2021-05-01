package Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO { // DB ���� �ϴ� Ŭ����
	
	Connection conn; // db ���� �������̽� ����
	
	public static DAO dao = new DAO(); // �ڱ� �ڽ��� ��ü ���� => ������[ db ���� ]
	
	public static DAO getdao() { // db ��ü ȣ��
		
		return dao;
	}
	
	public DAO() { // ������
		
		// DB ����
		
		try {
			// 1. ����ϰ� �ִ� db ȸ���� ����̹� �ּ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. �����ּ�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product" , "root" , "1234");
												// db �ּ� : // ȣ��Ʈ��:��Ʈ��ȣ/db�� , "������" , "��й�ȣ"
			System.out.println("db ���� ����");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public int addproduct(Product temp) {
		
		String sql = "insert into product values(?,?,?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
				// PreparedStatement : sql ���� / ���� �������̽�
			pstmt.setString(1, temp.pcode); // ù��° ? �� �� ����
			pstmt.setString(2, temp.pname); // �ι�° ? �� �� ����
			pstmt.setString(3, temp.pcategory); // ����° ? �� �� ����
			pstmt.setString(4, temp.pprice); // �׹�° ? �� �� ����
			
			pstmt.executeUpdate();
			return 1;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;
		
		
	}
	
	
	
	
}

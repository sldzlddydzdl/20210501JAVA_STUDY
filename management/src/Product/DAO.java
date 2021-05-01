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
	
	// ��ǰ�� �����ϴ� �޼ҵ�
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
	
	// ��� ��ǰ�� ȣ�� �ϴ� �޼ҵ�
	public ObservableList<Product> listproduct() {
		
		ObservableList<Product> list = FXCollections.observableArrayList(); // ����Ʈ ����
		
		String SQL = "select * from product ";
				// select �ʵ��[*:����ʵ�] from ���̺�� ;
		try {
			
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery(); // ���� == �˻� ���
				// ResultSet : ���� ��� ���� �������̽�
			
			while(rs.next()) { // �������� ������� �������� [ �ϳ��� ȣ�� ]
				
				Product temp = new Product(); // �ӽ� ��ǰ ��ü ����
				
				temp.setPcode(rs.getString(1)); // �ӽð�ü�� ���� ��� ù��° �ʵ� �����ϱ�
				temp.setPname(rs.getString(2)); // �ӽð�ü�� ���� ��� �ι�° �ʵ� �����ϱ�
				temp.setPcategory(rs.getString(3)); // �ӽð�ü�� ���� ��� ����° �ʵ� �����ϱ�
				temp.setPprice(rs.getString(4)); // �ӽð�ü�� ���� ��� �׹��� �ʵ� �����ϱ�
				
				list.add(temp); // �ӽð�ü�� ����Ʈ�� ���
				
			}
			
			return list;
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
		
	}
	
	
	
}

package application;

public class Member {

	// �ʵ�
	String id;
	String pw;
	String name;
	String date;
	// ������
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(String id, String pw, String name) {
		this.id = id;
		this.name = name;
		this.pw = pw;
	}

	
	// �޼ҵ�
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	
}

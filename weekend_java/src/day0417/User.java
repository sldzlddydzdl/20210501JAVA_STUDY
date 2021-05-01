package day0417;

public class User {
	private String name;
	private int age;
	private int id;
	
	public User(String name, int age, int id) {
//		super(); // Object 객체 호출
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.id == ((User)obj).id);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + age + id;
	}
}

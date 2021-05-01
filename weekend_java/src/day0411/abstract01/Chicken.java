package day0411.abstract01;

public class Chicken extends Animal{
	
	public Chicken(String name) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String isFried() {
		String s = "ㄴㄴ";
		return s;
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println(name + "꼬끼오~~!");
	}
}

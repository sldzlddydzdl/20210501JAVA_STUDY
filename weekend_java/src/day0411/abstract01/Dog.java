package day0411.abstract01;

public class Dog extends Animal{

	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println(name + "는 멍멍!");
	}
	
	
}

package day0411.abstract01;

// 추상 클래스를 상속받은 아이는 반드시 추상 메서드를 override 해야함.
// the type Lion must implement the inherited abstract method Animal.bark()
public class Lion extends Animal{
	
	public Lion(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void hunt() {
		System.out.println(name + "가 사냥을 합니다.");
	}
	
	@Override
	public void bark() {
		System.out.println("사자는 야옹야옹!!");
	}
	
	
}

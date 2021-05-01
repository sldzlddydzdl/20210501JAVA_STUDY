package day0411.abstract01;

import java.util.Iterator;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a;
//		a = new Animal(); // 추상클래스는 객체로 만들 수 없다.
	
		Lion lion = new Lion("사자");
		lion.bark();
		
		Dog dog = new Dog("개");
		dog.bark();
		
		Chicken chicken = new Chicken("깐부");
		chicken.bark();
		System.out.println("후라이드됨?" + chicken);
		
		//부모로 객체들을 묶을 수 있음.
		//다형성!! polymolphism
		Animal[] animalArray = new Animal[3];
		animalArray[0] = lion;
		animalArray[1] = dog;
		animalArray[2] = chicken;
	
		
		for(Animal an : animalArray)
			an.bark();
		
		// 사자에 있는 hunt(), chicken에 있는 isFried() 는 부모에 없다
		// 따라서 부모 자료형으로는 사용이 안됨.
		// 그러면 어쩌지???????????????
		// 자식 자료형으로 변경해서 써야함.
		// 다운캐스팅을 해서 씀.
		System.out.println("------------------------------------");
		Lion l1 = (Lion)(animalArray[0]);
		lion.hunt();
		
		Chicken c1 = (Chicken)(animalArray[2]);
		System.out.println("후라이드됨???" + c1.isFried());
		
		// animalArray[1] 에는 dog가 있는데 Lion
//		Lion l2 = (Lion)(animalArray[1]);
//		l2.hunt();
		
		// 변수 안에 들어있는 인스턴스가 실제로 어떤 자료형인지 학인하는 방법!
		if(animalArray[1] instanceof Lion) {
			Lion l2 = (Lion)(animalArray[1]);
			l2.bark();
		}else if(animalArray[1] instanceof Chicken) {
			Chicken c2 = (Chicken)(animalArray[1]);
			c2.bark();
		}else if(animalArray[1] instanceof Dog) {
			Dog d2 = (Dog)(animalArray[1]);
			d2.bark();
		}
		
		
		
	}
}

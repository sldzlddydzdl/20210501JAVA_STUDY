package day0410.inheritance04.objectEx;

public class PersonTest {
	// 우리가 만드는 모든 클래스는 Object라는 클래스를 상속받았음!!
	// 
	public static void main(String[] args) {
		Person p = new Person("짱구" , 10);
		Person p2 = new Person("짱구" , 10);
		
		if(p.equals(p2)) {
			// p와 p2는 같은가?
			System.out.println("p는 p2와 같다");
		}
		
		if(p == p2) {
			System.out.println("p는 p2와 같다");
		}
		
		String name = "짱구";
		String name1 = new String("짱구");
		// 동등성, 동일성
		// 동일성은 똑같은애야
		// 동등성은 쌍둥이느낌? 비슷한느낌
	
		if(name.equals(name1)) { // 동등성
			System.out.println("name과 name1은 같다!");
		}
		else {
			System.out.println("name과 name1은 다르다!");
		}
		
		if(name == name1) { // 동일성
			System.out.println("name==name1은 같다");
		}
		
		p.hashCode(); // 동일성을 비교할 때 씀.
		p.toString();
		
		System.out.println(p); // p의 toString()메서드를 내부적으로 호출한다.
		System.out.println(p2);// p2의 toString()메서드를 내부적으로 호출한다.
		
		
		
	}
}

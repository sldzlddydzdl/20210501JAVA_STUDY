package day0328.classEx01;

public class CarTest {

	public static void main(String[] args) {
		// Car 라는 객체 두개를 만들자
		// 인스턴스 
		// Car의 인스턴스라고 표현한다.
		// 스택 변수 힙 객체
		Car c1 = new Car(); 
		c1.name = "아이오닉5";
		c1.color = "파랑";
		
		Car c2 = new Car();
		c2.name = "모닝";
		c2.color = "빨강"; 
		
		Car c3; 
		c3 = c2;
		c3.color = "검정";
		
		System.out.println(c2.color); // 검정
		System.out.println(c3.color); // 검정
		
		// 객체는 언제 소멸하는가?
		// gc(가비지컬렉터)라는 아이가 삭제해준다. 언제?
		// 객체에 연결된 아이가 하나도 없을 때!
		c1 = null; // 이러면 객체는 하나가 남게된다. ( -> 객체와 연결고리를 끊는다. )
		
		c2 = null;  
		System.out.println("c2 = null 후");
		System.out.println(c3.name); 
		
		
		
	}

}

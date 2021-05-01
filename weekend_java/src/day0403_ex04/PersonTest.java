package day0403_ex04;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사람이름 , 차 이름 , 차 가격 , 폰이름 , 폰브랜드, 폰 가격, 신발 브랜드, 신발 사이즈, 신발 가격
		// 여러사람에 대한 데이터를 넣자.
		
		System.out.println("입력할 사람의 수를 넣으세요.");
		
		int N = sc.nextInt();
		
		Person[] people = new Person[N];
		
		for(int i = 0 ; i < people.length; i++) {
			people[i] = new Person();
			people[i].car = new Car();
			people[i].phone = new Phone();
			people[i].shoes = new Shoes();
			
			System.out.println(" 이름을 입력하세요. ");
			String personName = sc.next();
			
			System.out.println(" 차 이름을 입력하세요.");
			String carName = sc.next();
			
			System.out.println("차 가격을 입력하세요");
			int carPrice = sc.nextInt();
			
			System.out.println("휴대폰 브랜드를 입력하세요");
			String phoneBrand = sc.next();
			
			System.out.println("휴대폰의 모델명을 입력하세요");
			String phoneName = sc.next();
			
			System.out.println("휴대폰의 가격을 입력하세요");
			int phonePrice = sc.nextInt();
			
			System.out.println("신발의 브랜드를 입력하세요");
			String shoesName = sc.next();
			
			System.out.println("신발의 사이즈를 입력하세요");
			String shoesSize = sc.next();
			
			System.out.println("신발의 가격을 입력하세요");
			int shoesPrice = sc.nextInt();
			
			// 입력받은 데이타를 객체에 담아준다.
			people[i].name = personName;
			people[i].car.name = carName;
			people[i].car.price = carPrice;
			people[i].phone.name = phoneName;
			people[i].phone.brand = phoneBrand;
			people[i].phone.price = phonePrice;
			people[i].shoes.brand = shoesName;
			people[i].shoes.size = shoesSize;
			people[i].shoes.price = shoesPrice;
		}// for문 끝
		
		for(Person p : people) {
			if("가렌".equals(p.name) ) {
				System.out.println(p.name + "의 폰은 " +p.phone.name);
				System.out.println("브랜드 : " + p.shoes.brand);
				System.out.println("가격 : " + p.shoes.price);
			}
		}
		
		
		// 사용자로부터 찾고싶은 사람의 이름을 입력받는다.
		
		while(true) {
			System.out.println("찾고싶은 사람의 이름을 입력해주세요 (그만찾고싶으면 2번을 입력해주세요) ");
			String name = sc.next();
			
			if(name.equals("2")) {
				break;
			}
			else {
				for(Person p : people) {
					if(p.name.equals(name)) {
						// 찾고자 하는 사람의 정보
						p.PrintInfo();
					}
					else {
						System.out.println(name + "이라는 사람은 없습니다.");
						break;
					}
				}
			}
		}
		
		/*
		김동현
		제니시스
		130000000
		노트10
		삼성
		100000
		나이키
		270
		50000
		
		강호동
		마티즈
		23000000
		아이폰
		애플
		134043
		뉴밸런스
		260
		1350000
		*/
		
		/*
		Person p1 = new Person();
		p1.car = new Car();
		p1.phone = new Phone();
		p1.shoes = new Shoes();
		
		// 사용자로부터 입력받자
		// 이름을 입력받기
		System.out.println(" 이름을 입력하세요. ");
		String personName = sc.next();
		
		System.out.println(" 차 이름을 입력하세요.");
		String carName = sc.next();
		
		System.out.println("차 가격을 입력하세요");
		int carPrice = sc.nextInt();
		
		System.out.println("휴대폰 브랜드를 입력하세요");
		String phoneBrand = sc.next();
		
		System.out.println("휴대폰의 모델명을 입력하세요");
		String phoneName = sc.next();
		
		System.out.println("휴대폰의 가격을 입력하세요");
		int phonePrice = sc.nextInt();
		
		System.out.println("신발의 브랜드를 입력하세요");
		String shoesName = sc.next();
		
		System.out.println("신발의 사이즈를 입력하세요");
		String shoesSize = sc.next();
		
		System.out.println("신발의 가격을 입력하세요");
		int shoesPrice = sc.nextInt();
		
		p1.name = personName;
		p1.car.name = carName;
		p1.car.price = carPrice;
		p1.phone.name = phoneName;
		p1.phone.brand = phoneBrand;
		p1.phone.price = phonePrice;
		p1.shoes.brand = shoesName;
		p1.shoes.size = shoesSize;
		p1.shoes.price = shoesPrice;
		
		if("가렌".equals(p1.name) ) {
			System.out.println(p1.name + "의 폰은 " +p1.phone.name);
		}
		*/
	}

}

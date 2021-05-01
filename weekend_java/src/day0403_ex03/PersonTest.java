package day0403_ex03;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사람이름 , 차 이름 , 차 가격 , 폰이름 , 폰브랜드, 폰 가격, 신발 브랜드, 신발 사이즈, 신발 가격
		
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
	}

}

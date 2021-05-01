package day0417;

public class UserTest {
	public static void main(String[] args) {
		// Object 클래스 -> java.lang 패키지 안에 있다.
		Object o = new Object();
		User u1 = new User("빈센조", 30, 100 );
		User u2 = new User("빈센조", 30, 101 );
		User u3 = new User("빈센조", 30, 101 );
		
		System.out.println("u1:\t" + u1.toString());
		System.out.println("u2:\t" + u2.toString());
		
		if(u2 == u3) System.out.println("u2 == u3 동일하다.");
		else 		 System.out.println("u2 == u2 동일하지 않다.");
		if(u2.equals(u3)) System.out.println("u2== u3 동일하다.");
		else 			  System.out.println("u2 == u2 동일하지 않다.");	
		
		String str1 = new String("빈센조");
		String str2 = new String("빈센조");
		
		if(str1 == str2) System.out.println("str1 == str2 는 같다");
		else 			 System.out.println("str1 == str2 는 다르다");
		if(str1.equals(str2))System.out.println("str1 == str2 는 같다");
		else			     System.out.println("str1 == str2 는 다르다");
	}
}

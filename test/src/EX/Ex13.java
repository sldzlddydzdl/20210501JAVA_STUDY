package EX;

public class Ex13 {

	public static void main(String[] args) {
		
		// 배열 변수 -> 참조 변수
		// 참조 reference 
		int[] numbers = new int[5];
		int[] copy;
		
		numbers[0] = 100;
		numbers[1] = 90;
		numbers[2] = 80;
		numbers[3] = 70;
		numbers[4] = 60;
		
		// copy 에 복사
		copy = numbers;
		// -> 실제로 배열객체는 한개만 만들어 졌다.!
		
		System.out.println("copy = numbers 후");
		System.out.println("copy[0] : " + copy[0]); // 100
		System.out.println("numbers[0] : " + numbers[0]); // 100
		System.out.println("copy[3] : " + copy[3]); // 70
		System.out.println("numbers[3] : " + numbers[3]); // 70
		
		System.out.println("----------------------------------");
		copy[2] = 0;
		numbers[3] = 0;
		System.out.println("copy[2] = 0 대입 후");
		System.out.println(" copy[2] : " + copy[2] ); // 0
		System.out.println("numbers[2] : " + numbers[2]); // 80예상했으나. 0
		System.out.println("copy[3] : " + copy[3]);
		
		// copy 와 numbers 는 주소를 공유하므로
		// copy[2] = 0; 을 넣으면
		// numbers[2] 에도 0 이 대입된다.
		
		int[] copy1 = new int[5];
		copy1[0] = numbers[0];
		copy1[1] = numbers[1];
		copy1[2] = numbers[2];
		copy1[3] = numbers[3];
		copy1[4] = numbers[4];
		
		// 주소의 복사 : 얕은복사 shallow copy 
		// 값들의 복사 : 깊은복사 deep copy
		
		
	}
}

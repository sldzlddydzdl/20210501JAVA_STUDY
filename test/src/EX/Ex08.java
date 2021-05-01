package EX;

public class Ex08 {

	public static void main(String[] args) {

		//반복문
		//while
		//형식
		//while(조건식){
//			조건식이 참일때 실행할 문장1
//			조건식이 참일때 실행할 문장2
		//}
		// 조건식이 false가 될 때까지 반복해서 실행한다.
		
		//" 안녕하세요 저는 자바입니다. " 라는 문장을 5번 출력해보세요!
		
		int i = 0; // 반복계수
		while(i < 5) { // 조건식
			System.out.println("안녕하세요 나는 라바입니다.");
		
			i++; // 계수의 증가
		}
		System.out.println("코드 종료!");
	}
}

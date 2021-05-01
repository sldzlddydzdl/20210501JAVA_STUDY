package day0410.acessemodify.singleton;

public class MySingleTonClassTeset {
	public static void main(String[] args) {
		
		Math.random(); // 애네는 static 으로 만들어져서 바로쓸쑤잇다.
		MySingleTonClass m1 = MySingleTonClass.getInstance();
		m1.sum(10, 20);
		
		MySingleTonClass m2 = MySingleTonClass.getInstance();
		m2.sum(20, 30);
		
		
	}
}

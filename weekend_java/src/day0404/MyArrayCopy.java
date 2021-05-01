package day0404;

public class MyArrayCopy {
	
	// 배열1 { 10, 20, 30, 40, 50, 60 }
	// int 형 배열을 깊은 복사하여 int형배열 반환하는 메서드
	
	
	// int 형 배열을 얕은 복사하여 반환하는 메서드
	
	// 구현해보세요.
	
	int[] DeepCopy(int[] a) {
		int[] newnumbers = new int[a.length];
		
		for(int i = 0 ; i < newnumbers.length; i++) 
			newnumbers[i] = a[i];
	
		// 주소 반환 
		return newnumbers;
	}
	
	int[] ShallowCopy(int[] a) {
		int[] s;
		s = a;
		
		return s;
	}
	
	// int 형 배열을 깊은 복사하여 int형배열 반환하느 메서드(객체가 서로 생김)
	int[] deepCopyArray(int[] ori) {
		// 매개변수로 받은 배열을 새 배열에 복사해서 반환해준다.
		int[] copyArray = new int[ori.length];
		
		for(int i = 0 ; i < ori.length; i++) {
			copyArray[i] = ori[i];
		}
		return copyArray;
	}
	
	// int 형 배열을 얕은 복사하여 반환하는 메서드(참조 주소를 복사)
	int[] shallowCopy(int[] ori) {
		int[] copyArray = ori;
		return copyArray;
	}
	
	
}

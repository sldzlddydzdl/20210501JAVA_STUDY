package day0417;

public class StringBufferEx01 {
	public static void main(String[] args) {
		String str = "하이";
		str += "!!!!"; // 자동적으로 new 해서 다른객체로 대입하게된다
		////////////// 객체 2개만듬
		
		
		
		////////// 객체 하나만 만듬
		StringBuffer sb = new StringBuffer();
		sb.append("하이");
		sb.append("!!!");
		
		String s = sb.toString();

		System.out.println(s);
		
		sb.insert(2, new char[]{'a','b','c'});
		System.out.println(sb);
		
		sb.insert(2, "abc");
		
		System.out.println(sb);
	}
}

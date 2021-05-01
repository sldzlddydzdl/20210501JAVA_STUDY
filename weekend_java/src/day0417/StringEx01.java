package day0417;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEx01 {
	public static void main(String[] args) {
		// String 문자열을 다루는 클래스
		// 
		String str1 = "abcdefghijklmnop";
		
		// 대문자 변경
		System.out.println("toUpperCase후 : " + str1.toUpperCase());
		
		// 소문자 변경
		System.out.println("toLowerCase후 : " + str1.toLowerCase());
		
		// 첫번째 문자만 대문자로 변경해서 출력!
		String lowerStr = str1.toLowerCase();
		char[] lowerArray = lowerStr.toCharArray();
		lowerArray[0] -= 32; // ( 'a' - 'A' )
		System.out.println(new String(lowerArray));
		for(char c : lowerArray)
			System.out.print(c);
		
		System.out.println();
		
		// 문자열의 특정 위치에 접근하는 메소드
		System.out.println(str1.charAt(5));
		
		// 특정 문자의 위치는?????????
		System.out.println(str1.indexOf('g'));
		
		
		
		String str2 = "귀여운 뚜루루 뚜루 바닷속 뚜루루 뚜루";
		System.out.println("뚜루루 뚜루 : " + str2.indexOf("뚜루루 뚜루"));
		System.out.println("뚜루루 뚜루 : " + str2.indexOf("뚜루루 뚜루" , 5));
		
		String str3 = "아기 상어 뚜 루루 뚜루 귀여운 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 아기 상어 엄마 상어 뚜 루루 뚜루 어여쁜 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 엄마 상어! 아빠 상어 뚜 루루 뚜루 힘이 센 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 아빠 상어! 할머니 상어 뚜 루루 뚜루 자상한 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 할머니 상어! 할아버지 상어 뚜 루루 뚜루 멋있는 뚜 루루 뚜루 바닷속 뚜 루루 뚜루 할아버지 상어! 우리는 뚜 루루 뚜루 바다의 뚜 루루 뚜루 사냥꾼 뚜 루루 뚜루 상어 가족! 상어다 뚜 루루 뚜루 도망쳐 뚜 루루 뚜루 도망쳐 뚜 루루 뚜루 숨자! 으악! 살았다 뚜 루루 뚜루 살았다 뚜 루루 뚜루 오늘도 뚜 루루 뚜루 살았다 휴! 신난다 뚜 루루 뚜루 신난다 뚜 루루 뚜루 춤을 춰 뚜 루루 뚜루 노래 끝 오예!";
		
		// "뚜 루루 뚜루" 는 총 몇번 나오는가?
		
		Integer s = str3.indexOf("뚜 루루 뚜루");;
		Integer new_s =0;
		int cnt = 1;
		while(new_s != str3.lastIndexOf("뚜 루루 뚜루")) {
			new_s = str3.indexOf("뚜 루루 뚜루", s+1);
			if(s != new_s) {
				s = new_s;
				cnt++;
			}
		}
		
		System.out.println("뚜루루 뚜루 는 총 " + cnt + " 개 있습니다.");
		
		String[] str4 = str3.split("뚜 루루 뚜루");
		int str4_amount_length = 0;
		for(String str : str4) {
	//		System.out.println(str);
			str4_amount_length += str.length();
		}
		
		String str5 = "뚜 루루 뚜루";
		System.out.println(str5.length());
		System.out.println(str4_amount_length);
		System.out.println((str3.length() - str4_amount_length)/7);
		
		
		String searchWord = "뚜 루루 뚜루";
		int f = -1;
		int cnt3 = 0;
		while((f=str3.indexOf(searchWord, f+1)) != -1) {
			cnt3++;
		}
		System.out.println(cnt3);
		
		// 문자열 추출
		String phone = "010-1009-1009";
		// 01010091009
		// substring(시작index, 끝index(미포함));
		String phoneNumber = phone.substring(0 , 3);
		phoneNumber += phone.substring(4,8);
		phoneNumber += phone.substring(9);
		System.out.println("폰 번호 : " + phoneNumber);
		
		
		// 앞뒤 공백 제거
		// 아이디 입력, 비밀번호 입력할때.
		String str6 = "     Im groot     ";
		System.out.println("공백 제거 전 : " + str6);
		System.out.println("공백 제거 후 : " + str6.trim());
		
		// 문자열 교체
		// 뚜 루루 뚜루 -> 그랑죠
		System.out.println("글자 교체");
		
//		str3.replaceAll(/* 정규식 */, /*문자열 */)
		
		// 정규식 예제 
		//https://epthffh.tistory.com/entry/%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8-%EC%A0%95%EA%B7%9C%EC%8B%9D
		System.out.println(str3.replace("뚜 루루 뚜루", "그랑죠"));
		
		
		System.out.println("--------------------------------------------------");
		
		// 숙제!! 집에서.
		// <div>와 </div> 사이의 글자를 추출하여 출력
		// <div>와 </div> 사이의 글자가 무엇이 올지 모른다는 가정
		// <div>와 </div> 밖에도 다른 글자가 섞여있을 수 있음.
		String str_1 = "<div>안녕하세요</div>";
		String str_2 = "<div>Im groot Im groot</div>";
		String str_3 = "<html><section><div>hello world!!!</div></section></html>";
		String[] strArr = new String[3];
		strArr[0] = str_1;
		strArr[1] = str_2;
		strArr[2] = str_3;
		
//		Pattern pattern = Pattern.compile("[<div>](0-9a-zA-Z)[</div>]");
//		
//		Matcher matcher = pattern.matcher(str_1);
//		
//		while(matcher.find()) {
//			System.out.println(matcher.group(1));
//			
//			if(matcher.group(1) == null)break;
//		}
//		
//		matcher = pattern.matcher(str_2);
//		
//		while(matcher.find()) {
//			System.out.println(matcher.group(1));
//			
//			if(matcher.group(1) == null)break;
//		}
//		
//		matcher = pattern.matcher(str_3);
//		
//		while(matcher.find()) {
//			System.out.println(matcher.group(1));
//			
//			if(matcher.group(1) == null)break;
//		}
		
		// 강사님 풀이
		// substring
		
		String beginStr = "<div>";
		String endStr =   "</div>";
		for(int i = 0 ; i < strArr.length; i++) {			
			int beginIndex = strArr[i].indexOf(beginStr) + beginStr.length();
			int endIndex = strArr[i].indexOf(endStr);
			System.out.println(strArr[i].substring(beginIndex,endIndex));
		}
		
//		System.out.println(str_1.substring(5,10));
//		System.out.println(str_2.substring(5,22));
//		System.out.println(str_3.substring(20,str_1.length() - 23));
		
//		System.out.println(str_1.substring(5,10));
//		System.out.println(str_2.substring(5,22));
//		System.out.println(str_3.substring(20,str_1.length() - 23));
		
//		tcp school
		
		
		
		
		
		
	}

}

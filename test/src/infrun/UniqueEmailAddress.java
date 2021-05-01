package infrun;

import java.util.*;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {
							"test.email+james@coding.com",
							"test.e.mail+toto.jane@coding.com",
							"testemail+tom@cod.ing.com"}; 
		
		int s = numUniqueEmails(input);
		System.out.println(s);
		
	}
	
	
	public static int numUniqueEmails(String[] emails){
		
		/* 나의풀이
		//List<String> list = new ArrayList<>();
		Set<String> Set = new HashSet<>();
		String[] result = new String[emails.length];
		
		for(int i = 0 ; i < result.length; i++) {
			result[i] = "";
		}
		
		for(int i = 0 ; i < emails.length; i++) {
			for(int j = 0 ; j < emails[i].length(); j++) {	
				
			}
		}
		
		int s = emails[0].indexOf("@");
		System.out.println(s);
		
		for(int i = 0; i < emails.length; i++) {
			for(int j = 0; j < emails[i].indexOf("@"); j++) {
				
				
				
				if(emails[i].charAt(j) == '.') {
					
					
				}
				else if(emails[i].charAt(j) == '+') {
				//	result[i].substring(j,j);
					break;
				}
				else {
					result[i] += emails[i].charAt(j);
				}	
	
			}
			
			for(int k = emails[i].indexOf("@"); k < emails[i].length(); k++ ) {
				result[i] += emails[i].charAt(k);
			}	
		}
		
		for(String qwe : result)
			System.out.println(qwe);
		
		
		for(int i =0 ; i < result.length; i++) {
			Set.add(result[i]);
		}
				
		return Set.size();
		*/
		
		// 강의
		Set<String> set = new HashSet<>();
		
		for(String email : emails) {
			String localName = makeLocalNames(email); 
			String domainName = makeDomainNames(email);
			set.add(localName+"@"+domainName);
		}
		
		return set.size();
		
	 }
	
	private static String makeDomainNames(String email) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < email.length(); i++) {
			
			if(email.charAt(i) == '.') {
				continue;
			}
			if(email.charAt(i) == '+') {
				break;
			}
			if(email.charAt(i)== '@') {
				break;
			}
			
			String str = String.valueOf(email.charAt(i));
			sb.append(str);
			
			
		}
		
		return sb.toString();
	}
	
	
	private static String makeLocalNames(String email) {
		return email.substring(email.indexOf('@')+1);
	}
		
	

}

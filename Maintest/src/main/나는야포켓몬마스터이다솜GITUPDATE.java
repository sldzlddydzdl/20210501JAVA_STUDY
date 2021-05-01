package main;

import java.util.*;

public class 나는야포켓몬마스터이다솜GITUPDATE {
	
	// 2021. 4. 15.
		// 입력
//		첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 내가 맞춰야 하는 문제의 개수 M이 주어져.
//		N과 M은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수인데, 자연수가 뭔지는 알지? 
//		모르면 물어봐도 괜찮아. 나는 언제든지 질문에 답해줄 준비가 되어있어.
//	
//		둘째 줄부터 N개의 줄에 포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 한 줄에 하나씩 입력으로 들어와.
//		포켓몬의 이름은 모두 영어로만 이루어져있고, 또, 음... 첫 글자만 대문자이고, 
//		나머지 문자는 소문자로만 이루어져 있어. 포켓몬 이름의 최대 길이는 20이야. 
//		그 다음 줄부터 총 M개의 줄에 내가 맞춰야하는 문제가 입력으로 들어와. 
//		문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 
//		포켓몬 번호에 해당하는 문자를 출력해야해. 입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, 
//		N보다 작거나 같고, 입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어져. 그럼 화이팅!!!
	
		// 출력
//		첫째 줄부터 차례대로 M개의 줄에 각각의 문제에 대한 답을 말해줬으면 좋겠어!!!. 
//		입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을, 
//		문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력하면 돼. 그럼 땡큐
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 포켓몬의 이름 N개 만큼 입력
		String[] pocketmon = new String[N];
		for(int i = 0 ; i < pocketmon.length; i++) {
			 pocketmon[i] = sc.next();
		}
		
		// 맞춰야할 포켓몬의 이름 M개 입력
		String[] output = new String[M];
		for(int i = 0 ;i  <output.length; i++) {
			output[i] = sc.next();
		}
		
		// 이름입력 -> index 출력 맵 과 , index 입력 -> 이름 출력 맵 생성
		Map<String, Integer> name_map = new HashMap<>();
		Map<String, String> index_map = new HashMap<>();
		
		for(int i= 0 ; i < pocketmon.length; i++) {
			name_map.put(pocketmon[i], i+1);
		}
		
		for(int i = 0 ; i < pocketmon.length; i++) {
			index_map.put(Integer.toString(i+1), pocketmon[i]);
		}
		
		// 아무것도없으면 그냥 지나가고 문자열이 입력되면 몇뻔재 입력했는지 출력
		// 몇번째 폰스터인지 숫자 입력하면 그에대한 몬스터이름 출력 
		for(int i = 0 ; i < output.length; i++) {
			if(name_map.get(output[i]) == null) {
				
			}
				
			if(name_map.get(output[i]) != null)
				System.out.println(name_map.get(output[i]));
			
			if(index_map.get(output[i]) == null) {
				
			}
				
			if(index_map.get(output[i]) != null)
				System.out.println(index_map.get(output[i]));
			
		}
		
	}

}

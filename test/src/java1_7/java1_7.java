package java1_7;

import java.util.ArrayList;
import java.util.Scanner;

public class java1_7 {

	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Member> memberlist = new ArrayList<>();
	static ArrayList<Account> accountlist = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
				System.out.println(" ** 회원가입 창 ** ");
				System.out.println("1.회원가입 2.로그인 3.비밀번호찾기 4. 종료");
				System.out.print(" 선택 : ");
				int ch = sc.nextInt();
				
				if(ch == 1) {
					member();
				}
				
				if(ch == 2) {
					login();
				}
				
				if(ch == 3) {
					findpw();
				}
				
				if(ch == 4) {
					System.out.println(" 이용해 주셔서 감사합니다.");
					break;
				}
		}
	}

	public static void member() {
		Member temp = new Member();
		System.out.println(" *** 회원가입 창 *** ");
		System.out.print(" 생성할 아이디를 입력하세요 : ");
		String newid = sc.next();
		temp.id = newid;
		System.out.print(" 생성할 비밀번호를 입력하세요 : ");
		String newpw = sc.next();
		temp.pw = newpw;
		System.out.print(" 이름을 입력하세요 : ");
		String newname = sc.next();
		temp.name = newname;
		
		memberlist.add(temp);
	}
	
	public static void login() {
		int j = 0;
		System.out.println(" *** 로그인 창 *** ");
		System.out.print(" 로그인할 아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print(" 로그인할 비밀번호를 입력하세요 : ");
		String pw = sc.next();
		
		for(int i =0; i <memberlist.size(); i++) {
			if(memberlist.get(i).id.equals(id)) {
				if(memberlist.get(i).pw.equals(pw)) {
					System.out.println(" *** 로그인 성공 *** ");
					System.out.println("\n\n");
					membermenu(i);	
				}	
			
				j = i;
			
			}
		}
		
		if(!memberlist.get(j).id.equals(id)) {
			System.out.println("아이디가 틀렷습니다.");
		}
		
		else if(!memberlist.get(j).pw.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}
	
	public static void findpw() {
		System.out.print(" 찾으실 비밀번호의 이름을 입력하세요 : ");
		String findname = sc.next();
		int j = 0;
		
		for(int i = 0 ; i < memberlist.size(); i++) {
			if(memberlist.get(i).name.equals(findname)) {
				System.out.println(memberlist.get(i).name + " 님의 비밀번호는 : " + memberlist.get(i).pw + " 입니다.");
			}
			
			j  = i;
		}
		
		if(!memberlist.get(j).name.equals(findname)) {
			System.out.println(findname + " 으로 된 아이디는 존재하지않습니다. ");
		}
		
	}
	
	public static void membermenu(int k ) {
		while(true) {
			System.out.println(" *** 계좌생성 창 *** ");
			System.out.println(" 1.계좌생성 2.입금 3.출금");
			System.out.println(" 4.잔고   5.종료");
			System.out.print(" 선택 : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				makeaccount(k);
			}
			
			if(ch == 2) {
				input(k);
			}
			
			if(ch == 3) {
				output(k);
			}
			
			if(ch == 4) {
				extra();
			}
			
			if(ch == 5) {
				System.out.println(" 계좌생성 메뉴에서 나갑니다.");
				break;
			}
		}
		
	}
	
	public static void makeaccount(int k) {
		System.out.println(memberlist.get(k).name + " 님 반갑습니다.");
		
		Account temp1 = new Account();
		System.out.println(" *** 회원가입 창 *** ");
		System.out.print("생성할 계좌 번호를 입력하세요 : ");
		String newaccount = sc.next();
		for(int i =0 ; i < accountlist.size(); i++) {
			if(accountlist.get(i).ano.equals(newaccount)) {
				System.out.println(" 이미 있는 계좌번호입니다.");
			}
		}
		temp1.ano = newaccount;
		System.out.print("생성할 계좌 번호의 비밀번호를 입력하세요 : ");
		String newpw = sc.next();
		temp1.apw = newpw;
		
		temp1.money = 0;
		
		accountlist.add(temp1);
		
	}
	
	public static void input(int k ) {
		int s = 0;
		System.out.println(memberlist.get(k).name + " 님 반갑습니다.");
		
		System.out.print("입금할 계좌를 입력해주세요 : ");
		String accnum = sc.next();
		
		System.out.print("입금할 계좌번호의 비밀번호를 입력해주세요 : ");
		String accpw = sc.next();
		
		for(int i = 0 ; i < accountlist.size(); i++) {
			if(accountlist.get(i).ano.equals(accnum)) {
				if(accountlist.get(i).apw.equals(accpw)) {
				System.out.print("입금할 금액을 입력하세요 : ");
				int inputmoney = sc.nextInt();
				
				accountlist.get(i).money += inputmoney;
				System.out.println("입금이 완료되었습니다.");
				
				}
			}
			
			s = i;
		}
		
		if(!accountlist.get(s).ano.equals(accnum)) {
			System.out.println(" 계좌번호가 틀렸습니다. ");
		}
		else if(!accountlist.get(s).apw.equals(accpw)) {
			System.out.println(" 계좌번호의 비밀번호가 틀렸습니다.");
		}
		
		
		
		
	}
	
	public static void output(int k) {
		int s = 0;
		System.out.print("출금할 계좌의 번호를 입력해주세요 : ");
		String accnum = sc.next();
		
		System.out.print("출금할 계좌번호의 비밀번호를 입력해주세요 : ");
		String accpw = sc.next();
		
		for(int i = 0 ; i < accountlist.size(); i++) {
			if(accountlist.get(i).ano.equals(accnum)) {
				if(accountlist.get(i).apw.equals(accpw)) {
					System.out.print("출금할 금액을 입력해주세요 : ");
					int outputmoney = sc.nextInt();
					
					if(accountlist.get(i).money < outputmoney) {
							System.out.println("잔고가모자릅니다. [입금을먼저해주세요]");
					}
					else {
							accountlist.get(i).money -= outputmoney;
							System.out.println(" 출금 성공 ");
					}
					
				}
			}
			
			s = i;
			
		}
		
		if(!accountlist.get(s).ano.equals(accnum)) {
			System.out.println(" 계좌번호가 틀렸습니다. ");
		}
		else if(!accountlist.get(s).apw.equals(accpw)) {
			System.out.println(" 계좌번호의 비밀번호가 틀렸습니다.");
		}
		
		
	}
	
	public static void extra() {
		for(int i = 0; i < accountlist.size(); i++) {
			System.out.println(accountlist.get(i).ano + "의 계좌에는 " + accountlist.get(i).money + " 만큼의 돈이있습니다.");
		}
	}
	/*
	바로  if(!string.equlas("문자열")



			ex ) 



			if(!str1.equals("AA")){

			System.out.println("AA가 아닙니다");

			}

	*/

			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



package prac2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("총학생 수를 입력해주세요");
		int N = sc.nextInt();
		Student[] array = new Student[N];
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = new Student();
			array[i].score = new Score();
			
			System.out.println("학생 이름을 입력해주세요");
			array[i].name = sc.next();
			System.out.println("학생 나이를 입력해주세요");
			array[i].age = sc.nextInt();
			
			System.out.println("국어점수를 입력해주세요");
			array[i].score.kor = sc.nextInt();
			
			System.out.println("영어점수를 입력해주세요");
			array[i].score.eng = sc.nextInt();
			
			System.out.println("수학점수를 입력해주세요");
			array[i].score.math = sc.nextInt();
		}
		
		for(Student s : array) {
			double avg =  (double)((s.score.kor + s.score.eng + s.score.math)/3);
			df.format(avg);
			System.out.println("학생의 이름 : " + s.name);
			System.out.println("학생 나이 : " + s.age);
			System.out.println("학생의 점수 평균 : " +avg);
			System.out.println();
		}
		
		double mathscore = 0;
		double engscore = 0;
		double korscore = 0;
		for(Student s : array) {
			 mathscore += ((double)s.score.math);
			 engscore += ((double)s.score.eng);
			 korscore += (double)s.score.kor;
		}
		
		double mathavg = (mathscore / array.length);
		double engavg = (engscore / array.length);
		double koravg = (korscore / array.length);
		
		System.out.println("전체학생의 수학평균은 : " + df.format(mathavg));
		System.out.println("전체학생의 영어평균은 : " + df.format(engavg));
		System.out.println("전체학생의 국어평균은 : " + df.format(koravg));
		
	}
	
}

package prac2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("���л� ���� �Է����ּ���");
		int N = sc.nextInt();
		Student[] array = new Student[N];
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = new Student();
			array[i].score = new Score();
			
			System.out.println("�л� �̸��� �Է����ּ���");
			array[i].name = sc.next();
			System.out.println("�л� ���̸� �Է����ּ���");
			array[i].age = sc.nextInt();
			
			System.out.println("���������� �Է����ּ���");
			array[i].score.kor = sc.nextInt();
			
			System.out.println("���������� �Է����ּ���");
			array[i].score.eng = sc.nextInt();
			
			System.out.println("���������� �Է����ּ���");
			array[i].score.math = sc.nextInt();
		}
		
		for(Student s : array) {
			double avg =  (double)((s.score.kor + s.score.eng + s.score.math)/3);
			df.format(avg);
			System.out.println("�л��� �̸� : " + s.name);
			System.out.println("�л� ���� : " + s.age);
			System.out.println("�л��� ���� ��� : " +avg);
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
		
		System.out.println("��ü�л��� ��������� : " + df.format(mathavg));
		System.out.println("��ü�л��� ��������� : " + df.format(engavg));
		System.out.println("��ü�л��� ��������� : " + df.format(koravg));
		
	}
	
}

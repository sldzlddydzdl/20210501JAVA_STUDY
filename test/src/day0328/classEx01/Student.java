package day0328.classEx01;

import java.text.DecimalFormat;

public class Student {

	String name;
	int age , kor , eng, math;
		
	public Student(String name, int age, int kor, int eng, int math) {
		
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void show() {
		DecimalFormat df = new DecimalFormat("#.##");
		double avg = (float)(kor+eng+math)/3;
		
		
		System.out.println("�̸�" +"\t" + "����" + "\t" + "�����" 
							+ "\t" + "�����" + "\t" +  "���м���" + "\t" + "���");
		System.out.println(name +"\t" + age + "\t" + kor 
				+ "\t" + eng + "\t" +  math + "\t" + df.format(avg));
	}	
}
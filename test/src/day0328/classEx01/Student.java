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
		
		
		System.out.println("이름" +"\t" + "나이" + "\t" + "국어성적" 
							+ "\t" + "영어성적" + "\t" +  "수학성적" + "\t" + "평균");
		System.out.println(name +"\t" + age + "\t" + kor 
				+ "\t" + eng + "\t" +  math + "\t" + df.format(avg));
	}	
}

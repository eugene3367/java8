package sec2;

import java.util.Scanner;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	Scanner scanner = new Scanner(System.in);
	
	public Student(){}
	public Student(String name){this.name=name;}
	public Student(String name, int kor, int eng, int mat){ this.name=name; this.kor=kor; this.eng=eng; this.mat=mat; }
	
	
	
	public int calcTot(){
		System.out.print("이름: ");
		name=scanner.next();
		System.out.print("국어점수 : ");
		kor=scanner.nextInt();
		System.out.print("영어점수 : ");
		eng=scanner.nextInt();
		System.out.print("수학점수 : ");
		mat=scanner.nextInt();
		tot=kor+eng+mat;
		return tot;
	}
	public double calcAvg(){
		avg=tot/3;
		return avg;
	}
	public void calcHak(){
		
		if(this.avg>=90){
			System.out.println("A");
		}else if(this.avg>=80){
			System.out.println("B");
		}else if(this.avg>=70){
			System.out.println("C");
		}else{
			System.out.println("D");			
		}
	}
	public void calcRes(){
		if(this.avg>=80){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
	}
	
	

}
package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student(){}
	public Student(String name){this.name=name;}
	public Student(String name, int kor, int eng, int mat){ this.name=name; this.kor=kor; this.eng=eng; this.mat=mat; }
	
	public int calcTot(){
		return kor+eng+mat;
	}
	public int calcAvg(){
		return this.calcTot()/3;
	}
	public String calcHak(){
		if(this.calcAvg()>=90){
			this.calcHak()=A;
		}else if(this.calcAvg()>=80){
			System.out.println("B");
		}else if(this.calcAvg()>=70){
			System.out.println("C");
		}else{
			System.out.println("D");			
		}
		return this.calcHak();
	}
	public int calcRes(){
		if(this.calcAvg()>=80){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
		return this.calcRes();
	}
	
	

}

package sec2;

public class Student_teacher {
	String name;
	int kor;
	int eng;
	int mat;
	
	public Student_teacher() { }
	public Student_teacher(String name){ this.name = name; }
	public Student_teacher(String name, int kor, int eng, int mat) {
		this.name = name;		this.kor = kor;
		this.eng = eng;		this.mat = mat;
	}
	
	public int calcTot(){
		int tot = kor+eng+mat; 
		return tot;
	}
	public double calcAvg(){
		double avg = (float) (Math.round((kor+eng+mat)/3*100)/100); 
		return avg;
	}
	public String calcHak(){
		String hak="";
		double avg = this.calcAvg();
		if(avg>=90) {
			hak="A";
		} else if(avg>=80){
			hak="B";
		} else if(avg>=70){
			hak="C";
		} else {
			hak="D";
		}
		return hak;
	}
	public String calcRes(){
		double avg = this.calcAvg();
		String res = "불합격";
		if(avg>=80) res="합격";
		return res;
	}
}
package sec2;

public class Student {
	public int sno;
	public String sname;
	public Student(){}
	public Student(int sno){this.sno = sno;}
	public Student(int sno, String name) {
		this.sno = sno;
		this.sname = name;
	}
	
	public void finalize(){
		System.out.println("소멸");
	}
	

}

package sec2;

public class Strudent_teacher_Ex {
	public static void main(String[] args) {
		Student_teacher st1 = new Student_teacher("김기태", 90,80,90);
		System.out.println("이름\t총점\t평균\t학점\t판정");
		System.out.println(st1.name+"\t"+st1.calcTot()+"\t"+st1.calcAvg()+"\t"+st1.calcHak()
				+"\t"+st1.calcRes());
	}
}
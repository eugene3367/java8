package sec4;

public class StudentEx {
	public static void main(String[] args) {
		
		ElementaryStudent el1 = new ElementaryStudent();
		el1.name = "김기태";
		el1.jum1 = 90;
		el1.jum2 = 80;
		el1.jum3 = 90;

		System.out.println("이름\t총점\t평균");
		System.out.println(el1.name+"\t"+el1.computeTot(90, 80, 90)
				+"\t"+el1.computeAvg(90, 80, 90));
		
	}
}
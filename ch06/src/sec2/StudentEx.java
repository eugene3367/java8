package sec2;

public class StudentEx {

	public static void main(String[] args) {
		/*고유진, 90, 80, 90을 객체의 필드값으로 입력받아 이름, 총점, 평균, 학점, 판정을 출력하도록 한다*/
		
		Student student1 = new Student("고유진",90,80,90);
		System.out.println(student1.calcTot());
		System.out.println(student1.calcAvg());
//		student1.calcHak();
//		student1.calcRes();

	}

}

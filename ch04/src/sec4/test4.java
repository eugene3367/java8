package sec4;

public class test4 {

	public static void main(String[] args) {
		/* while문과 Math,random()메소드를 이용해서 두개의 주사위를 던졌을때 나오는 눈을(눈1, 눈2)
		 * 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 먼추는 코드를 작성해보세요.
		 * 눈의 합이 5가 되는 조합은 (1,4),(4,1),(2,3),(3,2)입니다.
		 * (6,4)
		 * (3,6)
		 * (6,4)
		 * (3,2) 
		 */

		/*int a=0,b=0;
		
		while(a+b!=5){
			System.out.println("눈1:"+a+" 눈2:"+b);
			a = (int) Math.random();
			b = (int) Math.random();

		}
		*/
		int a=0, b=0;
		while(a+b!=5){
		a = (int) (Math.random()*6)+1;	//1-6 까지의 임의의 수, Math.random() : 0-10까지의 임의의 수
		b = (int) (Math.random()*6)+1;
		System.out.println("("+a+", "+b+")");
		}


		

	}

}











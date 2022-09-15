package sec4;

public class Ex8 {

	public static void main(String[] args) {
		/* 이중 for문을 활용하여 아래와 같은 형태의 구구단을 출력해라
		 * 
		 *  2*1=2  3*1=3,...........9*1=9
		 *  2*2=4  3*2=6,...........9*2=18
		 *  ..............................
		 *  2*9=18 ,................9*9=81
		 */
		
		for(int i=1;i<=9;i++){
			for(int k=2;k<=9;k++){
				System.out.print(k+"*"+i+"="+k*i+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("수열 팩토리얼의 합계 출력");
		//결과 : 1!+2!+3!+4!+5!+6!+7!+8!+9!+10!
		
		int tot=1;
		long hap=0;
		for(int i=1;i<=10;i++){
			tot*=i;
			hap+=tot;
		}
		System.out.println("곱 : "+tot+", 합: "+hap);

	}

}

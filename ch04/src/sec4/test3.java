package sec4;

public class test3 {

	public static void main(String[] args) {
		
		/* 2번
		 * double 타입은 변수타입으로 사용할 수 없다.
		 * 1.6이하는 byte, char, short, int, long 기준변수의 타입이 가능
		 * 1.7 이상에서는 String 기준변수의 타입이 추가됨
		 * 
		 */
		
		int tot = 0;
		for(int i = 0;i<=100;i+=3){
			tot+=i;
		}
		System.out.println("3의 배수의 합 : "+tot);
			
		tot=0; //틀림..
		for(int i=0;i<=100;i++){
			if(i%3==0)
			tot+=i;
		}
		System.out.println("3의 배수의 합 3: "+tot);
		
		tot=0;
		for(int i=0;i<=100;i++){
			if(i%3!=0) continue;
			tot+=i;
		}
		System.out.println("3의 배수의 합 4: "+tot);
		

	}

}

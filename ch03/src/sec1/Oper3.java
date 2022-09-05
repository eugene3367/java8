package sec1;

public class Oper3 {

	public static void main(String[] args) {
		// 문자열 결합
		byte a = 'K', b = 'i', c = 'm';
		int d = 1004;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println(a+b+c+1004);	//뭄자의 연산 결과는 숫자
		System.out.println("kim"+d); //문자열 결합
		//증감연산자
		int k=1, l=1, m=1, n=1;
		System.out.println();
		System.out.println(k++); //-> k를 먼저 출력한 후 1 증감 -> 후위연산
		System.out.println(k);
		System.out.println(++l); //-> 증감을 먼저한후 l출력 -> 전위연산
		System.out.println(l);
		System.out.println(m--); //-> m 먼저 출력 후 1 감소 -> 후위연산
		System.out.println(m);
		System.out.println(--n); //-> 감소를 먼저한후 n출력 -> 전위연산
		System.out.println(n);
		//대입연산자
		int p=20, r=30;
//		p = p+1;	//p++, ++p
		p+=2;	// p = p+2, 2씩 증가	->22
		r-=2;	// r = r-2, 2씩 감소	->28
		System.out.println(p);
		System.out.println(r);
		p*=2;	//p= p*2 ->44
		r/=2;	//r= r/2 ->14
		System.out.println(p);
		System.out.println(r);
		
		
		

	}

}

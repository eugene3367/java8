package sec1;

// 10진수를->n진수 : 정수부분은 n으로 나누기, 소수점 아래는 n곱하기

public class Oper5 {

	public static void main(String[] args) {
		//비트(2진) 연산
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);	// ~은 not
		h = c ^ d;	//배타적 OR(eXclusive OR) : 입력이 서로 다를때 1을출력
		System.out.println("c & d -> " + e);	//2진수 and
		System.out.println("c | d -> " + f);	//2진수 or
		System.out.println("~(c & d) -> " + g);	//2진수 보수 (보수: 보충할수 있는 수)
		System.out.println("c ^ d -> " +(c ^ d));	//
		System.out.println("d >> 2 -> "+(d >> 2));	//오른쪽쉬프트, 나누기2가 두번됨
		System.out.println("d << 2 -> "+(d << 2));	//왼쪽쉬프트 , 곱하기2가 두번됨
		System.out.println("d >>> 2 -> "+(d >>> 2));	//오른쪽 이중쉬프트 
		System.out.println("d <<< 2는 존재하지 않음 ");	//왼쪽 이중쉬프트는 연산자가 없음
		//연산시 부정과 불능 그리고 예외처리
//		System.out.println(a / 0);	//Not a Number -> Nan
//		System.out.println("k" / 0);
//		System.out.println('k' / 4);
//		System.out.println(a % 0);	//Infinity	->(불능)
		try {	//예외처리
			//실행해야할 구문
			System.out.println(a / 0);
		} catch(ArithmeticException e1){	//실행해야할 구문이 요류 발생시 처리해야할 내용
			System.out.println("산술연산에 오류가 존재함");
			//e1.PrintStackTrace();
		}				
	}

}

package sec2;

public class Cast2 {

	public static void main(String[] args) {
		int a=100, b=23, c;
		float d, e, f;
		c = a / b;	//4	-> 자동 형 변환
		System.out.println("c = "+c);
		d = (float) a / b;	//4.0	-> (float)는 형 변환 연산자 : 강제 형 변환
		System.out.println("d = "+d);
		e = 500 / 3.0f;	// 3	-> 3.0f로 형 변환 연산
		System.out.println("e = "+e);
		System.out.println("byte : "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
		System.out.println("Short : "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
		System.out.println("int : "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);	//고정소수점수
		System.out.println("long : "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
		System.out.println("float : "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);	//E38 10의 38승, 부(뜰부)동소수점수
		System.out.println("double : "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);

	}

}

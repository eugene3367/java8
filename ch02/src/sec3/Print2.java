package sec3;

public class Print2 {

	public static void main(String[] args) {
		int a = 100;
		float b = 3.14f;
		String c = "고유진";
		System.out.printf("반지름이 %d인 원은 원주율 %f를 반영하여 원의 넓이가 %f임." + "%s의규칙", a, b, a*a*b, c);	//데이터형식에 맞추기
		System.out.printf("%n10진수 %d는 8진수로 %o임", a, a);
		System.out.printf("%n10진수 %d는 16진수로 %x임", a, a);
	}

}

package sec2;
//throws는 예외 떠넘기기
public class Throw1 {

	public static void main(String[] args) {
		String name = null;
		nullPassing(name);
		
		
		
	}
	static void nullPassing (String data) throws NullPointerException{
		System.out.println(data);
	}

}

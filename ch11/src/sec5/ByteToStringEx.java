package sec5;

public class ByteToStringEx {

	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 101, 32, 121, 111, 117};
//		String str = bytes.toString();
		String str = new String(bytes);
		System.out.println(str);

	}

}

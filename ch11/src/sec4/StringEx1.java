package sec4;

public class StringEx1 {
	public static void main(String[] args){
		String str1 = new String("KoEugene");
		
		System.out.println("str1= "+str1);
		System.out.println("네번째 글자 : "+str1.charAt(3));
		System.out.println("문자열 비교 : "+str1.equals("koeugene"));
	}

}
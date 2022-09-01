package sec1;

public class Var03 {

	public static void main(String[] args) {
		
		//primitive(원시) type(기본 자료형) : 하나의 데이터만 저장가능한 구조
		boolean a=true; //논리형
		//정수
		byte b=20, c=127; // 1byte(8bit = 2의 8승  - 256가지)-> -128 ~ +127 까지 
		//; 범위 외가 되면 언더플로우(배고픔), 오버플로우(만취)
		short d=6450;	// 2byte(16bit = 2의 16승  - 65536가지)-> -32768 ~ +32767까지
		//공식 : 2의 (n-1)승 ~ 2의 (n-1)승 - 1
		int e=65000;	// 4byte(32bit = 2의 32승 - 
		long f=650000;	// 8byte(64bit = 2의 64승 -
		//실수
		float g=3.14f;	// 4byte(32bit)
		double h=3.14;	// 8byte(64bit)
		//문자/문자열
		char i='k';		//2byte(16bit)
		
		
		String j="Ko";	//문자열을 넣은 만큼

	}

}

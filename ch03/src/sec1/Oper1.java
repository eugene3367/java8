package sec1;
//프로그램의 (Operation) 모든 명령은 Op-code(연산자)와 Operand(피연산자)로 이루어짐
//주소(기억장소의 개수)에 따라 0주소 명령어 형식 ~ 3주소 명령어 형식이 존재 /  그 이상은 불가능
//a = a +b ; -> 제 2주소 명령/ a+ bc -> 제3주소 명령
//+ : 연산(명령) -> Op-code
//a, b -> operand 

//입력항에 따라 단항 연산(unary)과 이항 연산(binary)으로 분류됨
//boolean a=true;
//boolean b=!a; -> 단항연산
//int c=a*b; -> 이항연산

//연산의 종류에 따라 산술, 논리, 비교, 비트, 증감, 대입 연산 등이 있음

public class Oper1 {

	public static void main(String[] args) {
		int a=20, b=30, c;	//b에 30을 저장한다는 뜻
		System.out.println(a);
		prt(); // -> 제 0주소 명령
		
		c = a + b;
		//운용방식1 : +ab -> pre(fix) order 전위
		//운용방식2 : ab+ -> post(fix) order 후위
		//운용방식3 : a+b -> in(fix) order 중위
		
	}
	public static void prt(){
		System.out.println("data");
	}

}

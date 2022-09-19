package sec1;

public class MemberEx {

	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자함수();
		Member mem1 = new Member();
		mem1.setId("kyj");
		mem1.setPassword("1234");
		System.out.println("아이디 :"+mem1.getId());
		System.out.println("비밀번호 : "+mem1.getPassword());
		System.out.println("이름 : "+mem1.getName());		//참조변수이기때문에 null값으로 초기화
		Member mem2 = new Member();
		
		System.out.println();
		mem2.setId("kdh");
		mem2.setPassword("3456");
		System.out.println("아이디2 : "+mem2.getId());
		
		System.out.println();
		Member mem3 = new Member("kbw","3456","뱅톨");
		System.out.println("아이디3 : "+mem3.getId());
		System.out.println("비밀번호3 : "+mem3.getPassword());
		System.out.println("주소3 : "+mem3.getName());
		
		System.out.println();
		MemberController mc = new MemberController();
		mc.join("kkt","1004","김기태");
		mc.info();
		mc.login("kkt","1004");
		mc.info();

	}

}

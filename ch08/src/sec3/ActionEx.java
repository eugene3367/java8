package sec3;

public class ActionEx {

	public static void main(String[] args) {
		Action action = new Action(){
			
			@Override
			public void work(){
				System.out.println("복사를 합니다.");
			}
		};//익명 구현 객체
		action.work();
	}

}

package sec2;

public class CellPhoneEx {

	public static void main(String[] args) {
		CellPhone p1 = new CellPhone();
		p1.poweron();
		p1.bell();
		p1.hangIn();
		p1.sendVoice("여보세요~!");
		p1.recieveVoice("저 고유진이라고 하는데요~! 대훈잉 있어요~?");
		p1.hangout();
		p1.poweroff();
		

	}

}

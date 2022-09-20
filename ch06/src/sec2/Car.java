package sec2;

public class Car {
	String name;	//멤버 필드 : 객체(인스턴스)가 가지는 특성을 저장
	String fuel;
	int cc;
	int speed;
	final static int MAX_SPEED = 500;	//멤버상수 final 수정못하게 static 값이 움직이지 말라고
	final static int MIN_SPEED = 0;		//멤버상수 : 값이 한 곳에 저장되어 더이상 바뀌지 않음
	
	//접근제한자 수정자 데이터타입 필드명;
	
	//생성자함수
	public Car(){}
	public Car(String name){ this.name = name; }
	public Car(String name, String fuel){ this(name,fuel,1000);}
	public Car(String name, String fuel, int cc){ this(name, fuel, cc, 0);}
	public Car(String name, String fuel, int cc, int speed){
		this.name = name;this.fuel = fuel;this.cc = cc;this.speed = speed;}
	
	//생성자(Constructor)함수 : 객체를 만드는 함수로서 클래스명과 동일해야함 
	//[접근제한자] 클래스명(데이터타입 매개변수,...){}
	//this - 현재 객체, this() = 생성자 함수
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	/* 메서드(Method) : 객체의 활동, 객체의 행위, 객체가 가지는 기능을 기술하는 것
	 * [접근제한자] 반환타입  메서드명([데이터타입 매개변수]){ 활동/행위/기능 } ;반환타입이 없으면 void쓰기
	 * getter Method(게터 메서드) : 현재 객체의 속성(멤버필드)에 저장된 데이터값을 가져오기
	 * setter Method(세터 메서드) : 현재 객체의 속성(멤버필드)에 값을 저장하기
	 */
	
	public void bootUp(){
		System.out.println("시동을 켭니다.");
	}
	
	public void bootOff(){
		System.out.println("시동을 끕니다.");
	}
	
	public int speedUp(){	//반환 타입이 int이므로 return 해주어야 하는 것은 정수(int)이어야함
		System.out.println("엑셀레이터를 밟습니다.");
		if(this.speed<this.MAX_SPEED){
		this.speed = this.speed + 10;
		}
		return this.speed;
	}
	
	public int speedDown(){
		System.out.println("브레이크를 밟습니다.");
		if(this.speed>this.MIN_SPEED){
			this.speed = this.speed-10;
		}
		return this.speed;
	}
	
	public int speedInfo(){
		return speed;
	}
	
	public void speedPrint(){
		System.out.println("현재속도: "+this.speed);
	}
	
	public String fuelInfo(){
		return fuel;
	}

}












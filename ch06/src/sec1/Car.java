package sec1;

public class Car {
	String company;
	String model;
	private String color;
	private int maxSpeed;
	int speed = 200;
	int rpm;
	
	Body body;
	Engine engene;
	Tire tire;
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Engine getEngene() {
		return engene;
	}
	public void setEngene(Engine engene) {
		this.engene = engene;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}

	
	
	
	
	
}

package sec1;

public class ClassEx1 {

	public static void main(String[] args) {
		

	}

}

class AnimalList<T extends>



class LandAnimal{
	public void crying(){
		System.out.println("육지동물");
	}
}

class Cat extends LandAnimal{

	@Override
	public void crying() {
		System.out.println("야옹야옹");
	}
	
	
}
class Dog extends LandAnimal{

	@Override
	public void crying() {
		System.out.println("멍멍");
	}
	
}
class Birds extends LandAnimal{

	@Override
	public void crying() {
		System.out.println("짹쨱");
	}
	
}
package sec3;

public class SoundableEx {

	public static void main(String[] args) {
		printsound(new Cat());
		printsound(new Dog());
		

	}

	private static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
		
	}

}

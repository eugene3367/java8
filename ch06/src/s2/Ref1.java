package s2;

public class Ref1 {

	public static void main(String[] args) {
		
		String[] names = {"kim","lee","park"};
		System.out.println(names);
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
			System.out.println(names.length);
		}
		System.out.println("------------------------------");
		System.out.println("---------java 5 이상------------");
		for(String name : names){
			System.out.println(name);
		}

	}

}

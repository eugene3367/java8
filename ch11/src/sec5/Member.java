package sec5;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name){
		this.id = id;
		this.name = name;
	}

	public String Member(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.id);
		sb.append(this.name);
		String nick = sb.toString();
		return nick;

	}
}

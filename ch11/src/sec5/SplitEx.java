package sec5;

import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		//방법1 (split()) 메소드 이용)
		String[] infos = str.split(",");
		
		for(String info : infos){
			System.out.println(info);
		}
		
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str,",");

	}

}

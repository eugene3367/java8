package sec2;

import java.util.Scanner;

public class Board {
	int num;
	String title;
	String content;
	String name;
	String date;
	
	Scanner scanner = new Scanner(System.in);
	
	

	
	
	public Board(int num, String title, String content, String name, String date) {

		this.num = num;
		this.title = title;
		this.content = content;
		this.name = name;
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void boardWrite(){
		System.out.print("글번호 : ");
		num=scanner.nextInt();
		System.out.println("글제목 : ");
		title=scanner.next();
		System.out.println("글내용 : ");
		content=scanner.next();
		System.out.println("작성자 : ");
		name=scanner.next();
		System.out.println("작성일 : ");
		date=scanner.next();
	}
	
	public void boardUpdate(){
		
	}
	
	

}

package sec2;

import java.util.Date;
import java.util.Scanner;

public class Board {
	private int num;
	private String title;
	private String content;
	private String name;
	private Date date;
	
	Scanner scanner = new Scanner(System.in);
	
	

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
//	public Board(){}
	
//	public Board(int num,String title){this.num=num;this.title=title;}

//	public Board(int num,String title,String content,String name){
//		this.num=num;this.title=title;this.content=content;this.name=name;
//	}
	
	public void boardWrite(int num, String title, String content, String name, Date date) {

		this.num = num;
		this.title = title;
		this.content = content;
		this.name = name;
		this.date = date;
	}
	
//	public void boardWrite(){
//		System.out.print("글번호 : ");
//		num=scanner.nextInt();
//		System.out.print("글제목 : ");
//		title=scanner.next();
//		System.out.print("글내용 : ");
//		content=scanner.next();
//		System.out.print("작성자 : ");
//		name=scanner.next();
//		System.out.print("작성일 : ");
//		date=scanner.next();
//	}
	
	public void boardUpdate(int num,String title,String content){
		if(num==this.num){
			this.title=title;
			this.content=content;
			
			
		}
//		this.num=num;this.title=title;this.content=content;
		}
	
//	public void boardUpdate(){
//		System.out.print("내용 수정:");
//		content=scanner.next();
//
//	}
	
	public void boardDelete(int num){
		if(num==this.num){
			
//			try{
//				this.finalize();
//			}catch(Throwable e){
//				e.printStackTrace();
//			}
			
			this.title="";
			this.content="";
			this.name="";
		}
		}
	
	
//	public void boardDelete(){
//		content=null;
//		System.out.println("글삭제");
//	}
	
	public void boardSearch(int num){
		if(num==this.num){
			System.out.println(this.num+"\t"+this.title+"\t"+this.content+"\t"+this.name+"\t"+this.date+"\t");
		}
	}
	
	
//	public void boardSearch(){
//		System.out.println(this.content);
//	}
	

}
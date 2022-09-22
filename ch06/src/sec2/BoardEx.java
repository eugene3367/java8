package sec2;

import java.util.Date;
import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Board[] board = new Board[100];
		for(int i=0;i<board.length;i++){	//객체의 배열은 선언 및 초기화가 필요
			board[i] = new Board();
		}
		
		boolean sw = true;	//작업 계속 여부
		int cnt = 0;		//배열의 개수 카운트
		
		while(sw){
			System.out.println("작업번호 입력 : ");
			int oper = sc.nextInt();

			String title;
			String content;
			String name;
			switch(oper){
				case 1:
					System.out.println("***입력작업***");
					System.out.println("제목 : ");
					title = sc.next();
					System.out.println("내용 : ");
					content = sc.next();
					System.out.println("작성자 : ");
					name = sc.next();
					Date date = new Date();
					board[cnt].boardWrite(cnt, title, content, name, date);
					cnt++;
					break;
				case 2:
					System.out.println("***수정작업***");
					System.out.println("글번호: ");
					cnt = sc.nextInt();
					System.out.println("제목: ");
					title = sc.next();
					System.out.println("내용: ");
					content = sc.next();
					for(int a=0;a<=cnt;a++){
						board[a].boardUpdate(cnt, title, content);
					}
					break;
				case 3:
					System.out.println("***삭제작업***");
					System.out.println("글번호 : ");
					cnt=sc.nextInt();
					for(int a=0;a<=cnt;a++){
						board[a].boardDelete(cnt);
					}
					break;					
				case 4:
					System.out.println("***검색작업***");
					System.out.println("글번호: ");
					cnt = sc.nextInt();
					for(int a=0;a<=cnt;a++){
						board[a].boardSearch(cnt);
					}
					break;
				case 5:
					System.out.println("프로그램 종료");
					sw=false;
			}
		}		
		sc.close();
				
		
		
		
//		Board board1 = new Board();
//		
//		System.out.println("1. 글쓰기 |2. 글수정|3. 글삭제|4. 글검색");
//		
//		String oper= "";
//		oper=scanner.next();
//		switch(oper){
//			case "1":
//				board1.boardWrite();
//				System.out.println("1. 글쓰기 |2. 글수정|3. 글삭제|4. 글검색");
//				oper=scanner.next();
//				
//			case "2":
//				board1.boardUpdate();
//				System.out.println("1. 글쓰기 |2. 글수정|3. 글삭제|4. 글검색");
//				oper=scanner.next();
//			case "3":
//				board1.boardDelete();
//				System.out.println("1. 글쓰기 |2. 글수정|3. 글삭제|4. 글검색");
//				oper=scanner.next();
//			case "4":	
//				board1.boardSearch();
//				System.out.println("1. 글쓰기 |2. 글수정|3. 글삭제|4. 글검색");
//				oper=scanner.next();
//			
//		
//		}
//		

		
		
	}

}
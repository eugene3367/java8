package sec2;

import java.util.Scanner;

public class ProductEx{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product pro1 = new Product();
		pro1.setPid ("a01");
		pro1.setPname("냉장고");
		pro1.setAmount(3);
		pro1.setPrice(80000);
		pro1.setImg("icetank01.jbp");
		
		Product pro2 = new Product();
		System.out.println("제품코드");
		pro2.setPid(sc.next());
		System.out.println("제품명");
		pro2.setPname(sc.next());
		System.out.println("제품수량");
		pro2.setAmount(sc.nextInt());
		System.out.println("제품가격");
		pro2.setPrice(sc.nextInt());
		System.out.println("이미지");
		pro2.setImg(sc.next());
		
		
		System.out.println("*입고처리*");
		System.out.println("제품코드\t제품명\t제품수량\t제품가격\t이미지");
		System.out.println(pro2.getPid()+"\t"+pro2.getPname()+"\t"+pro2.getAmount()+"\t"+pro2.getPrice()+"\t"+pro2.getImg()+"\t");
		
		
		System.out.println("금액 : "+pro1.calcMoney());
		System.out.println("등급 : "+pro1.calcRank());
		pro1.printProduct();
	}

}

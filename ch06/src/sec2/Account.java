package sec2;

import java.util.Scanner;

public class Account {
	String num;
	String name;
	int balance;
	int money=0;
	final static int MIN_MONEY=0;
	
	Scanner scanner= new Scanner(System.in);
	
	
	
	
	
	public Account(String num, String name, int balance) {
		this.num = num;
		this.name = name;
		this.balance = balance;
		
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	public int runDeposit(){
		System.out.print("입금 : ");
		money=scanner.nextInt();
		balance+=money;
		return this.money;
	}
	public int runWithdraw(){
		System.out.print("출금 : ");
		money=scanner.nextInt();
		if(this.money>Account.MIN_MONEY){
			balance-=money;
	}
		return this.money;
	}
	public void runBalance(){
		System.out.println("잔액 : "+this.balance+"원");
	}
	public void printAccount(){
		System.out.println("*계좌정보*");
		System.out.println("계좌번호 : "+this.num+", 계좌주 : "+this.name+", 잔액 : "+this.balance);
	}
	

}

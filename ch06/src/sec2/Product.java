package sec2;

public class Product {
	private String pid;		//제품명
	private String pname;	//제품수량
	private int amount;		//제품수량
	private int price;		//제품가격
	private String img;		//제품이미지
	
	
	public Product(){}
	public Product(String pid, String pname){
		this.pid = pid;
		this.pname = pname;
	}
	public Product(String pid, String pname, int amount, int price) {
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
		this.price = price;
	}
	
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	public int calcMoney(){
		int money;
		money=amount*price;
		return money;
	}
	public String calcRank(){
		String grade= "";
		if(price>=100000){
			grade="고가";
		}else if(price>=50000){
			grade="중저가";
		}else{
			grade="저가";
		}
		return grade;
	}
	public void printimg(){
		System.out.println("이미지 : "+this.img);
	}
	public void printProduct(){
		System.out.println("제품 아이디 : "+this.pid+", 제품명 : "+this.pname+", 제품수량 : "+this.amount+", 제품가격 : "+this.price+", 제품이미지 : "+this.img);
	}
	
	

}

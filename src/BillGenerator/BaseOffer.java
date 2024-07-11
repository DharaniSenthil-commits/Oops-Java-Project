package BillGenerator;

public class BaseOffer {
	
	private int price;
	private int coffee;
	private boolean strong=false;
	
	private int snacksprice=50;
	private int takeawayprice=10;
	
	private boolean isaddSnacks=false;
	private boolean istakeaway=false;
	

	
	public BaseOffer(boolean strong) {
		if(strong) {
			this.price=20;
		}
		else {
			this.price=15;
		}
		coffee = this.price;
	}
	
	public void addSnacks() {
		this.isaddSnacks=true;
		this.price += snacksprice;
	}
	
	public void takeaway() {
		this.istakeaway=true;
		this.price += takeawayprice;
	}

	public void generateBill() {
		
		System.out.println("Coffee : " + this.coffee);
		if(isaddSnacks) {
			System.out.println("Snacks Added :" + this.snacksprice);
		}
		
		if(istakeaway) {
			System.out.println("Take Away : "+ this.takeawayprice);
		}
		
		System.out.println("===========================");
		
		System.out.println("Total Bill : " + this.price);
		System.out.println("===========================");
	}
}

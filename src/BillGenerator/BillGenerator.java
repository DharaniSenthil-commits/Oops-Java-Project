package BillGenerator;

public class BillGenerator {
	public static void main(String args[]) {
//		BaseOffer Baseorder=new BaseOffer(true);
//		Baseorder.addSnacks();
//		Baseorder.takeaway();
//		Baseorder.generateBill();
//		
		ComboOffer Comboorder=new ComboOffer(false);
		Comboorder.addSnacks();
		Comboorder.takeaway();
		Comboorder.generateBill();
		
	}
	

}

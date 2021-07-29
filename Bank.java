package training;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		sbi.rateofinterest();
		AXIS axis = new AXIS();
		axis.rateofinterest();
		rateofinterest();
	}
	
	public static void rateofinterest(){
		System.out.println("default interest is 6%");
	}

}

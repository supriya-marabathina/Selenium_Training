package training;

public class overridingrunner extends overridingtraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate();
		overridingtraining ot = new overridingtraining();
		ot.calculate();
	}
	
	public static void calculate(){
		System.out.println("printing calculate value");
	}
}

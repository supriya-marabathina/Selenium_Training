package training;

public class encapsulationrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulation ec=new encapsulation();
		ec.setMyname("yerapa");
		System.out.println(ec.getMyname());
		
		ec.setZipcode(-10);
		System.out.println(ec.getZipcode());		
	}
}
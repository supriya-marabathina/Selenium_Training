package training;

public class encapsulation {

	private static String myname;
	private static int zipcode;
	
	public static String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public static int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		if (zipcode>0 && zipcode>100) {
		this.zipcode = zipcode;
		}
	}
	
}

package javaTraining;

public class Encapsulation {
	static int i;
	int j;
	static int details(){
		i=10;
		return i;
	}
	
	static int showdetails(){
		return details();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = showdetails();
		System.out.println(v);
	
	}

}

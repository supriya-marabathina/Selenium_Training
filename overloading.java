package training;


public class overloading {
	public static int cd=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public //this can be accessed from anywhere
		//private //this can be accessed within class
		//protected //this can be accessed when we declare a subclass 
		//default //this can be accessed within package
		multiplication();
		multiplication(6, 2);
	}
	
	protected static void calculator(){
		System.out.println("calculation is happening");
	}
	
	public static void display(){
		System.out.println("displaying my name");
	}
	
	public static void multiplication(){
		System.out.println("5*1 = 5");
	}
	public static void multiplication(int table, int value){
		System.out.println(table+" * "+value+" = "+table*value);
	}	
}

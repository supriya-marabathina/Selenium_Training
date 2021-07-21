package javaTraining;

class overloading {
	static int id=10;  
    static String name="value"; 
	

	int display(int a,int b,int c){
		System.out.println("coming in the a,b,c method");
				System.out.println(a+b+c);
				return a+b+c;
	}
	int display(int a,int b){
		System.out.println("coming in the a,b method");
		System.out.println(a+b);
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading s2=new overloading();
		   s2.display(1, 2, 3);
		   s2.display(10,20);
}
}
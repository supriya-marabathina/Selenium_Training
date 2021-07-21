package javaTraining;

public class thiskeyword {
	static int id=10;  
    static int j=20; 
	

	int display(int id,int j){
		System.out.println("coming in the a,b,c method");
				System.out.println(this.id+this.j);
				return id+j;
	}
	
	int display1(int id,int j){
		System.out.println("coming in the a,b,c method");
				System.out.println(id+j);
				return id+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword s2=new thiskeyword();
		   s2.display(100,200);
		   s2.display1(100,200);
	}
}

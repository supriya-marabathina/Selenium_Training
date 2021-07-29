package training;

public class statickeyworddemo {
	static int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//counter();
		statickeyword s1 = new statickeyword();
		statickeyword s2 = new statickeyword();
		System.out.println(s1.display());
		System.out.println(s2.display());
	}
	
	 static void counter(){
		System.out.println(i++);//i=i+1;
		System.out.println(i);
		System.out.println(i++);//i++ ++i ++i
		System.out.println(++i);
		System.out.println(++i);//
		System.out.println(i++); 
		System.out.println(i);
		
		//post incerement - it will display the value first and increment
		//pre increment - it will increment the value first and then display
	}
	 
	
		 
	 

}

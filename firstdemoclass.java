
public class firstdemoclass {
	static int c;//class variables
	static String lastname; 
	static boolean amiright; 
	static final int zipcode=515671;
	
	
	firstdemoclass(){//default constructor
		this.c=10;
		this.lastname="reddy";
		this.amiright=true;
	}
	
	firstdemoclass(int c, String lastname, boolean amiright){//parametrised constructor
		this.c=c;
		this.lastname=lastname;
		this.amiright=amiright;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstdemoclass fc = new firstdemoclass();
		System.out.println("c==="+c +"---"+lastname+"=="+amiright);
		firstdemoclass fc1 = new firstdemoclass(100,"yerapa",false);
		
		//typeofvariable variablename =  value;
		
		
		int a = 5; //local variable
		a=6;
		int b=10;
		double d =10.0;
		boolean t = false;
		String s ="someting";
		
		long l =1000000000;
		float f =10.0f;
		System.out.println("s "+s);
		System.out.println(a+b);
		System.out.println("c==="+c +"---"+lastname+"=="+amiright);
		System.out.println(run(a)); //parameter
		
		//classname objectname = new classname()
		secondone sec=new secondone(); //instance
		sec.myname();
		
	}
	
	//accessmodifier returntype methodname(arguments)
	public static boolean run(int a){
		
		
		System.out.println(a);
		System.out.println(c);
		return true;
	}

}



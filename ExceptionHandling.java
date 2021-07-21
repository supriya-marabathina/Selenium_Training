package javaTraining;

import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		mathexception();
		throwsexception();
		throwmathexception();
		mathwithoutexception();		
	}	
	//Exception Not handled
	static void mathwithoutexception(){
		int i=100/0;
		System.out.println(i);
	}
	//Handled generic exception
	static void mathexception(){		
		try{
			int j=100/0;
			System.out.println(j);
		} catch(Exception e){
			System.out.println(e);
		}		
	}
	//forcing to throw exception
	static void throwmathexception(){			
			int j=100;
			System.out.println(j);
		throw new ArithmeticException();
		
	}
	//Expecting an arithmetic exception
	static String throwsexception() throws ArithmeticException{			
		int j=200;
		System.out.println(j);
		return null;	
	}
	//order of exception
	static void orderofexception(){		
		try{
			int j=100/0;
			System.out.println(j);
		} catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}

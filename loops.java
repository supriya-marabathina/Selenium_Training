package training;

public class loops {

	public static void forloop(){
		System.out.println("for loop");
		//syntax for a for loop
		//initializition (Only at start of the loop);condition(every run in the loop); increment/decrementoperator(everytime until condition satsifies)
		for(int i=1;i<=10;i++){		
		System.out.println("5*"+ i+"= "+5*i);
		}
	}
	
	public static void forloop(int table,int from,int to){
		System.out.println("for loop with parameters");
		//syntax for a for loop
		//initializition (Only at start of the loop);condition(every run in the loop); increment/decrementoperator(everytime until condition satsifies)
		for(int i=from;i<=to;i++){		
		System.out.println(table+"*"+ i+"= "+table*i);
		}
	}
	
	
	public static void whileloop(){
		System.out.println("while loop");
		int i=1;
		//syntax for while loop
		//while(condition)
		while(i<=10){
			System.out.println("5*"+ i+"= "+5*i);
			i++;
		}
	}
	public static void whileloop(boolean check){
		System.out.println("while loop with parameters");
		int i=1;
		//syntax for while loop
		//while(condition)
		while(!check){
			System.out.println("5*"+ i+"= "+5*i);
			i++;
		}
	}
	public static void dowhileloop(){
		System.out.println("do while loop");
		int i=1;
		//syntax for do while loop
		//first execute code and check for condition
		do{
			System.out.println("5*"+ i+"= "+5*i);
			i++;
		}while(i<=10);
	}
	
	public static void dowhileloop(boolean check){
		System.out.println("do while loop");
		int i=1;
		//syntax for do while loop
		//first execute code and check for condition
		do{
			System.out.println("5*"+ i+"= "+5*i);
			i++;
		}while(check);
	}
	
}

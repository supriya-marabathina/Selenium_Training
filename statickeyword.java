package javaTraining;

public class statickeyword {
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statickeyword s1=new statickeyword();
		statickeyword s2=new statickeyword();
		s1.calculate();
		s2.calculate();
		s2.calculate();
	}

	static void calculate(){
		i++;
		System.out.println(i);
	}
	
}

package javaTraining;

public class beforeStaicvariable {
	int j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeStaicvariable s1=new beforeStaicvariable();
		beforeStaicvariable s2=new beforeStaicvariable();
		s1.calculate();
		s2.calculate();
		s2.calculate();
	}

	void calculate(){
		j++;
		System.out.println(j);
	}
}

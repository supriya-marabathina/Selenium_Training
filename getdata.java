package datadrivenframework;

import java.io.IOException;
import java.util.ArrayList;

public class getdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		datafromexcel d= new datafromexcel();
		System.getProperty("user.dir");
		ArrayList<String> data = d.getdatafromexcel("C:\\Users\\Yerapa.Reddy\\Downloads\\Dataforlogin.xlsx","Dataset1","Testcasename","AdminLogin");
		System.out.println(data.get(1));
		System.out.println(data.get(2));
	}
}

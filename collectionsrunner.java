package training;

import java.util.*;

public class collectionsrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array 
		String[] values = new String[3];
		values[0]="firstname";
		values[1]="lastname";
		values[2]="middlename";
		
		//Arraylist
		ArrayList<String> myvalues = new ArrayList();
		myvalues.add("address");
		myvalues.add("lane no");
		myvalues.add("location");
		myvalues.add("zipcode");
		System.out.println(myvalues.size());
		
		System.out.println(myvalues);
		
		LinkedList<String> entries = new LinkedList();
		entries.add("address");
		System.out.println(entries.get(0));
		
		HashMap<String,String> pair = new HashMap();
		pair.put("myfirstname","yerapa");
		pair.put("mylastname", "reddy");
		
		System.out.println(pair.get("myfirstname"));
	}
}

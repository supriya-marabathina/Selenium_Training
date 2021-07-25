package javaTraining;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		arrayList();
		hashmap();
	}

	static void array() {
		int[] values = new int[3];
		String[] times = { "US", "INDIA", "GERMANY" };
		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		// values[3] = 4;
		int length = times.length;
		System.out.println(length);
		System.out.println(values.toString());

	}

	static void arrayList() {
		ArrayList<String> values = new ArrayList();
		System.out.println(values);
		values.add("myname");
		System.out.println(values);
		values.add("lastname");
		values.add(1, "firstname");
		System.out.println(values.get(0));
		System.out.println(values);
		values.remove(0);
		System.out.println(values);
		values.remove("lastname");
		System.out.println(values);
		System.out.println(values.contains("lastname"));
		ArrayList<String> countries = new ArrayList<>();
		countries.add("firstname");
		countries.add("lastname");
		System.out.println(values.equals(countries));
	}

	static void hashmap() {
		HashMap<String, String> values = new HashMap<>();
		values.put("myfirtsname", "yerapa");
		values.put("mylastname", "reddy");
		// to return value based on key
		System.out.println(values.get("myfirtsname"));
		System.out.println(values);
		// to return all keys and values
		values.forEach((k, v) -> {
		if(v == "reddy"){
			System.out.println(k + "  " + v);
			}
		});
	}
}

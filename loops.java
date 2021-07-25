package javaTraining;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5*1=5

		// multiplicationtable(5);
		// multiplicationtable(8);
		multiplicationtable(7, 11, 20);
		// whilemultiplicationtable(7, 11, 20);
		// dowhilemultiplicationtable(7, 11, 20);
	}

	static void multiplicationtable(int i) {
		// syntax of for loop
		// for(variable;condition;incremental/decremental operation)
		for (int j = 1; j <= 10; j++) {
			System.out.println(i + " X " + j + "=" + i * j);
		}
	}
	static void multiplicationtable(int table, int from, int to) {
		// syntax of for loop
		// for(variable;condition;incremental/decremental operation)
		for (int k = from; k <= to; k++) {
			System.out.println(table + " X " + k + "=" + table * k);
			// nested if
			if (k > 16) {
				if (k == 17) {
					break;
				}

			} else if (k > 21) {

			} else {

			}
		}
	}

	static void whilemultiplicationtable(int table, int from, int to) {
		// syntax of while loop
		// while(condition)
		int k = from;
		while (k <= to) {
			System.out.println(table + " X " + k + "=" + table * k);
			k++;
		}
	}

	static void dowhilemultiplicationtable(int table, int from, int to) {
		// syntax of dowhile loop
		// while(condition)
		int k = from;
		do {
			System.out.println(table + " X " + k + "=" + table * k);
			k++;
		} while (k <= to);
	}

}

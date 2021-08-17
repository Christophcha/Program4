import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Programming Fundamentals \nNAME: Christopher Chakchay \nPROGRAMMING ASSIGNMENT 4 - SET \n");

		String line;
		int x;

		Scanner scan = new Scanner(System.in);

// 		Set node = new Set();
//		node.add(18);
//		node.add(45);
//		node.add(12);
//		node.show();

		Set linkedList = new Set();

		while (true) {
			System.out.print("Enter command: ");
			line = scan.nextLine();

			String data[] = line.split(" ");

			if (data[0].equalsIgnoreCase("add")) {
				try {
					x = Integer.parseInt(data[1]);
					linkedList.add(x);
					System.out.println(linkedList);
				} 
				catch (Exception e) {
					System.out.println("Invalid");
				}
			}

			else if (data[0].equalsIgnoreCase("del")) {
				System.out.println("DELETE");// test
			}

			else if (data[0].equalsIgnoreCase("exists")) {
				System.out.println("EXISTS");// test
			}

		}

	}
}

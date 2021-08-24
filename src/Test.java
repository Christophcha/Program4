/* Christopher Chakchay
 * Programming fundamentals
 * Summer 2021
 * Programming Assignment 4 - Set ADT
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		// header
		System.out.println("Programming Fundamentals \nNAME: Christopher Chakchay \nPROGRAMMING ASSIGNMENT 4 - SET \n");

		String line;
		int x;

		Scanner scan = new Scanner(System.in);
		
		// Set class
		Set linkedList = new Set();
		
		// infinite loop depending on user input. 
		while (true) {
			System.out.print("Enter command: ");
			line = scan.nextLine();

			String data[] = line.split(" ");
			
			// if user types "add" at index 0 then it will add next index to linkedList
			if (data[0].equalsIgnoreCase("add")) {
				try {
					x = Integer.parseInt(data[1]);
					linkedList.add(x);
					System.out.println(linkedList);
				} catch (Exception e) {
					System.out.println(linkedList);
					System.out.println("Invalid input: correct format is \"add #\""); // gives user correct format if input is wrong format
				}
			}
			
			// if user types "del" at index 0 then it will delete next index from linkedList
			else if (data[0].equalsIgnoreCase("del")) {
				try {
					x = Integer.parseInt(data[1]);
					linkedList.delete(x);
					System.out.println(linkedList);
				} catch (Exception e) {
					System.out.println(linkedList);
					System.out.println("Invalid input: correct format is \"del #\""); // gives user correct format if input is wrong format
				}
			}
			
			// if user types "exists" at index 0 then it will give boolean output if input exists or not.
			else if (data[0].equalsIgnoreCase("exists")) {
				try {
					x = Integer.parseInt(data[1]);
					linkedList.exists(x);
					System.out.println(linkedList.exists(x));
				} catch (Exception e) {
					System.out.println("Invalid input: correct format is \"exists #\""); // gives user correct format if input is wrong format
				}

			// terminates if user types "done"
			} else if (data[0].equalsIgnoreCase("done")) {
				scan.close();
				System.exit(0);
			
			// gives user correct format if input is wrong format
			} else {
				System.out.println("Invalid input: correct format is \"add #\" or \"del #\" or \"exists #\"");
				System.out.println(linkedList);
			}

		}

	}

}

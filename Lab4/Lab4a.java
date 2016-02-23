// Lab04a.java
// Brian Knotten

import java.util.Scanner;

public class Lab4a{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

		System.out.print("What is the individual's name? ");
		String name = sc.nextLine();

		int utils = 0;
		int posPeople = 0;
		int posUtils = 0;
		int nullUtils = 0;
		int negPeople = 0;
		int negUtils = 0;
		int choice = 0;
		while (choice != 4){

			System.out.println("Enter the next action for " + name);
			System.out.print("(1) - Buy people ice cream\n" + "(2) - Steal ice cream from people\n"
					  + "(3) - Dream about people eating ice cream\n" + "(4) - Die\n");
			choice = sc.nextInt();

			switch(choice){
				case 1:
					System.out.print("How many people were impacted? ");
					posPeople = sc.nextInt();
					posUtils = posPeople * 3;
					System.out.println(name + " caused " + posUtils + " utils with this action.");
					break;
				case 2:
					System.out.print("How many people were impacted? ");
					negPeople = sc.nextInt();
					negUtils = negPeople * -5;
					System.out.println(name + " caused " + negUtils + " utils with this action.");
					break;
				case 3:
					System.out.print("How many people were impacted? ");
					nullUtils = sc.nextInt();
					System.out.println(name + " caused 0 utils with this action.");
					break;
				case 4:
					utils = posUtils + negUtils;
					System.out.println(name + " cause " + utils + " in their life.");
					if (utils > 0){
						System.out.println(name + " lived a morally good life!");
					}
					else if (utils < 0){
						System.out.println(name + " lived a morally bad life!");
					}
					else{
						System.out.println(name + " lived a morally neutral life!");
					}
			}
		}
	}
}

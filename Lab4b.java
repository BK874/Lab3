// Lab4b.java
// Brian Knotten

import java.util.Scanner;

public class Lab4b{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Level being met: ");
		int level = sc.nextInt();
		
		switch (level){
			case 5:
				System.out.println("5. Self-actualization");
			case 4:
				System.out.println("4. Esteem");
			case 3:
				System.out.println("3. Love and Belonging");
			case 2:
				System.out.println("2. Safety");
			case 1:
				System.out.println("1. Physiological");
		}
	}
}

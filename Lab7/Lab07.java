import java.util.Scanner;
import java.io.*;

public class Lab07{
    
    public static void main(String[] args) throws IOException{
	
	Scanner keyboard = new Scanner(System.in);
	int size;
	char [] universe;
	String choice = " ";

	System.out.print("How big of a universe? ");
	while (!keyboard.hasNextInt()){
	    System.out.print("How big of a universe? ");
	    keyboard.next();
	}
   	size = keyboard.nextInt();
	universe = generateUniverse(size);
	
	while (!choice.equals("Q")){
	    System.out.println(universe);
	    do{
		System.out.print("[Q]uit, [A]dvance, or [S]ave? ");
		while(!keyboard.hasNextLine()){
		    keyboard.next();
		    System.out.print("[Q]uit, [A]dvance, or [S]ave? ");
		}
		choice = keyboard.nextLine();
	    }while(!choice.equals("Q") && !choice.equals("A") && !choice.equals("S"));
	    
	    if(choice.equals("A")){
		for (int i = 0; i < universe.length; ++i){
		    if (universe[i] == '0'){
			universe[i] = '1';
		    }
		    else if (universe[i] == '1'){
			universe[i] = '2';
			}
		    else if (universe[i] == '2'){
			if (i+1 < universe.length && universe[i+1] == '.'){
			    universe[i+1] = '2';
			    universe[i] = '.';
			    i++;
			    }
			else if (i+1 < universe.length && universe[i+1] == '^'){
			    universe[i+1] = '0';
			    universe[i] = '.';
			    i++;
			}
		    }
		}
	    }

	    else if(choice.equals("S")){
		int babies = 0;
		int children = 0;
		int adults = 0;
		File file = new File("universe.txt");
		PrintWriter outputFile = new PrintWriter(file);
		outputFile.println(universe);
		for (int i = 0; i < universe.length; i++){
		    if (universe[i] == '0'){
			babies++;
		    }
		    else if (universe[i] == '1'){
			children++;
		    }
		    else if (universe[i] == '2'){
			adults++;
		    }
		}
		outputFile.println("Babies: " + babies);
		outputFile.println("Children: " + children);
		outputFile.println("Adults: " + adults);
		outputFile.close();
	    }
	}		    
	
    }




   private static char[] generateUniverse(int size){
       char [] universe = new char[size];
       for (int i = 0; i < universe.length; i++){
	   if (i == 0 || i % 7 == 0){
	       universe[i] = '0';
	   }
	   else if (i % 5 == 0){
	       universe[i] = '^';
	   }
	   else{
	       universe[i] = '.';
	   }
       }

       return universe;
    }
}

import java.util.Scanner;

public class Lab09{

    public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	int dimension;
	int numUnits;
	World world = new World();
	Scientist scientist = new Scientist(world);
	
	while (dimension > 0){
	
	    System.out.println("Enter dimension to travel (1,2,3,4,5) (negative to quit): ");
	    dimension = keyboard.nextInt();
	    System.out.println("Enter units to travel (negative for backwards): ");
	    numUnits = keyboard.nextInt();

	    scientist.move(dimension, numUnits);
	    
	}
	
	System.out.println("The scientist gives up on the quest for understanding.");
    }

}
	

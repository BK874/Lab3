public class Scientist{

    public Scientist(int world[][][][][]){
	position = world[0][0][0][0][0];
	
    }

    public int[] move(int dimension, int numUnits){
	if (numUnits >= 10){
	    numUnits = numUnits % 10;
	}
	//if (numUnits < 0){

	

	//To "wrap around," use %10 (ex: numUnits = 14, 14%10 = 5, move 4 units)
	//When given negative numUnits, add 10? (ex: -6 from 0 would result in 4,
	//so -6 + 10 = 4
    }

}

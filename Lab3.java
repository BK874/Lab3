public class Lab3{

	public static void main(String[] args) {
		
		double distance = 10.0;
		int steps = 0;
		
		while (distance > 0.0){
			distance /= 2;
			steps++;
			System.out.println("Step number: " + steps);
			System.out.println("Distance to Helen: " + distance);
		}
		System.out.println("The number of steps taken by Paris: " + steps);
	}
}

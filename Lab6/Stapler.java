public class Stapler{
   private int numStaples;

    public Stapler(){
	numStaples = 10;
    }

    public void addStaples(){
	numStaples += 10;
    }

    public boolean staple(int numPages){
	if (numPages <= 50){
	    numStaples -= 1;
	}
	else{
	    System.out.println("The stapler jammed!");
	    numStaples -= 3;
	}
	if (numStaples <= 0){
	    return true;
	}
	else{
	    return false;
	}
    }

    public void status(){
	if (numStaples > 10){
	    System.out.println("The stapler feels...really heavy.");
	}
	else if (numStaples > 5 && numStaples <= 10){
	    System.out.println("The stapler feels...heavy.");
	}
	else if (numStaples > 0 && numStaples <= 5){
	    System.out.println("The stapler feels...light.");
	}
	else if (numStaples == 0){
	    System.out.println("The stapler feels...really light.");
	}
    }
}

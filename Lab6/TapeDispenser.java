public class TapeDispenser{
    double inchesOfTape;
    
    public TapeDispenser(){
	inchesOfTape = 50;
    }

    public void refillTape(){
	inchesOfTape = 50;
    }

    public boolean tape(int numPages){
	inchesOfTape -= 0.25 * numPages;
	if(inchesOfTape <= 0){
	    return true;
       	}
	else{
	    return false;       
	}
    }

    public void status(){
	if (inchesOfTape >= 45){
	    System.out.println("The tape dispenser looks...full.");
	}
	else if (inchesOfTape >= 35 && inchesOfTape < 45){
	    System.out.println("The tape dispenser looks...almost full.");
	}
	else if (inchesOfTape >= 15 && inchesOfTape < 35){
	    System.out.println("The tape dispenser looks...about halfway full.");
	}
	else if (inchesOfTape > 0 && inchesOfTape < 15){
	    System.out.println("The tape dispenser looks...almost empty.");
	}
	else if (inchesOfTape == 0){
	    System.out.println("The tape dispenser is empty.");
	}
    }
}

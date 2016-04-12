import java.util.*;

public class Lab11 {

    public static void main(String[] args) {
	
	Random rng = new Random();
	boolean lost = false;
	int monster;
	Player p = new Player();
	Monster d = new Dragon();
	Monster gDefeats = new Goblin();
	Monster tDefeats = new Troll();
	
	System.out.println("");
	System.out.println("Welcome to Dungeons and Dragons and Objects!");
	
	while (lost == false && d.getDefeats() == 0){
	    
	    monster = rng.nextInt(11);
	    
	    System.out.println("");
	    
	    if (monster <= 4){
		System.out.println("You encounter a Goblin!");
		lost = goblinEncounter(p);
	    }
	    else if (monster > 4 && monster <= 8){
		System.out.println("You encounter a Troll!");
		lost = trollEncounter(p);
	    }
	    else{
		System.out.println("You encounter a Dragon!");
		lost = dragonEncounter(p, d);
	    }
	}
	
	if (d.getDefeats() > 0){
	    System.out.println("Number of goblins defeated: " + gDefeats.getDefeats()
			       + "\nNumber of trolls defeated: " + tDefeats.getDefeats()
			       + "\nNumber of dragons defeated: " + d.getDefeats());
	    System.out.println("Gold pieces acquired: " + p.getGold()); 
	    System.out.println("Thanks for playing!");
	}
	System.out.println("");
	
    }
    
    public static boolean goblinEncounter(Player p){
	boolean lostG = false;
	Monster g = new Goblin();
	Scanner input = new Scanner(System.in);
	String choice;
	int pHit;
	int mHit;
	boolean lost = false;
	boolean runAway = false;
	
	while (lostG == false && g.getHealth() > 0 && runAway == false){

	    p.printStats();
	    g.printHealth();
	    
	   
	    System.out.println("(A)ttack\n" + "(B)erserk\n"
			       + "(M)agic\n" + "(R)un away");
	    choice = input.nextLine();
	
	    if (choice.equals("A")){
		pHit = p.attack();
		mHit = g.attack(pHit);
		lostG = p.takeDamage(mHit);
		System.out.println("You dished out " + pHit + " points, "
				   +"and you received " + mHit + " points.");
	    	    
	    }else if (choice.equals("B")){
		pHit = p.attack();
		mHit = g.berserk(pHit);
		lostG = p.takeDamage(mHit);
		System.out.println("You dished out " + pHit + " points, "
				   +"and you received " + mHit + " points.");
	    
	    }else if (choice.equals("M")){
		p.heal();
		mHit = g.attack(0);
		lostG = p.takeDamage(mHit);
		System.out.println("You feel revitalized!");
		System.out.println("You are healed! But the Goblin attacks you for "
				   + mHit + " points.");
	    }else{
		mHit = g.attack(0);
		lostG = p.takeDamage(mHit);
		System.out.println("You have run away! But the Goblin attacks for "
				  + mHit + " points.");
		System.out.println("You have run away from the Goblin");
		runAway = true;
	    }
	}
	if (lostG == true){
	    System.out.println("You have been vanquished by the Goblin");
	}
	else if (g.getHealth() <= 0){;
	    System.out.println("You have defeated the Goblin!");
	    System.out.println("You have gained " + g.getHoard() + " gold pieces!");
	    p.addGold(g.getHoard());
	}
	return lostG;
	
    }
    
    public static boolean trollEncounter(Player p){
	boolean lostT = false;
	Monster t = new Troll();
	Scanner input = new Scanner(System.in);
	String choice;
	int pHit;
	int mHit;
	boolean lost = false;
	boolean runAway = false;
	
	while (lostT == false && t.getHealth() > 0 && runAway == false){

	    p.printStats();
	    t.printHealth();
	    
	   
	    System.out.println("(A)ttack\n" + "(B)erserk\n"
			       + "(M)agic\n" + "(R)un away");
	    choice = input.nextLine();
	
	    if (choice.equals("A")){
		pHit = p.attack();
		mHit = t.attack(pHit);
		lostT = p.takeDamage(mHit);
		System.out.println("You dished out " + pHit + " points, "
				   +"and you received " + mHit + " points.");
	    	    
	    }else if (choice.equals("B")){
		pHit = p.attack();
		mHit = t.berserk(pHit);
		lostT =p.takeDamage(mHit);
		System.out.println("You dished out " + pHit + " points, "
				   +"and you received " + mHit + " points.");
	    
	    }else if (choice.equals("M")){
		p.heal();
		mHit = t.attack(0);
		lostT = p.takeDamage(mHit);
		System.out.println("You feel revitalized!");
		System.out.println("You are healed! But the Troll attacks you for "
				   + mHit + " points.");
	    }else{
		mHit = t.attack(0);
		lostT = p.takeDamage(mHit);
		System.out.println("You have run away! But the Troll attacks for "
				  + mHit + " points.");
		System.out.println("You have run away from the Troll.");
		runAway = true;
	    }
	}
	if (lostT == true){
	    System.out.println("You have been vanquished by the Troll.");
	}
	else if (t.getHealth() <= 0){
	    System.out.println("You have defeated the Troll!");
	    System.out.println("You have gained " + t.getHoard() + " gold pieces!");
	    p.addGold(t.getHoard());
	}
	return lostT;
    }
    
    public static boolean dragonEncounter(Player p, Monster d){
	boolean lostD = false;
	Scanner input = new Scanner(System.in);
	String choice;
	int pHit;
	int mHit;
	boolean lost = false;
	boolean runAway = false;
	
	while (lostD == false && d.getHealth() > 0 && runAway == false){

	    p.printStats();
	    d.printHealth();
	    
	   
	    System.out.println("(A)ttack\n" + "(B)erserk\n"
			       + "(M)agic\n" + "(R)un away");
	    choice = input.nextLine();
	
	    if (choice.equals("A")){
		pHit = p.attack();
		mHit = d.attack(pHit);
		lostD = p.takeDamage(mHit);
		System.out.println("You dished out " + pHit + " points, "
				   +"and you received " + mHit + " points.");
	    	    
	    }else if (choice.equals("B")){
		pHit = p.attack();
		mHit = d.berserk(pHit);
		lostD = p.takeDamage(mHit);
		System.out.println("You dished out " + pHit + " points, "
				   +"and you received " + mHit + " points.");
	    
	    }else if (choice.equals("M")){
		p.heal();
		mHit = d.attack(0);
		lostD = p.takeDamage(mHit);
		System.out.println("You feel revitalized!");
		System.out.println("You are healed! But the Dragon attacks you for "
				   + mHit + " points.");
	    }else{
		mHit = d.attack(0);
		lostD = p.takeDamage(mHit);
		System.out.println("You have run away! But the Dragon attacks for "
				  + mHit + " points.");
		System.out.println("You have run away from the Dragon.");
		runAway = true;
	    }
	}
	if (lostD == true){
	    System.out.println("You have been vanquished by the Dragon.");
	}
	else if (d.getHealth() <= 0){
	    System.out.println("You have defeated the Dragon!");
	    System.out.println("You have gained " + d.getHoard() + " gold pieces!");
	    p.addGold(d.getHoard());
	}
	return lostD;
	
    }
}

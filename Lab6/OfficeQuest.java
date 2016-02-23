import java.util.Random;
import java.util.Scanner;

public class OfficeQuest{

    public static void main(String[] args){
	Random rng = new Random();
	Scanner sc = new Scanner(System.in);
	boolean gameOver = false;
	boolean won = false;
	int turnNum = 0;
	int delivery = 0;
	int paper = 0;
	String attach = "";
	
	Stapler stp = new Stapler();
	TapeDispenser tpd = new TapeDispenser();

	System.out.println("OFFICE QUEST");

	while (gameOver == false){
	    System.out.println("Turn number: " + turnNum);
	    stp.status();
	    tpd.status();
	    delivery = rng.nextInt(100);
	    if (delivery >= 0 && delivery < 5){
		System.out.println("The delivery person came by with more staples!");
		stp.addStaples();
	    }
	    else if (delivery >= 5 && delivery < 10){
		System.out.println("The delivery person came by with more tape!");
		tpd.refillTape();
	    }
	    else{
		paper = rng.nextInt(60) + 1;
		System.out.println("The delivery person dropped off " + paper + " pages to collate!");
		
		do{
		    System.out.print("[T]ape or [S]taples: ");
		    while(!sc.hasNextLine()){
			sc.next();
			System.out.print("[T]ape or [S]taple: ");
		    }
		    attach = sc.nextLine();
		}while (!attach.equals("T") && !attach.equals("S"));
		
		if (attach.equals("T")){
		    gameOver = tpd.tape(paper);
		}
		else if (attach.equals("S")){
		    gameOver = stp.staple(paper);
		}
	      
	    }

	    turnNum ++;
	    turnTime(turnNum);
	    if (turnNum > 23){
		won = true;
		break;
	    }
	    
	}
	
	if (won){
	    System.out.println("Congratulations, the day is done. You have survived your OFFICE QUEST!");
	}
	else{
	    if (attach.equals("T")){
		System.out.println("You have run out of tape!");
	    }
	    else{
		System.out.println("You have run out of staples!");
	    }
	    System.out.println("You could not survive the ordeal of the OFFICE QUEST.");
	}

    }

    private static void turnTime(int turn){
	int time = 480;
	time -= turn * 20;
	int hours = time / 60;
	int minutes = time % 60;
	System.out.println(hours + " hour(s) and " + minutes + " minutes remaining.");
    }

}

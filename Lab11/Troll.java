import java.util.*;

public class Troll extends Monster{

    public static int _defeats = 0;
    
    public Troll(){
	_hp = 30;
    }
    
    public String getName(){
	return "Troll";
    }
    
    public int attack(int hit){
	_hp -= hit;
	
	if (_hp < 0){
	    _defeats++;
	}
	
	int damage = _rng.nextInt(10) + 1;
	
	return damage;
    }
    
    public int berserk(int hit){
	_hp -= (hit*3);
	
	if (_hp < 0) {
	    _defeats ++;
	}
	
	int damage = _rng.nextInt(10) + 1;
	
	return damage * 2;
    }
    
    public int getDefeats(){
	return _defeats;
    }
    
}    

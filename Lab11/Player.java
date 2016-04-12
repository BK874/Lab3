import java.util.*;

public class Player{
    
    private int _hp;
    private int _magic;
    private int _gold;
    private Random _rng = new Random();

    public Player(){
	_hp = 100;
	_magic = 3;
    }
    
    public int attack(){
	int damage = _rng.nextInt(15) + 1;
	return damage;
    }
    
    public void heal(){
	_magic--;
	_hp = 100;
    }
    
    public boolean takeDamage(int hit){
	_hp -= hit;
	
	if (_hp < 0){
	    return true;
	}
	else{
	    return false;
	}
    }
    
    public void addGold(int g){
	_gold += g;
    }
    
    public int getGold(){
	return _gold;
    }

    public void printStats(){
	System.out.println("HP: " +_hp + " MP: " + _magic);
    }

}

import java.util.*;

public class Hoard{

    private Random _rng;
    private int gold;

    public Hoard(){
	_rng = new Random();
	
	gold = _rng.nextInt(100) + 1;
    }

    public int getGold(){
	return gold;
    }
}

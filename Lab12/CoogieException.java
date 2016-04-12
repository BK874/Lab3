public class CoogieException extends Exception{
    private int _numCats;

    public CoogieException(int numCats){
	_numCats = numCats;
    }
    
    public String toString(){
	return _numCats + " is too many cats!";
    }

}

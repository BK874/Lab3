import java.util.Scanner;

public class Lab12{
    
    public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int numCats;
	System.out.print("Enter a number of cats: ");
	numCats = input.nextInt();

	// One
	try{
	    throw (new CoogieException(numCats));
	}catch (CoogieException ex){
	    System.out.println(ex.toString());
	}

	// Two
	try{
	    throw (new NoogieException());
	}catch (NoogieException ex){
	    System.out.println(ex.toString());
	}
	
	// Three
	try{
	    int array[] = new int[4];
	    array[7] = 31;
	}catch (ArrayIndexOutOfBoundsException ex){
	    System.out.println(ex.toString());
	}
	
	// Four
	try{
	    int nArray[] = new int[-8];
	}catch (NegativeArraySizeException ex){
	    System.out.println(ex.toString());
	}
	
	// Five
	try{
	    Object s[] = new String[5];
	    s[0] = new Integer(0);
	}catch (ArrayStoreException ex){
	    System.out.println(ex.toString());
	}

	// Six
	try{
	    Object i = new Integer(0);
	    System.out.println((String)i);
	}catch(ClassCastException ex){
	    System.out.println(ex.toString());
	}
	
	// Seven
	try{
	    String badPassword = "12345";
	    char doesNotExist = badPassword.charAt(5);
	}catch(StringIndexOutOfBoundsException ex){
	    System.out.println(ex.toString());
	}

	// Eight
	try{
	    int notAllowed = 42/0;
	}catch(ArithmeticException ex){
	    System.out.println(ex.toString());
	}
    }
}

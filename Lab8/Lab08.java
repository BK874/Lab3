import java.util.Random;

public class Lab08{
    
    public static void main(String[] args){
	
	Random rng = new Random();
	int[] mGarden = new int[5];
	int[] pGarden = new int[5];
	int numRutabagas = 0;
	int sCount = 1;
	int numItems = 0;
	int oldLength;
	int newLength;
	int[] newGarden;
	int pResize = 0;
	int mResize = 0;
	int growLoc = 0;

	while (sCount <= 40){
	    numRutabagas = rng.nextInt(5);
	    System.out.println("Season " + sCount + " " + numRutabagas + " rutabaga(s)");
	    numItems += numRutabagas;
	    
	    if (numItems >= mGarden.length){
		while (mGarden.length <= numItems){
		    oldLength = mGarden.length;
		    newLength = oldLength + 2;
		    newGarden = new int[newLength];
		
		    for (int i = 0; i < oldLength; i++){
			newGarden[i] = mGarden[i];
		    }
		    mGarden = newGarden;
		    System.out.println("Resized Martin's Garden to " + mGarden.length + "!");
		    mResize++;
		}
	    }
	    
	    if (numItems >= pGarden.length){
		while (pGarden.length <= numItems){
		    oldLength = pGarden.length;
		    newLength = oldLength * 2;
		    newGarden = new int[newLength];
		    
		    for (int i = 0; i < oldLength; i++){
			newGarden[i] = pGarden[i];
		    }
		    pGarden = newGarden;
		    System.out.println("Resized Pangloss's Garden to " + pGarden.length + "!");
		    pResize++;
		}
	    }
	    
	    if (numRutabagas > 0){
		for (int i = 0 ; i < numRutabagas ; i++){
		    mGarden[growLoc] = numRutabagas;
		    pGarden[growLoc] = numRutabagas;
		    growLoc++;
		}
	    }
	    sCount++;
	}
	 
	System.out.print("Martin Garden Size: " + mGarden.length + ", Resized "
			 + mResize + " times.");
	printArray(mGarden, numItems);
	System.out.print("Pangloss Garden Size: " + pGarden.length + ", Resized "
			 + pResize + " times.");
	printArray(pGarden, numItems);
	    
    }


    public static void printArray(int[] arr, int numItems) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    if (j >= numItems) {
		System.out.print("***, ");
	    } else {
		System.out.print(arr[j] + ", ");
	    }
	}
	
	if ((arr.length -1) >= numItems) {
        System.out.println("*** ]");
	} else {
	    System.out.println(arr[arr.length - 1] + " ]");
	}
    }
}


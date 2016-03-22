import java.util.*;

public class Lab10 {

    /**
     * Helper method for printing out arrays.
     * @param int[] arr Array of integers to print
     */
    public static void printArray(int[] arr) {
	System.out.print("[ ");
	for (int j=0; j < (arr.length - 1); j++) {
	    System.out.print(arr[j] + ", ");
	}
	if (arr.length > 0) {
	    System.out.print(arr[arr.length - 1]);
	}
	System.out.println(" ]");
	
    }
    
    /**
     * Swap two elements in an array
     * @param int[] arr - the array
     * @param int index1 - the index of first element to swap
     * @param int index2 - the index of the second element to swap
     */

    public static boolean swap(int[] arr, int index1, int index2) {
	if (index1 == index2){
	    return false;
	    // Do nothing!
	} else {
	    int tmp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = tmp;
	    return true;
	}
    }

    /**
     * Sort an array in ascending order using the Selection Sort algorithm
     * @param int[] arr - the array
     */
    
    public static int selectionSort(int[] arr) {
	
	if (arr.length < 2) {
	    return 0;
	}
	
	int minIndex = 0;
	int minVal = 0;
	int swapCount = 0;

	for (int j = 0; j < (arr.length-1); j++) {

	    //printArray(arr);
	    minIndex = j;
	    minVal = arr[j];
	    for(int k = j + 1; k < arr.length; k++) {

		if (arr[k] < minVal) {

		    minVal = arr[k];
		    minIndex = k;
		}
	    }
	    if (swap(arr, j, minIndex)){
		
		swapCount++;
	    }
	}
	
	return swapCount;

    }

    public static int bubbleSort(int[] arr){
	if (arr.length < 2){
	    return 0;
	}
	int passCount = 0;
	int swapCount = 0;
	while (true){
	    for (int j = 1; j < arr.length; j++){
		//printArray(arr);
		if (arr[j-1] > arr[j]){
		    swap(arr, j-1, j);
		    swapCount ++;
		}
		else{
		    passCount ++;
		}
	    }
	    if (passCount == arr.length-1){
		return swapCount;
	    }
	    else{
		passCount = 0;
	    }
	}
    }
    
    public static void a1Sort(int[][] arr){
	int swaps;
	for (int j = 0; j < arr.length; j++){
	    swaps = bubbleSort(arr[j]);
	    System.out.print("Bubble sort: ");
	    printArray(arr[j]);
	    System.out.println("Swaps = " + swaps);
	}
    }

    public static void a2Sort (int[][] arr){
	int swaps;
	for (int j = 0; j < arr.length; j++){
	    swaps = selectionSort(arr[j]);
	    System.out.print("Selection sort: ");
	    printArray(arr[j]);
	    System.out.println("Swaps = " + swaps);
	}
    }

    public static int[][] deepCopy(int[][] arr){
	int[][] result = new int[arr.length][];
	for (int j = 0; j < arr.length; j++){
	    result[j] = new int[arr[j].length];
	
	    for (int i = 0; i < arr[j].length; i++){
		result[j][i] = arr[j][i];
	    }
	}
	return result;
    }

    public static void main(String[] args) {
	int[][] a1 = { {8, 9, 5, 6, 4, 3},
		       {9, 0, 14, 13, 10, 8, 2, 1, 17, 18, 19, 201, 220, 235, 2},
		       {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200 },
		       {22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 1},
		       {20, 18, 13, 12, 11, 9, 6, 5, 4, 3, 2, 1, -87, -900, -9, -909, -911, -80, -44, -32, -1000} };
	
	int[][] a2 = deepCopy(a1);

        a1Sort(a1);
	System.out.println("");
	a2Sort(a2);
    }

    
}

package LearnJava;

public class DeepCopy {

    public static int[] clalculateSlquare(int[] myArray) {

	// Array deep copy with for loop
	// int[] copyArray = new int[myArray.length];
	// for (int i = 0; i < myArray.length; i++) {
	// copyArray[i] = myArray[i];
	// }

	// Array deep copy with System.arraycopy method
	int[] copyArray = new int[myArray.length];
	System.arraycopy(myArray, 0, copyArray, 0, myArray.length);

	for (int a = 0; a < copyArray.length; a++) {
	    copyArray[a] = (int) Math.pow(copyArray[a], 2);
	}

	return copyArray;

    }

    public static void main(String[] args) {
	int[] originalArray = { 2, 4, 6, 8 };

	clalculateSlquare(originalArray);

	for (int a : originalArray) {
	    System.out.print(a + ", ");
	}

	System.out.println();
	System.out.println("Calculated Array");
	for (int i = 0; i < clalculateSlquare(originalArray).length; i++) {
	    System.out.print(clalculateSlquare(originalArray)[i] + ", ");
	}

    }

}

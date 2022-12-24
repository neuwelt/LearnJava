/*
 * @ This helps to create JavaDocs
 * @ Author: Isaac Neuwelt
 */

package LearnJava;

public class Compare {

    static boolean[] compareIfSmaller(int[] array, int[] ArrayTwo) {

	boolean[] result = new boolean[array.length];

	for (int i = 0; i < array.length; i++) {
	    if (array[i] <= ArrayTwo[i]) {
		result[i] = true;
	    } else {
		result[i] = false;
	    }
	}

	return result;

    }

    public static void main(String[] args) {

	int[] arrayOne = { 2, 4, 6, 8 };
	int[] arrayTwo = { 3, 7, 8, 2 };

	compareIfSmaller(arrayOne, arrayTwo);

	System.out.println();
	System.out.println("Boolean Array");
	for (int i = 0; i < compareIfSmaller(arrayOne, arrayTwo).length; i++) {
	    System.out.print(compareIfSmaller(arrayOne, arrayTwo)[i] + ", ");
	}

    }

}

package LearnJava;

public class FlipLoop {

    static char[] flip(char[] randomArray) {

	char[] newArray = new char[randomArray.length];

	for (int i = 0; i < randomArray.length; i++) {
	    newArray[i] = randomArray[randomArray.length - 1 - i];

	}

	return newArray;

    }

    public static void main(String[] args) {

	char[] randomArray = { 'a', 'b', 'c', 'd' };

	System.out.println("Original Array");
	for (int i = 0; i < randomArray.length; i++) {
	    System.out.print(randomArray[i] + ", ");
	}

	System.out.println();
	System.out.println("Flipped Array");
	for (int i = 0; i < flip(randomArray).length; i++) {
	    System.out.print(flip(randomArray)[i] + ", ");
	}

    }

}

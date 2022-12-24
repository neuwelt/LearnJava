package LearnJava;

public class DataTypes {

    public static void main(String[] args) {

	int myNumber;
//	boolean truth = false;
	double d = 1.2;
	int a = 10; // hexadecimal
	a -= d;
	d *= a;
	System.out.println(a);
	System.out.println(d);

	myNumber = 1 / 10;
	d = 1 / 10; // won't work

	System.out.println(myNumber);
	System.out.println(d);

	d = 1.0 / 10.0; // careful with calculations
	System.out.println(d);

    }

}

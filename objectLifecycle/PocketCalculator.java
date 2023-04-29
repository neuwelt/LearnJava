/**
 * Author:		Isaac Neuwelt
 * Date:		29.04.2023
 * Description:	Program reads 3 commandline parameters,
 *              first and last are type cast to double values
 *              middle parameter is an operator which is checked and ignored
 * Update:		Can be modified to allow different positioning of operator
 */

package LearnJava.objectLifecycle;

public class PocketCalculator {

    public static void operateDouble(String[] args){

        //  assign args array values to variables
        //  use Double Class method to type cast String to double
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);
        double result = 0;


        for (String arg : args) {

            if (arg.equalsIgnoreCase("+")) {
                result = num1 + num2;
                System.out.println(result);

            } else if (arg.equalsIgnoreCase("-")) {
                result = num1 - num2;
                System.out.println(result);

            } else if (arg.equalsIgnoreCase("*")) {
                result = num1 * num2;
                System.out.println(result);

            } else if (arg.equalsIgnoreCase("/")) {
                result = num1 / num2;
                System.out.println(result);
            }

        }

    }
}

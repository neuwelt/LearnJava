package objectLifecycle;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class FixedPointFormat {

    // 3 patterns for positive, negative and 0 prefixed values
    private static String pattern = "+#.000000000;-#.000000000";
    private static String pattern0 = " 0.000000000";


    //  class constants of datatype DecimalFormat
    final static DecimalFormat x1 = new DecimalFormat(pattern);
    final static DecimalFormat x2 = new DecimalFormat(pattern);
    final static DecimalFormat x3 = new DecimalFormat(pattern0);


    public void formString(double myNumber){

        if(Double.toString(myNumber).startsWith("0")){
            System.out.println(x3.format(myNumber));
        }else if(myNumber < 0){
            System.out.println(x2.format(myNumber));
        }else if(myNumber > 0){
            System.out.println(x1.format(myNumber));
        }

    }


}

package objectLifecycle;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Formula {

    public static void doubleResult(){

        double x = 192119201;
        double y = 35675640;

        double z =  ((double) 1 / 107751) * ((1682 * x * Math.pow(y, 4)) + (3 * Math.pow(x, 3)) +
                (29 * x * Math.pow(y, 2)) - (2 * Math.pow(x, 5)) + 832);

/*      double z1 = (1.0 / 107751);
        double z2 = 1682 * x * Math.pow(y, 4);
        double z3 = 3 * Math.pow(x, 3);
        double z4 = 29 * x * Math.pow(y, 2);
        double z5 = 2 * Math.pow(x, 5);
        double z = z1 * (z2 + z3+ z4 - z5);
*/

        System.out.println(z);
    }





    public static void bigDecimalResult(){

        BigDecimal x = new BigDecimal(192119201);
        BigDecimal y = new BigDecimal(35675640);

        MathContext mc1 = new MathContext(1682);
        MathContext mc2 = new MathContext(3);
        MathContext mc3 = new MathContext(29);
        MathContext mc4 = new MathContext(2);
        BigDecimal mc5 = BigDecimal.valueOf(832);

        // store powers in variables
        BigDecimal x1 = x.pow(1);
        BigDecimal x2 = x.pow(3);
        BigDecimal x3 = x.pow(1);
        BigDecimal x4 = x.pow(5);

        // store powers in variables
        BigDecimal y1 = y.pow(4);
        BigDecimal y3 = y.pow(2);

//      Breakdown equation into different sections
        // assign each to a new BigDecimal variable
        BigDecimal z1 = new BigDecimal(String.valueOf(x1));
        BigDecimal z2 = new BigDecimal(String.valueOf(z1));
        BigDecimal z3 = new BigDecimal(String.valueOf(z2));
        BigDecimal z4 = new BigDecimal(String.valueOf(z3));
        BigDecimal z = new BigDecimal(1);


//       double z = (1 /107751) * ((1682 * x *  Math.pow(y,4)) + (3 * Math.pow(x, 3)) + (29 * Math.pow(y, 2)) - (2 * Math.pow(x,5)) + 832);
        z2 = z2.multiply(x2,mc2);
        z3 = z3.add(x3, mc3);
        z3 = z3.multiply(y3);
        z4 = z4.multiply(x4, mc4);

        z = z.divide(BigDecimal.valueOf(107751),RoundingMode.HALF_UP);
        z1 = z1.multiply(x1, mc1);
        z1 = z1.multiply(y1);
        z1 = z1.add(z2);
        z1 = z1.subtract(z3);
        z1 = z1.add(mc5);

        System.out.println(z1);
    }
}
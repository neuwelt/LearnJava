package objectLifecycle;

import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StopWatch {

    long runtime;
    long start;
    long end;

    public void stopMethod(){

        System.out.println("Press Enter to Run Clock:...");

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        Date t1 = new Date();
        start = t1.getTime();
        System.out.println(start);


        input = s.nextLine();

        Date t2 = new Date();
        end = t2.getTime();
        System.out.println(end);

        runtime = end - start;
        System.out.println("Runtime = " + runtime);

        DateFormat f1 = DateFormat.getDateInstance(DateFormat.SHORT);
        }


//      Date stopTime = Date.from(startTime.toInstant());
    }

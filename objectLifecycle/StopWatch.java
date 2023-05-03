package objectLifecycle;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StopWatch {


    public void stopMethod(){
        Scanner trigger = new Scanner(System.in);

        while(Objects.equals(trigger.nextLine(), "")) {

            Date cTime = new Date();
            Long current = cTime.getTime();
            System.out.println(current);


            if(trigger.nextLine() == ""){
                Long stopTime = cTime.getTime() - current;
                System.out.println(stopTime);
                break;
            }


        }


//      Date stopTime = Date.from(startTime.toInstant());
    }
}

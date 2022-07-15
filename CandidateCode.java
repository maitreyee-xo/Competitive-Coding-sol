/* Read input from STDIN. Print your output to STDOUT*/
package practiseCoding;
import java.io.*;

import java.util.*;
public class CandidateCode {
    public static void main(String[] args) {

        Scanner input = null;
        try {
            input = new Scanner(System.in);
            System.out.println("Enter first time(24 hour) in HH:mm format");
            String time1 = input.next();
            System.out.println("Enter second time(24 hour) in HH:mm format");
            String time2 = input.next();
            if (isTimeValid(time1) && isTimeValid(time2)) {

                // Separating first String using delimiter ":"
                String[] firstTimeParts = time1.split(":");
                // Converting String to Integer
                int hours1 = Integer.parseInt(firstTimeParts[0]);
                int minutes1 = Integer.parseInt(firstTimeParts[1]);


                // Separating second String using delimiter ":"
                String[] secondTimeParts = time2.split(":");
                // Converting String to Integer
                int hours2 = Integer.parseInt(secondTimeParts[0]);
                int minutes2 = Integer.parseInt(secondTimeParts[1]);


                int hours = hours1 + hours2;
                int minutes = minutes1 + minutes2;


                /*
                 *
                 * 60 seconds=1 minute. So if value of seconds>59 adding 1
                 * minute to minutes. 60 minutes=1 hour So if value of
                 * minutes>59 adding 1 hour to hours. 24 hours=1 day So if value
                 * of hours>23 adding 1 day to days.
                 *
                 */

                    if (minutes > 59) {
                        minutes = minutes - 60;
                        hours = hours + 1;
                        if (hours > 23) {
                            hours = hours - 24;
                        }
                    } else {

                        if (hours > 23) {
                            hours = hours - 24;
                        }

                    }


                // Converting each integer value of String and combining all Strings.
                String finalTime = String.valueOf(hours) + ":" + String.valueOf(minutes);
                System.out.println("New time is :\n" + finalTime);
                System.out.println("OR");
                System.out.println(hours + " Hours " + minutes + " Minutes ");

            } else {
                System.out.println("Time is not valid.");
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }

    private static boolean isTimeValid(String time) {

        boolean result = false;
        /*
         * Regular expression that matches String with format HH:mm:ss
         * HH -> 0-23
         * mm -> 0-59
         * ss -> 0-59
         */
        String pattern = "(0?[0-9]|1[0-9]|2[0-3]):(0?[0-9]|[1-5][0-9]):(0?[0-9]|[1-5][0-9])";
        if (time.matches(pattern)) {
            result = true;
        }
        return result;
    }

}

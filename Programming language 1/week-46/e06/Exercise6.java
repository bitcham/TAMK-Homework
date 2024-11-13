/*
    Exercise 6 
    Directory: w46/e06
    Objective:
        - Display the current date and time in multiple time zones, such as 
            "America/New_York", "Europe/London", and "Asia/Tokyo".
    Expected Output:
                New York: YYYY-MM-DDTHH:MM  
                London: YYYY-MM-DDTHH:MM  
                Tokyo: YYYY-MM-DDTHH:MM
*/

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exercise6 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        
        ZoneId newYork = ZoneId.of("America/New_York");
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        
        ZonedDateTime nyTime = ZonedDateTime.now(newYork);
        ZonedDateTime londonTime = ZonedDateTime.now(london);
        ZonedDateTime tokyoTime = ZonedDateTime.now(tokyo);
        
        System.out.println("New York: " + nyTime.format(formatter));
        System.out.println("London: " + londonTime.format(formatter));
        System.out.println("Tokyo: " + tokyoTime.format(formatter));
    }
}
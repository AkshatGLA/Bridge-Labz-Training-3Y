package Assignment.BuiltInFunctions.Type2;

/*
Problem 1: Time Zones and ZonedDateTime
Write a program that displays the current time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones.
*/

import java.time.*;

public class TimeZonesDemo {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST

        System.out.println("GMT Time: " + gmt);
        System.out.println("IST Time: " + ist);
        System.out.println("PST Time: " + pst);
    }
}


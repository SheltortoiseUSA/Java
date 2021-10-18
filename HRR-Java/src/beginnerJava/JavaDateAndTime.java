package beginnerJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Task Takeaway...
// 1) Learned how to use GregorianCalendar
// 2) Learned how to use Calendar
// 3) Learned that GregorianCalendar month starts at '0.'
// 4) Learned that Calendar.DAY_OF_Week starts at '1,' and starts with "Sunday."
public class JavaDateAndTime {

	public static void main(String[] args) {
		String currDay = findDay(8, 5, 2015);
		System.out.println("Today is " + currDay);
	}
	
	public static String findDay(int month, int day, int year) {
        Date date = new GregorianCalendar(year, (month - 1), day).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        
        int dayOfTheWeek = calendar.get(calendar.DAY_OF_WEEK);
        String dayStr = "";
        
        switch (dayOfTheWeek) {
        	case 1:
        		dayStr = "SUNDAY";
        		break;
            case 2:
                dayStr = "MONDAY";
                break;
            case 3:
                dayStr = "TUSEDAY";
                break;
            case 4:
                dayStr = "WEDNESDAY";
                break;
            case 5:
                dayStr = "THURSDAY";
                break;
            case 6:
                dayStr = "FRIDAY";
                break;
            case 7:
                dayStr = "SATURDAY";
                break;
        }
        return dayStr;
    }
}

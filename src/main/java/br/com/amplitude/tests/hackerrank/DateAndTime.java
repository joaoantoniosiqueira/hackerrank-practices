package br.com.amplitude.tests.hackerrank;

import java.io.IOException;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar date = createCalendar(month, day, year);

        int dayOfWeekInInt = date.get(Calendar.DAY_OF_WEEK);
        return Result.getDayOfWeekInString(dayOfWeekInInt);
    }

    private static Calendar createCalendar(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, --month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);

        return calendar;
    }

    private static String getDayOfWeekInString(int dayOfWeekInInt) {
        switch (dayOfWeekInInt) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
                return null;
        }
    }
}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        System.out.println(Result.findDay(8, 5, 2015));
    }
}


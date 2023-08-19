import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class myCalendar {
    private final int[] Max_Days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final int[] LEAP_Max_Days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    private HashMap <Date, String> planMap;

    public myCalendar() {
        planMap = new HashMap<Date, String>();
    }
    /*
     * @param date ex: "2023-08-19"
     * @param plan
     */
    public void registerPlan(String strDate, String plan) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        planMap.put(date, plan);
    }

    public String searchPlan(String strDate) throws ParseException{
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        String plan = planMap.get(date);

        return plan;
    }
    
    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public int parseDay(String week) {
        if(week.equals("su")) return 0;
        else if(week.equals("mo"))return 1;
        else if(week.equals("tu"))return 2;
        else if(week.equals("we"))return 3;
        else if(week.equals("th"))return 4;
        else if(week.equals("fr"))return 5;
        else if(week.equals("sa"))return 6;
        else return 0;
    }
    
    public void printCalendar(int year, int month) {
        System.out.printf("<<%d년 %d월>>\n", year, month);
        System.out.println(" SU MO TU WE TH FR SA");
        System.out.println(" --------------------");

        int weekday = getWeekDay(year, month, 1);

        for(int i = 0; i < weekday; i++) {
            System.out.print("   ");
        }

        int maxDay = getMaxDaysOfMonth(year, month);
        int count = 7 - weekday;
        int delim = (count < 7) ? count : 0;

        for(int i = 1; i <= count; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        count++;
        for(int i = count; i <= maxDay; i++) {
            System.out.printf("%3d", i);
            if(i % 7 == delim)
                System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    
    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        else
            return false;
    }

    public int getMaxDaysOfMonth(int year, int month) {
        if(isLeapYear(year)){
            return LEAP_Max_Days[month];
        } else {
            return Max_Days[month];
        }
    }

    private int getWeekDay(int year, int month, int day) {
        int syear = 1970;
        final int STANDARDWEEKDAY = 4;

        int count = 0;

        for(int i = syear; i < year; i++) {
            int delta = isLeapYear(i) ? 366 : 365;
            count += delta;
        }

        for(int i = 1; i < month; i++) {
            int delta = getMaxDaysOfMonth(year, i);
            count += delta;
        }

        count += day - 1;

        int weekday = (count + STANDARDWEEKDAY) % 7;
        return weekday;
    }

    public static void main(String[] args) throws ParseException{
        myCalendar cal = new myCalendar();

        cal.registerPlan("2023-08-19", "Let's eat beef!");
        System.out.println(cal.searchPlan("2023-08-19").equals("Let's eat beef!"));
    }
}

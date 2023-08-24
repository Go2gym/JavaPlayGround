import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class myCalendar {
    private final int[] Max_Days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final int[] LEAP_Max_Days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final String FILE_PATH = "/workspaces/JavaPlayGround/JavaManagementProgram/Calendar1";
    private static final String SAVE_FILE = "calendar.dat";
    

    public void registerPlan(String strDate, String plan) {
        PlanItem P = new PlanItem(strDate, plan);
        List<PlanItem> planItems = P.getPlanMapDetail(strDate, plan);
        planItems.add(P);
        P.getPlanMap().put(P.getDate(), planItems);

        File f = new File(SAVE_FILE);
        
        try {
            if(f.exists()) {
                FileWriter fw = new FileWriter(SAVE_FILE, false);
                for (PlanItem planItem : planItems) {
                    fw.write(planItem.getDetail());
                } 
                fw.close();
            }
            else {
                FileWriter fw = new FileWriter(f);           
                for (PlanItem planItem : planItems) {
                fw.write(planItem.getDetail());
                fw.close();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<PlanItem> searchPlan(String strDate) {
        Date date = PlanItem.getDateFromString(strDate);
        return planMap.get(date);
    }
    
    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public int parseDay(String week) {
        switch(week) {
            case "su": return 0;
            case "mo": return 1;
            case "tu": return 2;
            case "we": return 3;
            case "th": return 4;
            case "fr": return 5;
            case "sa": return 6;
            default: return 0;
        }
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

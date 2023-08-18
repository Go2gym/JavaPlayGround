import java.io.*;
import java.util.*;

public class Calendar {
    private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final String[] startDays = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
    private String [] calendar = new String[50];
    //몇일까지 있는지 출력
    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public void makeCalendar(int month, String startDay) {
        for (int i = 0; i < Max_Days[month - 1] + Arrays.asList(startDays).indexOf(startDay); i++) {
            if (i < Arrays.asList(startDays).indexOf(startDay)) {
                calendar[i] = "";
            } else {
                calendar[i] = Integer.toString(i - Arrays.asList(startDays).indexOf(startDay) + 1);
            }
        }
    }

    public void printCalendar(int year, int month, String startDay) {
        makeCalendar(month, startDay);
        printForm(year, month);

        for (int i = 0; i < Max_Days[month - 1] + Arrays.asList(startDays).indexOf(startDay); i++) {
            if ((i + 1) % 7 == 0)
                System.out.printf("%2s\n", calendar[i]);
            else
                System.out.printf("%2s ", calendar[i]);
        }
    }
    
    public void printForm(int year, int month) {
        System.out.printf("<<%4d년 %3d월>>\n", year, month);
        System.out.println("SU MO TU WE TH FR SA");
        System.out.println("--------------------");
    }
    public static void main(String[] args) throws IOException {
        Prompt p = new Prompt();

        p.runPrompt();
    }
}

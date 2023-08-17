import java.io.*;
import java.util.*;

public class Calendar {
    private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private final String[] startDays = {"SU", "MO", "WE", "TH", "FR", "SA"};
    private String [] calendar = new String[50];
    //몇일까지 있는지 출력
    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public void makeCalendar(int month, String startDay) {
        if (Max_Days[month - 1] == 28) {
            for(int i = 0; i < 28 + Arrays.asList(startDays).indexOf(startDay); i++) {
                if(i < Arrays.asList(startDays).indexOf(startDay)) {
                    calendar[i] = "";
                }
                else {
                    calendar[i] = Integer.toString(i - Arrays.asList(startDays).indexOf(startDay) + 1);
                }
            }
        }
        else if (Max_Days[month - 1] == 30) {
            for(int i = 0; i < 30 + Arrays.asList(startDays).indexOf(startDay); i++) {
                if(i < Arrays.asList(startDays).indexOf(startDay)) {
                    calendar[i] = "";
                }
                else {
                    calendar[i] = Integer.toString(i - Arrays.asList(startDays).indexOf(startDay) + 1);
                }
            }
        }
        else if (Max_Days[month - 1] == 31) {
            for(int i = 0; i < 31 + Arrays.asList(startDays).indexOf(startDay); i++) {
                if(i < Arrays.asList(startDays).indexOf(startDay)) {
                    calendar[i] = "";
                }
                else {
                    calendar[i] = Integer.toString(i - Arrays.asList(startDays).indexOf(startDay) + 1);
                }
            }
        }
    }

    public void printCalendar(int year, int month, String startDay) {
        makeCalendar(month, startDay);
        if (Max_Days[month - 1] == 28) {
            System.out.printf("<<%4d년 %3d월>>\n", year, month);
            System.out.println("SU MO TU WE TH FR SA");
            System.out.println("--------------------");
            for(int i = 0; i < 28 + Arrays.asList(startDays).indexOf(startDay); i++) {
                if((i + 1) % 7 == 0)
                    System.out.printf("%2s\n", calendar[i]);
                else
                    System.out.printf("%2s ", calendar[i]);
            }
        }
        else if (Max_Days[month - 1] == 30) {
            System.out.printf("<<%4d년 %3d월>>\n", year, month);
            System.out.println("SU MO TU WE TH FR SA");
            System.out.println("--------------------");
            for(int i = 0; i < 30 + Arrays.asList(startDays).indexOf(startDay); i++) {
                if((i + 1) % 7 == 0)
                    System.out.printf("%2s\n", calendar[i]);
                else
                    System.out.printf("%2s ", i);
            }
        }
        else if (Max_Days[month - 1] == 31) {
            System.out.printf("<<%4d년 %3d월>>\n", year, month);
            System.out.println("SU MO TU WE TH FR SA");
            System.out.println("--------------------");
            for(int i = 0; i < 31 + Arrays.asList(startDays).indexOf(startDay); i++) {
                if((i + 1) % 7 == 0)
                    System.out.printf("%2s\n", calendar[i]);
                else
                    System.out.printf("%2s ", calendar[i]);
            }
        }
    }

    

    public static void main(String[] args) throws IOException {
        Prompt p = new Prompt();

        p.runPrompt();
    }
}

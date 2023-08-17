import java.io.IOException;

public class Calendar {
    private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    //몇일까지 있는지 출력
    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public void printCalendar(int year, int month) {
        if (Max_Days[month - 1] == 28) {
            System.out.printf("<<%4d년 %3d월>>\n", year, month);
            System.out.println("SU MO TU WE TH FR SA");
            System.out.println("--------------------");
            for(int i = 1; i <= 28; i++) {
                if(i % 7 == 0)
                    System.out.printf("%2d\n", i);
                else
                    System.out.printf("%2d ", i);
            }
        }
        else if (Max_Days[month - 1] == 30) {
            System.out.printf("<<%4d년 %3d월>>\n", year, month);
            System.out.println("SU MO TU WE TH FR SA");
            System.out.println("--------------------");
            for(int i = 1; i <= 30; i++) {
                if(i % 7 == 0)
                    System.out.printf("%2d\n", i);
                else
                    System.out.printf("%2d ", i);
            }
        }
        else if (Max_Days[month - 1] == 31) {
            System.out.printf("<<%4d년 %3d월>>\n", year, month);
            System.out.println("SU MO TU WE TH FR SA");
            System.out.println("--------------------");
            for(int i = 1; i <= 31; i++) {
                if(i % 7 == 0)
                    System.out.printf("%2d\n", i);
                else
                    System.out.printf("%2d ", i);
            }
        }
    }

    

    public static void main(String[] args) throws IOException {
        Prompt p = new Prompt();

        p.runPrompt();
    }
}

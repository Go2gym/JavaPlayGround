import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calendar {
    private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public void printCalendar(int month) {
        if (Max_Days[month] == 28) {
            System.out.println("일 월 화 수 목 금 토");
            System.out.println("1  2  3  4  5  6  7");
            System.out.println("8  9  10 11 12 13 14");
            System.out.println("15 16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
        }
        else if (Max_Days[month] == 30) {
            System.out.println("일 월 화 수 목 금 토");
            System.out.println("1  2  3  4  5  6  7");
            System.out.println("8  9  10 11 12 13 14");
            System.out.println("15 16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
            System.out.println("29 30");
        }
        else if (Max_Days[month] == 31) {
            System.out.println("일 월 화 수 목 금 토");
            System.out.println("1  2  3  4  5  6  7");
            System.out.println("8  9  10 11 12 13 14");
            System.out.println("15 16 17 18 19 20 21");
            System.out.println("22 23 24 25 26 27 28");
            System.out.println("29 30 31");
        }
    }

    public static void main(String[] args) throws IOException {
        int month = 1;
        String PROMPT = "cal> ";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Calendar cal = new Calendar();

        while (month != -1) {
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);

            StringTokenizer st = new StringTokenizer(bf.readLine());
            month = Integer.parseInt(st.nextToken());

            if (month == -1) {
                System.out.println("Bye~");
                break;
            }

            if (month > 12 || month < 1) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요\n");
            } else {
                System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cal.maxDaysOfMonth(month));
                cal.printCalendar(month);
                System.out.println();
            }
        }
    }
}

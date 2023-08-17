import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calendar {
    private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int maxDaysOfMonth(int month) {
        return Max_Days[month - 1];
    }

    public static void main(String[] args) throws IOException {
        int month;
        String PROMPT = "cal> ";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Calendar cal = new Calendar();
        
        month = 1;

        while (month != -1) {
            System.out.println("달을 입력하세요");
            System.out.print(PROMPT);
            StringTokenizer st = new StringTokenizer(bf.readLine());

            month = Integer.parseInt(st.nextToken());
            if(month == -1) {
                System.out.println("Bye~");
                break;
            }
            
            if (month > 12 || month < 1) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요\n");
            } else {
                System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.maxDaysOfMonth(month));
                System.out.println();
            }
        }
    }
}

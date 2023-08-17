import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calendar {
    private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public int maxDaysOfMonth(int n) {
        return Max_Days[n - 1];
    }
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        Calendar cal = new Calendar();

        a = Integer.parseInt(st.nextToken());

        System.out.printf("%d월은 %d일까지 있습니다.", a, cal.maxDaysOfMonth(a));

    }
}

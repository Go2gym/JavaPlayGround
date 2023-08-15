import java.io.*;
import java.util.*;

class GugudanMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(),", ");

        //String arr[] = bf.readLine().split(", ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        for(int i = 2; i <= start; i++) {
            int [] ans = Main.gugudan(i, end);
            Main.print(ans, i, end);
        }
    }
}
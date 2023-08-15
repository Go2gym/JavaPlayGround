import java.io.*;
import java.util.*;

class GugudanMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = bf.readLine().split(",");
        int start = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);

        for(int i = 2; i <= start; i++) {
            int [] ans = Main.gugudan(i, end);
            Main.print(ans, i, end);
        }
    }
}
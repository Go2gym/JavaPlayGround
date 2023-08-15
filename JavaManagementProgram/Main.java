import java.io.*;
import java.util.*;

class Main {
        public static int[] gugudan(int n) {
        int [] Result = new int [9];
        for(int i = 0; i < Result.length; i++) {
            Result[i] = (i + 1) * n;
        }
        return Result;
    }

    public static void main(String[] args) throws Exception{
        //System.out.print("원하는 구구단 단수를 입력하세요 : ");
        //BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        //int num = Integer.parseInt(buffer.readLine());

        for(int i = 2; i < 10; i++) {
            int [] ans = gugudan(i);
            System.out.printf("%d단\n", i);
            for(int j = 0; j < 9; j++){
                System.out.printf("%d * %d = %d\n",i , j+1, ans[j]);
            }
        }
    }
}
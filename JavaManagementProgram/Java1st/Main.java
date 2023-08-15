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

    public static void print(int []arr, int n) {
        System.out.printf("%d단\n", n);
        for(int j = 0; j < 9; j++){
            System.out.printf("%d * %d = %d\n",n ,j+1, arr[j]);
        }
    }
}
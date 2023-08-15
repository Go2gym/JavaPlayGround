import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("원하는 구구단 단수를 입력하세요 : ");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(buffer.readLine());

        for(int i = 0; i < 10; i++) {
            System.out.println(i * num);
        }
    }
}
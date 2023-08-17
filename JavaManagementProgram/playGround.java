import java.io.*;
import java.util.*;

class playGround {
    public static void main(String[] args) throws IOException{
        String str = "Java Study Start";
        String str020 = "Java Study Hard";
        StringTokenizer st = new StringTokenizer(str, " ");
        String []str2Array = str020.split(" ");

        //String[] tokens = str.split(" ");

        String str01 = str2Array[0];
        String str02 = str2Array[1];
        String str03 = str2Array[2];
        System.out.println(str01);
        System.out.println(str02);
        System.out.println(str03);
        
        System.out.println();
        
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        String str3 = st.nextToken();
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
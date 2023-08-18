import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Prompt {
    private final static String PROMPT="cal> ";

    public void runPrompt() throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        myCalendar cal = new myCalendar();

        int month = 1;
        int year = 2017;

        while (month != -1) {
            System.out.println("년도를 입력하세요");
            System.out.print("YEAR> ");
            year = Integer.parseInt(bf.readLine());

            if(year == -1)
                break;

            System.out.println("달을 입력하세요");
            System.out.print("MONTH> ");
            month = Integer.parseInt(bf.readLine());
            
            if (month == -1) {
                System.out.println("Bye~");
                break;
            }

            if (month > 12 || month < 1) {
                System.out.println("잘못된 값입니다. 다시 입력해주세요\n");
            } else {
                cal.printCalendar(year, month);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        Prompt p = new Prompt();

        p.runPrompt();
    }
}

import java.io.*;
import java.util.*;
import java.util.Calendar;

public class Prompt {
    public void runPrompt() throws IOException {
        printMenu();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        myCalendar cal = new myCalendar();

        int month = 1;
        int year = 2017;

        while (true) {
            String cmd = bf.readLine();
            if (cmd.equals("1")) cmdRegister();
            else if (cmd.equals("2")) cmdSearch();
            else if (cmd.equals("3")) showCal();
            else if (cmd.equals("h")) printMenu();
            else if (cmd.equals("q")) break;
        }

        System.out.println("Good Bye~");
    }

    public static void cmdRegister() {

    }

    public static void cmdSearch() {

    }

    public static void showCal(BufferedReader bf) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("년도를 입력하세요");
        System.out.print("YEAR> ");
        year = Integer.parseInt(bf.readLine());

        if (year == -1)
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

    public static void printMenu() {
        System.out.println("+--------------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말 q. 종료");
        System.out.println("+--------------------------+");
    }

    public static void main(String[] args) throws IOException {
        Prompt p = new Prompt();

        p.runPrompt();
    }
}

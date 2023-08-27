import java.io.*;
import java.text.ParseException;
import java.util.*;


public class Prompt {
    public void runPrompt() throws IOException, ParseException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        myCalendar cal = new myCalendar();        

        while (true) {
            printMenu();
            String cmd = bf.readLine();
            switch(cmd) {
                case "1": cmdRegister(bf, cal); break;
                case "2": cmdSearch(bf, cal); break;
                case "3": showCal(bf, cal); break;
                case "h": printMenu(); break;
                case "q":
                    System.out.println("Good Bye~");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }       
    }

    public static void cmdRegister(BufferedReader bf, myCalendar cal) throws ParseException, IOException{
        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해주세요 (yyyy-MM-dd)");
        String date = bf.readLine();
        System.out.println("일정을 입력해주세요");
        String text = bf.readLine();

        cal.registerPlan(date, text);
    }

    public static void cmdSearch(BufferedReader bf, myCalendar cal) throws IOException {
        System.out.println("[일정 검색]");
        System.out.println("날짜를 입력해주세요 (yyyy-MM-dd)");
        
        String date = bf.readLine();
        List<String> plans = cal.searchPlan(date);
        int i = 1;
        if(plans != null) {
            for (String plan : plans) {
                System.out.printf("%d. %s\n", i, plan);
                i++;
            }
        } else {
            System.out.println("일정이 없습니다.");
        }
    }

    public static void showCal(BufferedReader bf, myCalendar cal) throws IOException{
        int month = 1;
        int year = 2017;
        
        System.out.println("년도를 입력하세요");
        System.out.print("YEAR> ");
        year = Integer.parseInt(bf.readLine());

        System.out.println("달을 입력하세요");
        System.out.print("MONTH> ");
        month = Integer.parseInt(bf.readLine());

        if (month > 12 || month < 1) {
            System.out.println("잘못된 값입니다.\n");
            return;
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

    public static void main(String[] args) throws IOException, ParseException {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}

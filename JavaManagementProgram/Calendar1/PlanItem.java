import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

//31강 25
public class PlanItem {
    private Date planDate;
    private String detail;
    private String peoples = "";

    public static Date getDateFromString(String strDate) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }

    public PlanItem(String date, String detail) {
        try {
            this.planDate = getDateFromString(date);
            planDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (Exception e) {
            e.printStackTrace();    
        }
        this.detail = detail;
    }

    public void addpeople(String name) {
        peoples += name + ",";
    }

    public Date getDate() {
        return planDate;
    }

    public String getDetail() {
        return detail;
    }

    public String getPeople() {
        return peoples;
    }

    public String saveString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String sdate = formatter.format(planDate);
        return sdate + ", " + detail + "\n";
    }
}

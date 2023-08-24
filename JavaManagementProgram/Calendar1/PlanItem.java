import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

//31강 25
public class PlanItem {
    private HashMap <Date, List<PlanItem>> planMap = new HashMap<Date, List<PlanItem>>();
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

    public HashMap <Date, List<PlanItem>> getPlanMap() {
        return this.planMap;
    }

    public List<PlanItem> getPlanMapDetail(String date, String plan) {
        return planMap.getOrDefault(date, new ArrayList<>());
    }

    public void addPlan(String strDate, String plan) {
        this.planMap.put(planDate, plan);
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
}

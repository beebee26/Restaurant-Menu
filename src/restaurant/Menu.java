package restaurant;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private ArrayList<HashMap<String,String>> items = new ArrayList<>();
    private Date lastUpdated;

    public void setItems(HashMap<String, String> aItems) {
        items.add(aItems);
    }
    public HashMap<String, String> getItems(int num) {
        return items.get(num);
    }

    public void setDate(Date aDate) {
        lastUpdated = aDate;
    }
    public Date getDate() {
        return lastUpdated;
    }

    public int getLength() {
        return items.size();
    }

}


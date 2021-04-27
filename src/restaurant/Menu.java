package restaurant;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private ArrayList<Object> items = new ArrayList<>();
    private Date lastUpdated;

    public void setItems(Object aItems) {
        System.out.println("here" + aItems.toString());
        items.add(aItems);
        //System.out.println("here2" + items.get());
    }
    public Object getItems(int num) {
        //System.out.println("here2" + items.get(0));
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

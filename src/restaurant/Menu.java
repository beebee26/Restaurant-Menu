package restaurant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private ArrayList<HashMap<String,Object>> items = new ArrayList<>();
    private LocalDate lastUpdated;
    private Object DateTimeFormat;

    public void setItems(HashMap<String, Object> aItems) {
        items.add(aItems);
    }
    public HashMap<String, Object> getItems(int num) {
        return items.get(num);
    }

    public void remove(Object itemName) {

        for(int i=0; i<items.size(); i++) {
            if (this.getItems(i).values().toArray()[4].equals(itemName)) {
                items.remove(i);
                break;
            }
        }
    }

    public void setDate(LocalDate aDate) {
        lastUpdated = aDate;
    }
    public LocalDate getDate() {
        return lastUpdated;
    }

    public int getLength() {
        return items.size();
    }

    public Boolean compareDates(Object date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date5 = date.toString();

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date5, formatter);
        if (localDate.plusMonths(4).isAfter(lastUpdated)) {
            return true;
        }
        else {
            return false;
        }
    }
}


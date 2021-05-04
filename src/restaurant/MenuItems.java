package restaurant;
import java.awt.*;
import java.time.LocalDate;
import java.util.HashMap;

public class MenuItems {

    private HashMap<String, Object> menuItems = new HashMap<>();

    private Boolean isNew = true;

    public void setName(String aName) {
        menuItems.put("Name", aName);
    }
    public Object getName() {
        return menuItems.get("Name");
    }

    public void setPrice(Double aPrice) {
        menuItems.put("Price", aPrice);
    }
    public Object getPrice() {
        return menuItems.get("Price");
    }

    public void setDescription(String aDescription) {
        menuItems.put("Description",  aDescription);
    }
    public Object getDescription() {
        return menuItems.get("Description");
    }
    public void setCategory(String aCategory) {
        menuItems.put("Category", aCategory);
    }
    public Object getCategory() {
        return menuItems.get("Category");
    }

    public void setDate(LocalDate newDate) {
        menuItems.put("Date Added", newDate);
    }
    public Object getDate() {
        return menuItems.get("Date Added");
    }

    public HashMap<String, Object> getValues() {
        return menuItems;
    }
}

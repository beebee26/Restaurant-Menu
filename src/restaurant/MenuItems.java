package restaurant;

import java.util.HashMap;

public class MenuItems {

    public boolean isNew;

    public HashMap<String, String> menuItems = new HashMap<String, String>();

    public void setName(String aName) {
        menuItems.put("Name", aName);
    }
    public String getName() {
        return menuItems.get("Name");
    }


    public void setPrice(String aPrice) {
        menuItems.put("Price", aPrice);
    }
    public String getPrice() {
        return menuItems.get("Price");
    }

    public void setDescription(String aDescription) {
        menuItems.put("Description",  aDescription);
    }
    public String getDescription() {
        return menuItems.get("Description");
    }
    public void setCategory(String aCategory) {
        menuItems.put("Category", aCategory);
    }
    public String getCategory() {
        return menuItems.get("Category");
    }

    public void setIsNew(boolean aIsNew) {
        isNew = aIsNew;
    }
    public boolean getIsNew() {
        return isNew;
    }

    public String getValues() {
        return menuItems.values().toString();
    }
}

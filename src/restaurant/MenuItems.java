package restaurant;

import java.util.HashMap;

public class MenuItems {

    private boolean isNew;

    private HashMap<String, Object> menuItems = new HashMap<>();

    public void setName(String aName) {
        menuItems.put("Name", aName);
    }
    public Object getName() {
        return menuItems.get("Name");
    }

    //public HashMap<String, Object> getWholeItem() {
    //    return menuItems.values();
    //}

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

    public void setIsNew(Boolean aIsNew) {
        menuItems.put("Is New", aIsNew);
    }
    public Object getIsNew() {
        return menuItems.get("Is New");
    }

    public HashMap<String, Object> getValues() {
        return menuItems;
    }
}

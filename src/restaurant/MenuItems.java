package restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuItems {

    private boolean isNew;

    private ArrayList<Object> menuItems = new ArrayList<>();

    public void setName(String aName) {

        menuItems.add(aName);
        //System.out.println(menuItems.get(1));
    }
    public Object getName() {
        //System.out.println(menuItems.get(1));
        return menuItems.get(0);
    }

   // public HashMap<String, String> getWholeItem() {
     //   return menuItems;
    //}

    public void setPrice(Double aPrice) {
        menuItems.add(aPrice);
    }
    public Object getPrice() {
        return menuItems.get(1);
    }

    public void setDescription(String aDescription) {
        menuItems.add(aDescription);
    }
    public Object getDescription() {
        return menuItems.get(2);
    }
    public void setCategory(String aCategory) {
        menuItems.add(aCategory);
    }
    public Object getCategory() {
        return menuItems.get(3);
    }

    public void setIsNew(Boolean aIsNew) {
        menuItems.add(aIsNew);
    }
    public Object getIsNew() {
        return menuItems.get(4);
    }

    public String getValues() {
        return menuItems.toString();
    }
}
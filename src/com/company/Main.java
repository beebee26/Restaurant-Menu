package com.company;

import restaurant.Menu;
import restaurant.MenuItems;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date myDate = new Date();
        Menu myMenu = new Menu();

        myMenu.setDate(myDate);

        MenuItems myItem1 = new MenuItems(); //("Hot Dog", 4.95, "Hot Dog in a bun with ketchup and mustard", "Main Course", true);
        myItem1.setName("HotDog");
        myItem1.setDescription("Hot Dog in a bun with ketchup and mustard");
        myItem1.setPrice(4.95);
        myItem1.setCategory("Main Course");
        myItem1.setIsNew(true);

        MenuItems myItem2 = new MenuItems(); //"Burger", 5.95, "On a bun with ketchup and mustard", "Main Course", false);
        myItem2.setName("Burger");
        myItem2.setDescription("Burger on a bun with ketchup and mustard");
        myItem2.setPrice(5.95);
        myItem2.setCategory("Main Course");
        myItem2.setIsNew(false);

        MenuItems myItem3 = new MenuItems(); //"Shake", 2.95, "Hot Dog in a bun with ketchup and mustard", "Main Course", true);
        myItem3.setName("Shake");
        myItem3.setDescription("Vanilla shake with whipped cream");
        myItem3.setPrice(2.95);
        myItem3.setCategory("Dessert");
        myItem3.setIsNew(true);

        MenuItems myItem4 = new MenuItems(); //"Onion Rings", 3.95, "Hot Dog in a bun with ketchup and mustard", "Main Course", true);
        myItem4.setName("Onion Rings");
        myItem4.setDescription("Fried with sauce");
        myItem4.setPrice(3.95);
        myItem4.setCategory("Appetizer");
        myItem4.setIsNew(false);

        myMenu.setItems(myItem1.getValues());
        myMenu.setItems(myItem2.getValues());
        myMenu.setItems(myItem3.getValues());
        myMenu.setItems(myItem4.getValues());

        for (int counter = 0; counter < myMenu.getLength(); counter++) {
            int numColumns = myMenu.getItems(counter).keySet().size();
            System.out.println("*****");
            for (int counter2 = 0; counter2 < numColumns; counter2++) {
                Object myKey = myMenu.getItems(counter).keySet().toArray()[counter2];
                Object myVal = myMenu.getItems(counter).values().toArray()[counter2];
                System.out.println(myKey + ": " + myVal);
                //System.out.println("Item is new? " +  myMenu.;
            }
        }

        System.out.println("Menu last updated: " + myMenu.getDate());
    }

}

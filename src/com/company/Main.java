package com.company;

import restaurant.Menu;
import restaurant.MenuItems;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        Menu myMenu = new Menu();

        myMenu.setDate(myDate);

        LocalDate date1 = LocalDate.of(2020,04,12);
        MenuItems myItem1 = new MenuItems(); //("Hot Dog", 4.95, "Hot Dog in a bun with ketchup and mustard", "Main Course", true);
        myItem1.setName("Hot Dog");
        myItem1.setDescription("Hot Dog in a bun with ketchup and mustard");
        myItem1.setPrice(4.95);
        myItem1.setCategory("Main Course");
        myItem1.setDate(date1);
        //myItem1.setIsNew(true);

        LocalDate date2 = LocalDate.of(2020,05,22);
        MenuItems myItem2 = new MenuItems(); //"Burger", 5.95, "On a bun with ketchup and mustard", "Main Course", false);
        myItem2.setName("Burger");
        myItem2.setDescription("Burger on a bun with ketchup and mustard");
        myItem2.setPrice(5.95);
        myItem2.setCategory("Main Course");
        myItem2.setDate(date2);
        //myItem2.setIsNew(true);

        MenuItems myItem3 = new MenuItems(); //"Shake", 2.95, "Hot Dog in a bun with ketchup and mustard", "Main Course", true);
        myItem3.setName("Shake");
        myItem3.setDescription("Vanilla shake with whipped cream");
        myItem3.setPrice(2.95);
        myItem3.setCategory("Dessert");
        myItem3.setDate(myDate);
        //myItem3.setIsNew(true);

        MenuItems myItem4 = new MenuItems(); //"Onion Rings", 3.95, "Hot Dog in a bun with ketchup and mustard", "Main Course", true);
        myItem4.setName("Onion Rings");
        myItem4.setDescription("Fried with sauce");
        myItem4.setPrice(3.95);
        myItem4.setCategory("Appetizer");
        myItem4.setDate(myDate);
        //myItem4.setIsNew(true);

        myMenu.setItems(myItem1.getValues());
        myMenu.setItems(myItem2.getValues());
        myMenu.setItems(myItem3.getValues());
        myMenu.setItems(myItem4.getValues());

        Scanner myObj = new Scanner(System.in);

        while (true) {

            System.out.println("Press Add to add item, R to remove item, L to list menu");
            String choice = myObj.nextLine();

            if (choice.equals("A")) {
                System.out.println("Enter item name: ");
                String addName = myObj.nextLine();
                MenuItems newItem = new MenuItems();
                //if (name = existimg name)
                System.out.println("Enter item description: ");
                String addDescription = myObj.nextLine();

                System.out.println("Enter item category: ");
                String addCategory = myObj.nextLine();

                System.out.println("Enter item price: ");
                Double addPrice = myObj.nextDouble();

                newItem.setName(addName);
                newItem.setDescription(addDescription);
                newItem.setPrice(addPrice);
                newItem.setCategory(addCategory);
                newItem.setDate(myDate);

                myMenu.setItems(newItem.getValues());

                printAll(myMenu);
            } else if (choice.equals("R")) {
                System.out.println("Enter item name to remove: ");
                String remName = myObj.nextLine();
                myMenu.remove(remName);
                printAll(myMenu);
            } else if (choice.equals("L")) {
                System.out.println("Press A for all or enter name of item");
                String listChoice = "";
                listChoice = myObj.nextLine();

                if (listChoice.equals("A")) {

                    printAll(myMenu);
                } else {
                    printItem(myMenu, listChoice);
                }
            }
            System.out.println("*******************");
            System.out.println("Menu last updated: " + myMenu.getDate());
        }

    }

    private static void printAll(Menu menu) {
        for (int counter = 0; counter < menu.getLength(); counter++) {
            int numColumns = menu.getItems(counter).keySet().size();
            System.out.println("*****");
            for (int counter2 = 0; counter2 < numColumns; counter2++) {
                Object myKey = menu.getItems(counter).keySet().toArray()[counter2];
                Object myVal = menu.getItems(counter).values().toArray()[counter2];
                System.out.println(myKey + ": " + myVal);
            }
            //menu.compareDates(menu.getItems(counter).values().toArray()[3]);
            System.out.println("Item is new? " +  menu.compareDates(menu.getItems(counter).values().toArray()[3]));
        }
    }
    private static void printItem(Menu menu, String pName) {

        for (int counter = 0; counter < menu.getLength(); counter++) {
            int numColumns = menu.getItems(counter).keySet().size();

            if (menu.getItems(counter).values().toArray()[4].equals(pName)){
                for (int counter2 = 0; counter2 < numColumns; counter2++) {
                    Object myKey = menu.getItems(counter).keySet().toArray()[counter2];
                    Object myVal = menu.getItems(counter).values().toArray()[counter2];
                    System.out.println(myKey + ": " + myVal);
                }
            }
                //System.out.println("Item is new? " +  myMenu.;
        }
    }
}


package org.example.kiosk.lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<MenuItem> menuItems = new ArrayList<>();
    MenuItem menuItem;
    String menuName;


    void setMenuItems(String menuItemName, double price, String description) {
        this.menuItem = new MenuItem(menuItemName, price, description);
        menuItems.add(menuItem);
    }


    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


    public void displayMainMenu() {
        System.out.println(" [ MAIN MENU ]");
        System.out.println("1. Burgers");
        System.out.println("2. Drinks");
        System.out.println("3. Desserts");
        System.out.println("0. 종료      | 종료");
        System.out.print("메뉴 선택: ");
    }

    public void displayBurgerMenu() {
        System.out.println("[ BURGERS MENU ]");
        for (int i = 1; i<= menuItems.size(); i++) {
            System.out.println(menuItem.toStringBurgerMenu(i));
        }


    }
}

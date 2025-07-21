package org.example.kiosk.lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<MenuItem> menuItems = new ArrayList<>();
    MenuItem menuItem;
    String menuName;


    void setMenuItems(String menuItemName, double price, String description) {
        this.menuItems.add(new MenuItem(menuItemName, price, description));
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
        //  반복문 실수 해서 시간 오래걸림
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i+1) + ". " + menuItems.get(i).getName() + "   | W " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDec());
        }
        System.out.println("0. 뒤로가기");
    }

    public void burgerMenu(int burgerNum) {
        switch (burgerNum) {
            case 0:
                 break;
            case 1:
                System.out.println(this.getMenuItems().get(0));
                break;
            case 2:
                System.out.println(this.getMenuItems().get(1));
                break;
            case 3:
                System.out.println(this.getMenuItems().get(2));
                break;
            case 4:
                System.out.println(this.getMenuItems().get(3));
                break;
            default:
                System.out.println("메뉴 개발에 힘써볼게요");
                break;
        }

    }
}

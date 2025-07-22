package org.example.kiosk.lv4;

public class MenuItem {
    String name;
    double price;
    String dec;

    public MenuItem(String name, double price, String dec) {
        this.name = name;
        this.price = price;
        this.dec = dec;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public String getDec() {
        return dec;
    }

    @Override
    public String toString() {
        return "선택한 메뉴: " + name + " | W " + price + " | " + dec;
    }

    public String toStringBurgerMenu(int i) {
        return  i + "." + name + " | W " + price + " | " + dec;
    }
}

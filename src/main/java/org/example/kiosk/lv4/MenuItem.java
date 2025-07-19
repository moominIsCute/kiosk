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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDec() {

        return dec;
    }

    public void setDec(String dec) {

        this.dec = dec;
    }

    @Override
    public String toString() {
        return "선택한 메뉴: " + name + " | W " + price + " | " + dec;
    }
}

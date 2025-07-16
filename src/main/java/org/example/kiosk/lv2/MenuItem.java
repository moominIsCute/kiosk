package org.example.kiosk.lv2;

public class MenuItem {
    String name;
    int price;
    String dec;

    public MenuItem(String name, int price, String dec) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}

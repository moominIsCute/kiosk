package org.example.kiosk.lv2;

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
        System.out.println("선택한 버거는 "+ name + "입니다.");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("버거의 가격은 "+ price + "천원입니다.");
        this.price = price;
    }

    public String getDec() {

        return dec;
    }

    public void setDec(String dec) {
        System.out.println("설명은 "+ dec);

        this.dec = dec;
    }
}

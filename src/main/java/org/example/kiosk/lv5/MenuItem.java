package org.example.kiosk.lv5;

public class MenuItem {
    // 필드를 private로 선언하여 외부에서 직접 접근을 막았습니다.
    private String name;
    private double price;
    private String dec;

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

    public String toStringBurgerMenu(int i) {
        return i + "." + name + " | W " + price + " | " + dec;
    }
}

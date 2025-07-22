package org.example.kiosk.lv3;



import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(new ArrayList<>());
        kiosk.helloKiosk();
        kiosk.start();
    }
}

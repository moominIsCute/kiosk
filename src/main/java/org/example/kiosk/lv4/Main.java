package org.example.kiosk.lv4;

import org.example.kiosk.lv4.Kiosk;
import org.example.kiosk.lv4.MenuItem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(new ArrayList<MenuItem>());
        kiosk.helloKiosk();
        kiosk.start();
    }
}

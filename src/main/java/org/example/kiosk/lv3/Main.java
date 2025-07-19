package org.example.kiosk.lv3;

import org.example.kiosk.lv3.MenuItem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(new ArrayList<MenuItem>());
        kiosk.start();


    }
}

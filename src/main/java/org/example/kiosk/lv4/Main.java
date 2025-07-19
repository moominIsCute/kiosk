package org.example.kiosk.lv4;

import org.example.kiosk.lv4.Kiosk;
import org.example.kiosk.lv4.MenuItem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setMenuItems("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menu.setMenuItems("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menu.setMenuItems("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menu.setMenuItems("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        Kiosk kiosk = new Kiosk(menu);
        kiosk.start();
    }
}

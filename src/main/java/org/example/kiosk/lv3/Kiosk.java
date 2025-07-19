package org.example.kiosk.lv3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Kiosk {
    List<MenuItem> menuItems;
    private boolean startKey = true;
    int menuNum;

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean isStartKey() {
        return startKey;
    }

    public void setStartKey(boolean startKey) {
        this.startKey = startKey;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        //this.startKey = startKey;
        //this.scanner = scanner;
    }

    Scanner scanner = new Scanner(System.in);


    void start() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        while (startKey) {
            try {
                System.out.println(" [ SHAKESHACK MENU ]");
                System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                System.out.println("0. 종료      | 종료");
                System.out.print("메뉴 선택: ");
                menuNum = scanner.nextInt();
                switch (menuNum) {
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        startKey = false;
                        break;
                    case 1:
                        System.out.println(menuItems.get(0));
                        break;
                    case 2:
                        System.out.println(menuItems.get(1));
                        break;
                    case 3:
                        System.out.println(menuItems.get(2));
                        break;
                    case 4:
                        System.out.println(menuItems.get(3));
                        break;
                    default:
                        System.out.println("메뉴 개발에 힘써볼게요");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }


    }
}

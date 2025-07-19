package org.example.kiosk.lv4;

import org.example.kiosk.lv4.MenuItem;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Kiosk {
    Menu menu;
    private boolean startKey;
    int menuNum;
    int menuNum2;

    public boolean isStartKey() {
        return startKey;
    }

    public void setStartKey(boolean startKey) {
        this.startKey = startKey;
    }

    //  키오스크가 메뉴 받게 하는데 오래 생각했다. 너무 어렵다.
    public Kiosk(Menu menu) {
        this.menu = menu;
        this.startKey = true;
    }


    void start() {
        Scanner scanner = new Scanner(System.in);
        while (this.isStartKey()) {
            try {
                menu.displayMainMenu();
                menuNum = scanner.nextInt();
                if (menuNum == 1) {
                    menu.displayBurgerMenu();
                    menuNum2 = scanner.nextInt();
                    if (menuNum2 == 0) {
                        continue;
                    }
                    switch (menuNum2) {
                        case 1:
                            System.out.println(menu.getMenuItems().get(0));
                            break;
                        case 2:
                            System.out.println(menu.getMenuItems().get(1));
                            break;
                        case 3:
                            System.out.println(menu.getMenuItems().get(2));
                            break;
                        case 4:
                            System.out.println(menu.getMenuItems().get(3));
                            break;
                        default:
                            System.out.println("메뉴 개발에 힘써볼게요");
                            break;
                    }
                } else if (menuNum == 2) {
                    System.out.println("음료는 준비중입니다.");
                } else if (menuNum == 3) {
                    System.out.println("디저트는 준비중입니다.");
                } else if (menuNum == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }
    }
}

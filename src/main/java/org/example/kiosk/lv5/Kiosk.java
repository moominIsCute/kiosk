package org.example.kiosk.lv5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Kiosk {
    // 필드를 private로 선언하여 외부에서 직접 접근을 막았습니다.
    private Menu menu;
    private boolean startKey;
    private int menuNum;
    private int menuNum2;

    public boolean isStartKey() {
        return startKey;
    }

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
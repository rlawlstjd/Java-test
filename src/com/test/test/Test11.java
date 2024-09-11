package com.test.test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("--- 자판기 ---");
            System.out.println("음료를 선택하세요.");
            System.out.println("1: 사과맛 2: 포도맛 3: 망고맛");
            int choice = scan.nextInt();

            // 종료 조건
            if (choice == 0) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            System.out.println("금액을 입력하세요:");
            int money = scan.nextInt();

            try {
                vm.selectBeverage(choice, money);
            } catch (InvalidBeverageException e) {
                System.out.println("예외 발생: " + e.getMessage());
            } catch (InsufficientFundsException e) {
                System.out.println("예외 발생: " + e.getMessage());
                System.out.println("추가로 " + e.getAmountNeeded() + "원이 필요합니다.");
            }
        }
    }
}

class VendingMachine {
    private static final int APPLE_PRICE = 1000;
    private static final int GRAPE_PRICE = 1200;
    private static final int MANGO_PRICE = 1500;

    public void selectBeverage(int choice, int money) {
        int price;

        switch (choice) {
            case 1:
                price = APPLE_PRICE;
                System.out.println("사과맛을 구매하셨습니다.");
                break;
            case 2:
                price = GRAPE_PRICE;
                System.out.println("포도맛을 구매하셨습니다.");
                break;
            case 3:
                price = MANGO_PRICE;
                System.out.println("망고맛을 구매하셨습니다.");
                break;
            default:
                // 잘못된 음료 번호인 경우 예외를 발생시킵니다.
                throw new InvalidBeverageException("잘못된 음료 번호를 입력하셨습니다.");
        }

        // 금액이 부족한 경우 예외를 발생시킵니다.
        if (money < price) {
            throw new InsufficientFundsException("금액이 부족합니다.", price - money);
        }

        // 잔돈을 계산합니다.
        if (money > price) {
            System.out.println("거스름돈은 " + (money - price) + "원 입니다.");
        }
    }
}

// 잘못된 음료 번호 예외
class InvalidBeverageException extends RuntimeException {
    public InvalidBeverageException(String message) {
        super(message);
    }
}

// 금액 부족 예외
class InsufficientFundsException extends RuntimeException {
    private final int amountNeeded;

    public InsufficientFundsException(String message, int amountNeeded) {
        super(message);
        this.amountNeeded = amountNeeded;
    }

    public int getAmountNeeded() {
        return amountNeeded;
    }
}

/*
문제 1.
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.

문제 2.
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요. 
*/
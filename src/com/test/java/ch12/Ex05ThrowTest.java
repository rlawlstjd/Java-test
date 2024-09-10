package com.test.java.ch12;

import java.util.Scanner;

public class Ex05ThrowTest {
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);

       VendingMachine vendingMachine = new VendingMachine();

       while (true) {
            System.out.println("1. 사과 (1000원)");
            System.out.println("2. 포도 (1200원)");
            System.out.println("3. 망고 (1500원)");
            System.out.print("음료 번호를 입력하세요 (0: 종료): ");

            int choice = scan.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.print("금액을 입력하세요: ");
            int amount = scan.nextInt();

            try {
                vendingMachine.selectBeverage(choice, amount);
                System.out.println("음료가 나왔습니다!");
            } catch (InvalidBeverageException e) {
                System.out.println(e.getMessage());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage() + " 추가로 " + e.getAmountNeeded() + "원이 필요합니다.");
            }
        }
    }
}


class VendingMachine {
    private static final int APPLE_PRICE = 1000;
    private static final int GRAPE_PRICE = 1200;
    private static final int MANGO_PRICE = 1500;

    public void selectBeverage(int choice, int amount) {
        int price;

        switch (choice) {
            case 1:
                price = APPLE_PRICE;
                break;
            case 2:
                price = GRAPE_PRICE;
                break;
            case 3:
                price = MANGO_PRICE;
                break;
            default:
                throw new InvalidBeverageException("잘못된 음료 번호입니다.");
        }

        if (amount < price) {
            throw new InsufficientFundsException("잔액이 부족합니다.", price - amount);
        } else if (amount > price) {
            System.out.println("거스름돈은 " + (amount - price) + "원 입니다.");
        }
    }
}


class InvalidBeverageException extends RuntimeException {
    public InvalidBeverageException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends RuntimeException {
    private int amountNeeded;

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
음료를 뽑을 수 있는 자판기 프로그램을 만들어 주세요.
제공되는 음료 외의 번호 입력 시 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
잔액이 부족할 경우 발생되는 사용자 정의 예외 클래스를 작성해 주세요.
각각의 예외 발생에 대해 예외처리하는 코드를 작성해 주세요.
*/

//필요한 예외 : 잔액 부족, 음료 부족,
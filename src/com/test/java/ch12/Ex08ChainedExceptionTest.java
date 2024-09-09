package com.test.java.ch12;

import java.util.Scanner;

public class Ex08ChainedExceptionTest {
	public static void main(String[] args) {
        Berverage1 berverage = new Berverage1();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1: 사과 (1000원)");
            System.out.println("2: 포도 (1200원)");
            System.out.println("3: 망고 (1500원)");
            System.out.print("음료 번호를 입력하세요 (0: 종료) : ");
            int choice = scan.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.print("금액을 입력하세요:");
            int amount = scan.nextInt();

            try {
                berverage.selectBerverage(choice, amount);
                System.out.println("음료가 나왔습니다.");
                
            } catch (InvalidBerverageException e) {
                System.out.println("예외 발생: " + e.getMessage());
                System.out.println("원인: " + e.getCause()); // Chained Exception의 원인 출력
                
            } catch (InsufficientFundsException e) {
                System.out.println("예외 발생: " + e.getMessage() + " 추가로 " + e.getAmountNeeded() + "원이 필요합니다.");
                System.out.println("원인: " + e.getCause()); // Chained Exception의 원인 출력
            }
        }
    }
}


class Berverage { // 자판기 클래스
    private static final int apple_flavor = 1000;
    private static final int grape_flavor = 1200;
    private static final int mango_flavor = 1500;

    public void selectBerverage(int choice, int amount) throws InvalidBerverageException, InsufficientFundsException {
        try {
            int price;

            switch (choice) {
                case 1:
                    price = apple_flavor;
                    break;
                case 2:
                    price = grape_flavor;
                    break;
                case 3:
                    price = mango_flavor;
                    break;
                default:
                    throw new InvalidBerverageException("잘못된 음료 번호입니다.");
            }

            if (amount < price) {
                throw new InsufficientFundsException("잔액이 부족합니다.", price - amount);
            } else if (amount > price) {
                System.out.println("거스름돈은 " + (amount - price) + "원 입니다.");
            }

        } catch (InvalidBerverageException e) {
            // Chained Exception으로 InvalidBerverageException을 다시 던질 때, 원인 예외를 포함
            throw new InvalidBerverageException("음료 선택 오류", e);

        } catch (InsufficientFundsException e) {
            // Chained Exception으로 InsufficientFundsException을 다시 던질 때, 원인 예외를 포함
            throw new InsufficientFundsException("금액 부족 오류", e.getAmountNeeded());
        }
    }
}


// 예외 클래스
class InvalidBerverageException extends Exception {
    public InvalidBerverageException(String message) {
        super(message);
    }

    // Chained Exception을 처리하는 생성자
    public InvalidBerverageException(String message, Throwable cause) {
        super(message, cause);
    }
}

class InsufficientFundsException extends Exception {
    private int amountNeeded;

    public InsufficientFundsException(String message, int amountNeeded) {
        super(message);
        this.amountNeeded = amountNeeded;
    }

    // Chained Exception을 처리하는 생성자
    public InsufficientFundsException(String message, int amountNeeded, Throwable cause) {
        super(message, cause);
        this.amountNeeded = amountNeeded;
    }

    public int getAmountNeeded() {
        return amountNeeded;
    }
}
/*
문제 1.
자판기 프로그램에 연결 예외를 적용해 주세요.
*/
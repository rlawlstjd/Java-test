package com.test.test;

import java.util.Scanner;

	class InvalidBeverageException extends Exception {
	    public InvalidBeverageException(String message) {
	        super(message);
	    }
	}

	class InsufficientFundsException extends Exception {
	    private int amountNeeded;

	    public InsufficientFundsException(String message, int amountNeeded) {
	        super(message);
	        this.amountNeeded = amountNeeded;
	    }

	    public int getAmountNeeded() {
	        return amountNeeded;
	    }
	}

	// 자판기 프로그램
	public class test {
	    public static void main(String[] args) {
	        VendingMachine vendingMachine = new VendingMachine();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. 콜라 (1000원)");
	            System.out.println("2. 사이다 (1500원)");
	            System.out.println("3. 물 (500원)");
	            System.out.print("음료 번호를 입력하세요 (0: 종료): ");

	            int choice = scanner.nextInt();
	            if (choice == 0) {
	                break;
	            }

	            System.out.print("금액을 입력하세요: ");
	            int amount = scanner.nextInt();

	            try {
	                vendingMachine.selectBeverage(choice, amount);
	                System.out.println("음료가 나왔습니다!");
	            } catch (InvalidBeverageException e) {
	                System.out.println(e.getMessage());
	            } catch (InsufficientFundsException e) {
	                System.out.println(e.getMessage() + " 추가로 " + e.getAmountNeeded() + "원이 필요합니다.");
	            }
	        }

	        scanner.close();
	    }
	}

	// 자판기 클래스
	class VendingMachine {
	    private static final int COLA_PRICE = 1000;
	    private static final int SODA_PRICE = 1500;
	    private static final int WATER_PRICE = 500;

	    public void selectBeverage(int choice, int amount) throws InvalidBeverageException, InsufficientFundsException {
	        int price;

	        switch (choice) {
	            case 1:
	                price = COLA_PRICE;
	                break;
	            case 2:
	                price = SODA_PRICE;
	                break;
	            case 3:
	                price = WATER_PRICE;
	                break;
	            default:
	                throw new InvalidBeverageException("잘못된 음료 번호입니다.");
	        }

	        if (amount < price) {
	            throw new InsufficientFundsException("잔액이 부족합니다.", price - amount);
	        }

	        // 음료가 정상적으로 나오는 경우 (가격과 금액이 일치하는 경우)
	    }
	}
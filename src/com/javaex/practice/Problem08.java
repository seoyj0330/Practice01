package com.javaex.practice;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int balance = 0;
		
		while(flag) {
			System.out.println("---------------------------");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료 ");
			System.out.println("---------------------------");
			System.out.print("선택 >> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("예금액 >> ");
				int deposit = scan.nextInt();
				balance = deposit + balance;
				break;
			case 2:
				System.out.print("출금액 >>");
				int withdraw = scan.nextInt();
				balance = balance - withdraw;
				break;
			case 3:
				System.out.print("잔고 >> " +balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = false;
				break;
				default :
					System.out.println("다시 입력해주세요");
					break;
			}
			
		}

	}

}
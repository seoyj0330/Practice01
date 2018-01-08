package com.javaex.practice;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = 0;

		System.out.println("숫자를 입력하세요");

		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if (max < num) {
				max = num;
			}
		}

		System.out.println("최대값은 " + max + "입니다.");

	}

}

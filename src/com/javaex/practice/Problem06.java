package com.javaex.practice;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%2 == 0) { //짝수
				if(i%2 == 0) {
					sum += i;
				}
			} else if(num%2 != 0) { //홀수
				if(i%2 == 1) {
					sum += i;
				}
			}
		}
		System.out.println("결과값 : " + sum);

	}

}

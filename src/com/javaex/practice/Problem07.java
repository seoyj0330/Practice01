package com.javaex.practice;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("    [숫자 맞추기 게임 시작]   ");
		System.out.println("========================");
		
		Big: while(true) {
			int what =(int)(Math.random()*100)+1;
			//System.out.println(what);
			
			Small : while(true) {
				System.out.print(">>" );
				int num = scan.nextInt();
				
				if(num > what) {
					System.out.println("더 낮게");
				
				} else if(num < what) {
					System.out.println("더 높게");
					
				}else if(num == what) {
					System.out.println("맞았습니다");
					scan.nextLine();
					System.out.println("게임을 종료하시겠습니까? (y/n) >> ");
					String ans = scan.nextLine();
					if(ans.equals("y")) {
						System.out.println("========================");
						System.out.println("    [숫자 맞추기 게임 종료]   ");
						System.out.println("========================");
						break Small;
					} else if (ans.equals("n")) {
						continue Big;
					}
					
				}
			}
			break Big;

		}
	

		 
		

	}

}

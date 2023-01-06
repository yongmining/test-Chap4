package com.greedy.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

	public void printGugudanFromTwoToNine() {
		
		for(int dan = 2; dan < 10; dan++) {
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}
	
	public void printUpgradeGugudanFromTwoToNine() {
		
		for(int dan = 2; dan < 10; dan++) {
			printGugudanOf(dan);
		}
	}
	
	public void printGugudanOf(int dan) {
		
		for(int su = 1; su < 10; su++) {
			System.out.println(dan + " * " + su + " = " + (dan * su));
		}
		System.out.println();
	}
	
	public void printTime() {
		
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				for(int sec = 0; sec < 60; sec++) {
					
				}
			}
		}
	}
	
	public void printStarInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
//			for(int j = 1; j < 6; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
			
			printStar(5);
		}
	}
	
	public void printStar(int amount) {
		
		for(int j = 1; j <= amount; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void printTriangleStart() {
		
		//입력받은 줄 수 만큼 * 출력
		//단, 삼각형 모양으로 출력
		
//		*
//		**
//		***
//		****
//		*****
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 줄 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}










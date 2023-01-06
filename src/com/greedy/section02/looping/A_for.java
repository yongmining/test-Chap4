package com.greedy.section02.looping;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class A_for {
	
	public void testSimpleForStatement() {
		
		/* [for문 표현식]
		 * for(초기식; 조건식; 증감식) {
		 *     조건을 만족하는 경우 수행할 구문(반복할 구문)
		 * } 
		 * */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력하세요 : ");
//		String str = sc.nextLine();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public void testForExample() {
		
		/* 5명의 학생 이름을 입력받아 출력을 해보자
		 * 이때, 한 명 이름 입력받은 후 한 명 이름 출력을 반복
		 * */
		
		
//		System.out.print("1 번째 학생 이름을 입력해주세요 : ");
//		String student1 = sc.nextLine();
//		System.out.println("1 번째 학생 이름은 " + student1  + "입니다.");
//		
//		System.out.print("2 번째 학생 이름을 입력해주세요 : ");
//		String student2 = sc.nextLine();
//		System.out.println("2 번째 학생 이름은 " + student2  + "입니다.");
//		
//		System.out.print("3 번째 학생 이름을 입력해주세요 : ");
//		String student3 = sc.nextLine();
//		System.out.println("3 번째 학생 이름은 " + student3  + "입니다.");
//		
//		System.out.print("4 번째 학생 이름을 입력해주세요 : ");
//		String student4 = sc.nextLine();
//		System.out.println("4 번째 학생 이름은 " + student4  + "입니다.");
//		
//		System.out.print("5 번째 학생 이름을 입력해주세요 : ");
//		String student5 = sc.nextLine();
//		System.out.println("5 번째 학생 이름은 " + student5  + "입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " 번째 학생의 이름을 입력해주세요 : ");
			String student = sc.nextLine();
			System.out.println(i + " 번째 학생 이름은 " + student + "입니다.");
		}
	}
	
	public void testForExample2() {
		
		/* 1 ~ 10까지의 합계를 구하시오
		 * */
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//		int num5 = 5;
//		int num6 = 6;
//		int num7 = 7;
//		int num8 = 8;
//		int num9 = 9;
//		int num10 = 10;
//		
//		int sum = 0;
//		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
//		sum += num6;
//		sum += num7;
//		sum += num8;
//		sum += num9;
//		sum += num10;
//		
//		System.out.println("sum : " + sum);
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);	
		
	}
	
	public void testForExample3() {
		
		/* 5 ~ 10 사이의 난수를 발생시켜서
		 * 1부터 발생한 난수까지의 합을 출력하세요
		 * */
		
		int random = (int) (Math.random() * 6) + 5;
		
		int sum = 0;
		
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		
//		if(random == 5) {
//			sum += 5;
//		} else if(random == 6) {
//			sum += 5;
//			sum += 6;
//		} else if(random == 7) {
//			sum += 5;
//			sum += 6;
//			sum += 7;
//		} else if(random == 8) {
//			sum += 5;
//			sum += 6;
//			sum += 7;
//			sum += 8;
//		} else if(random == 9) {
//			sum += 5;
//			sum += 6;
//			sum += 7;
//			sum += 8;
//			sum += 9;
//		} else {
//			sum += 5;
//			sum += 6;
//			sum += 7;
//			sum += 8;
//			sum += 9;
//			sum += 10;
//		}
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random + "까지의 합은 : " + sum);
	}
	
	public void testForExample4() {
		
		/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결해본다.
		 * (첫 번째 정수가 반드시 작아야 하는 것은 아니다.)
		 *  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		int sum = 0;
		
//		if(first > second) {
//			
//			for(int i = second; i <= first; i++) {
//				sum += i;
//			}
//		} else {
//			
//			for(int i = first; i <= second; i++) {
//				sum += i;
//			}
//		}
		
		int min = 0;
		int max = 0;
		
		if(first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
	
	public void printSimpleGugudan() {
		
		/* 키보드로 2~9 사이의 숫자를 입력받아
		 * 2~9 사이인 경우 해당 단의 구구단을 출력,
		 * 그렇지 않은 경우 "반드시 2 ~ 9 사이의 양수를 입력해야 합니다." 출력
		 * */
		
		/* 5 * 1 = 5
		 * 5 * 2 = 10
		 * 5 * 3 = 15
		 * 5 * 4 = 20
		 * 5 * 5 = 25
		 * 5 * 6 = 30
		 * 5 * 7 = 35
		 * 5 * 8 = 40
		 * 5 * 9 = 45
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			
//			System.out.println(dan + " * " + 1 + " = " + (dan * 1));
//			System.out.println(dan + " * " + 2 + " = " + (dan * 2));
//			System.out.println(dan + " * " + 3 + " = " + (dan * 3));
//			System.out.println(dan + " * " + 4 + " = " + (dan * 4));
//			System.out.println(dan + " * " + 5 + " = " + (dan * 5));
//			System.out.println(dan + " * " + 6 + " = " + (dan * 6));
//			System.out.println(dan + " * " + 7 + " = " + (dan * 7));
//			System.out.println(dan + " * " + 8 + " = " + (dan * 8));
//			System.out.println(dan + " * " + 9 + " = " + (dan * 9));
			
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
		} else {
			System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
		}
	}
}


















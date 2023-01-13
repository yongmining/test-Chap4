package com.greedy.section02.looping;

import java.util.Scanner;

public class C_while {

	public void testSimpleWhileStatement() {
		
		/* [while문 표현식]
		 * 초기식;
		 * while(조건식) {
		 * 		조건식을 만족하는 경우 수행할 구문(반복할 구문);
		 * 		증감식;
		 * }
		 * */
		
//		for(int i = 1; i<=10; i++;) {
//			System.out.println(i);
//		}
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			
			i++;
		}
		
	}

	public void testWhileExample1() {
		
		/* 입력한 문자 열의 인데스를 이용하여 문자 하나씩 출력해보기 */
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(i + " : " + str.charAt(i));
		}
		
		
		int index = 0;
		while(index < str.length()) {
			System.out.println(index + " : " + str.charAt(index));
			index++;
		}
		
		
	}
	
	public void testWhileExample2() {
		/* 정수 하나를 입력 받아 1부터 입력받은 정수까지의 합계를 출력 
		 *  단 , while문을 이용해서 작성하세요.
		 * */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		int result = 0;
		while(i <= num ) {
			
			result += i;
			i++;
			
		}
		System.out.println("result : " + result);
	
		
		
	}
	
	public void testWhileExample3() {
		/* while문을 이용하여 구구단 2단 ~ 9단 출력하기 */
		
//		for(int dan = 2; dan < 10; dan++) {
//			for (int su = 1; su < 10; su++) {
//				System.out.println(dan + " * " + su + " = " + (dan * su));
//				su++;
//			}
//		System.out.println();
//		dan++;
//		}
		
		
		
		int dan = 2;
		int su = 1;
		int gob = 0;
		
		while(dan < 10) {
			su = 1;
			
			while(su < 10) {
				gob = dan * su;
				System.out.println(dan + " * " + su + " = " + gob);
				su++;
			}
			dan ++;
			
			
		}
		
//		int dan = 2;
//		while (dan < 10) {
//			int su = 2;
//			while ( su < 10 ) {
//				su++;
//			}
//			dan++;
			
//		}
	}
}
		
	
	



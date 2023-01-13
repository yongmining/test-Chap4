package com.greedy.section03.branching;

public class B_continue {
	public void testSimpleContinueStatement() {
		
		/* continue문은 반복문 내에서 사용한다.
		 * 해당 반복문의 회차를 중간에 멈추고 다시 증감식으로 넘어가게 한다,
		 * 일반적으로 if(조건식) { continue; } 처럼 사용한다.
		 * */
		
		/* 1부터 100 사이의 값 출력
		 * 단, 4의 배수이면서 5의 배수인 값만 출력
		 * */
		
		for(int i = 1; i <= 100; i++) {
			if(!(i % 4 == 0 && i % 5 == 0)) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}

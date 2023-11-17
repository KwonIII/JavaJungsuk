package ch4;

import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1;//1~100사이 랜덤수
		System.out.println("answer = "+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수 입력>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 입력");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 입력");
			}
		}while(input != answer);
		
		System.out.println("정답입니다.");
		
	}

}

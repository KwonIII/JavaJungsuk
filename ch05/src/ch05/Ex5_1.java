package ch05;

import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int arr3[] = {100,95,80,70,60};
		char chArr[] = {'a','b','c','d'};
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = i+1;	//1~10의 숫자를 순서대로 배열에 넣는다.
		}
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*10)+1;	//1~10의 숫자를 순서대로 배열에 넣는다.
		}
//		배열에 저장된 값들을 출력
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(chArr);
		
	}

}

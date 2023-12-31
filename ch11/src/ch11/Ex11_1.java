package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
//		기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
//		ArrayList에는 객체만 저장가능
//		autoboxing에 의해 기본형이 참조형으로 자동 변환
//		list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		//Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1);	//list1과 list2를 정렬한다.
		Collections.sort(list2);	//Collections.sort(List l)
		
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0,"1");
		//indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("index="+list1.indexOf(1));
		list1.remove(1);	//인덱스가 1인 객체를 삭제
		list1.remove(new Integer(1));//리스트의 숫자1을 삭제
		
	}//main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}
}//close

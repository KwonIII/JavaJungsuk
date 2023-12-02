package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		//set크기가 6보다 작은동안 1~45사이의 난수를 저장
		for(int i = 0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			
		}
		
		System.out.println(set);	
		
		//Set은 순서가 없기 때문에 정렬불가. 그래서 List로 만들어서 정렬
		List list = new LinkedList(set);	//LinkedList(Collection c)
		Collections.sort(list);		//collections.sort(List list)
		System.out.println(list);
	}

}

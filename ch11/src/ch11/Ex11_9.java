package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();//Set은 중복X, 순서X
		
		for(int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		
		System.out.println(set);
		
		//HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator(); // 1회용

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		//Iterator는 1회용이라 다쓰고나면 다시 얻어와야한다.
		it = list.iterator(); //새로운 Iterator객체를 얻는다.

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}

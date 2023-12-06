package ch14;

import java.util.function.Function;

public class Ex14_0 {

	public static void main(String[] args) {
//		Function<String,Integer> f  =(String s) -> Integer.parseInt(s);
//		Function<String,Integer> f  = 클래스이름::메서드이름;
		Function<String,Integer> f = Integer::parseInt;	//메서드참조
		Function<String,Integer> f1 = (String s) -> Integer.parseInt(s);//람다식
		System.out.println(f1.apply("100")+200);
	}

}

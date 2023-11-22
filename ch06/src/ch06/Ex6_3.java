package ch06;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " +c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height+")"); 
		System.out.println("c2는 " + c2.kind + ", " +c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;	//c1.width로 써도 에러는 안나지만 클래스변수는 클래스이름.으로 쓰는게 좋다(공통으로 사용되는 속성이기 때문)
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " +c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height+")"); 
		System.out.println("c2는 " + c2.kind + ", " +c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height+")");
		
		
	}

}
class Card{
	String kind;	//무늬(인스턴스 변수)
	int number;		//숫자(인스턴스 변수)
	
	
	static int width = 100;	//폭(클래스 변수, static이 붙음)
	static int height = 250;	//높이(클래스 변수, static이 붙음)
}

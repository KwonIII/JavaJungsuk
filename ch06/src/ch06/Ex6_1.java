package ch06;

public class Ex6_1 {

	public static void main(String[] args) {
		Tv t;	//Tv인스턴스를 참조하기 위한 참조변수 t선언
		t = new Tv();	//Tv인스턴스를 생성
		t.channel = 7;	//Tv인스턴스의 멤버변수 channel의 값을 7로 변경
		t.channelDown();	//Tv인스턴스의 메서드 ChannelDown()을 호출
		System.out.println("현재 채널은 "+t.channel+"입니다.");
	}

}


class Tv{
//	Tv의 속성(멤버변수)
	String color;	//색상
	boolean power;	//전원상태(on/off)
	int channel;	//채널
	
	//Tv의 기능(메서드)
void power() {power = !power;}	//Tv를 켜거나 끄는 기능
void channelUp() {++channel;}	//Tv의 채널을 높이는 기능
void channelDown() {--channel;}	//Tv의 채널을 낮추는 기능

}
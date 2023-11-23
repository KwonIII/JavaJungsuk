package ch07;

class Tv{
	boolean power;	//전원상태(on/off)
	int channel;	//채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends Tv{//캡션(자막)을 보여주는 기능
	boolean caption;	//캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {	//캡션상태가 on(true)일때만 text보여줌
			System.out.println(text);
		}
	}
}
public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;	//조상클래스로부터 상속받은 멤버
		stv.channelUp();	//조상클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;	//캡션(자막)기능을 켠다.
		stv.displayCaption("Hello, World");
	}

}

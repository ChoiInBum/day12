package thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("내용이 출력된다~~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MainClass03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str;
	A03 a = new A03();
	a.setDaemon( true );
	a.start();
	
	while(true) {
		System.out.print("문자열 입력 : ");
		str = input.next();
		System.out.println("입력한 값 : "+str);
		
		if( str.equals("end")) {
			System.out.println("프로그램 종료");
			break;
		}
	}
	
	System.out.println("메인을 종료합니다");
	System.out.println("메인을 종료합니다");
	System.out.println("메인을 종료합니다");
}
}












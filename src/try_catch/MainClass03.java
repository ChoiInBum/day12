package try_catch;

import java.util.Scanner;

class A{ }
class B extends A{ }

public class MainClass03 {
public static void main(String[] args) {
	B a = new B();
	A b = new B();
	try {
		int[] arr = {10,20,30};
		for(int i=0 ; i<3 ; i++) {
			System.out.println( arr[i] );
		}
		int n1 = 10, n2 = 0;
		System.out.println( n1/n2 );
	}catch ( Exception e ) {
		//System.out.println("인덱스 범위를 벗어났습니다!");
		//e.printStackTrace();
	}
	System.out.println("다음 문장들 실행");
}
}







package try_catch;

import java.util.Scanner;

class TestClass04{
	public void test() {
		Scanner input = new Scanner(System.in);
		int n1=10, n2=2;
		try {
			System.out.println( n1 / n2 );
			return;
		} catch (Exception e) {
			System.out.println("문제발생!!!");
		}finally {
			System.out.println("finally 실행");
			input.close();
		}
		System.out.println("다음 문장들 실행");
	}
}
public class MainClass04 {
public static void main(String[] args) {
	TestClass04 t = new TestClass04();
	t.test();
}
}



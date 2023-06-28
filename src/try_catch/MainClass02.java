package try_catch;

public class MainClass02 {
public static void main(String[] args) {
	try {
		int[] arr = {10,20,30};
		for(int i=0 ; i<55555 ; i++) {
			System.out.println( arr[i] );
		}
		int n1 = 10, n2 = 0;
		System.out.println( n1/n2 );
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("인덱스 범위를 벗어났습니다!");
	}catch(ArithmeticException ee ) {
		System.err.println("0으로 나눌수 없음!!!!");
	}
	System.out.println("다음 문장들 실행");
}
}









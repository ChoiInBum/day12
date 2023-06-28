package try_catch;
class TestClass05{
	public void test1() throws InterruptedException {
		System.out.println("test111");
		test2();
	}
	public void test2() throws InterruptedException {
		System.out.println("test222");
		Thread.sleep(0);
	}
}
public class MainClass05 {
public static void main(String[] args) throws InterruptedException {
	TestClass05 t = new TestClass05();
	t.test1();
}
}

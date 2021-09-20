package test_demo_07;

public class Test {

	String version = "1.5.1";
	boolean processOrder() {
	   return true;
	}
	
	public static void main(String[] args) {
		Test t = new Test();

		System.out.println(t.processOrder());
	}
}

package test_demo_09;
/*��·�߼������*/
public class Test07 {
	
	public static void main(String[] args) {
		int a = 5;
		boolean b = (a++ > 5) && (a > 7);
//		boolean b = (a > 7) && (a++ > 5);
		System.out.println("b = " + b + ", a = " + a);
		
	}

}

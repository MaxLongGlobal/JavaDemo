package test_demo_09;

public class Test08 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 1;
		int c = 4;
		a += b;
		System.out.println(" a += b : a = " + a);
		a -= b;
		System.out.println(" a -= b : a = " + a);
		a *= b;
		System.out.println(" a *= b : a = " + a);
		a /= b;
		System.out.println(" a /= b : a = " + a);
		a <<= b;

		System.out.println(" a <<= b : a = " + a);
		a >>= b;
		System.out.println(" a >>= b : a = " + a);
		a &= b;
		System.out.println(" a &= b : a = " + a);
		a ^= b;
		System.out.println(" a ^= b : a = " + a);	
		a |= b;
		System.out.println(" a |= b : a = " + a);	
		a %= b;
		System.out.println(" a &= b : a = " + a);	
		c >>>= 2;
		System.out.println(" c >>>= 2 : c = " + c);	
		a <<= 2;
		System.out.println(" a <<= 2 : a = " + a);	
		
		
	}
	
}

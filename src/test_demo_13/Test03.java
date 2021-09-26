package test_demo_13;

public class Test03 {

	public static void main(String[] args) {
		Integer i = 3;
		Integer x = 4;
		Short y = 3;
		
		System.out.println(i.equals(x));
		System.out.println(i.equals(y));
		System.out.println(Math.max(1.2, 0.9));
		System.out.println(Math.min(1.2, 0.9));
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.sqrt(14));
		System.out.println(Math.random());
		System.out.println(i.byteValue());
		System.out.println(i.intValue());
		System.out.println(i.doubleValue());
		
		Double k = 100.35;
		Double m = 103.95;
		Double n = 100.75;
		System.out.println(Math.rint(k));
		System.out.println(Math.rint(m));
		System.out.println(Math.rint(n));
		
	}
}

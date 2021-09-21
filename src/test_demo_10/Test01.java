package test_demo_10;

import test_demo_09.Test10;

public class Test01 {
	public static void main(String[] args) {
		
		Test10 t10 = new Test10();
		
		boolean result = t10 instanceof Test10; 
		System.out.println(" result is " + result);
		
	}
}

package test_demo_09;

public class Test05 {
	public static void main(String[] args) {
		int a = 60; /* 60 = 0011 1100 */ 
	    int b = 13; /* 13 = 0000 1101 */
	    int c = 1;
	    
	    System.out.println("a & b : " + (a & b));
	    System.out.println("a | b : " + (a | b));
	    System.out.println("a ^ b : " + (a ^ b));
	    System.out.println("~c : " + (~c));
	    System.out.println("a >> 2 : " + (a >> 2));
	    System.out.println("a << 2 : " + (a << 2));
	    System.out.println("a >>> 2 : " + (a >>> 2));
	    
	}

}

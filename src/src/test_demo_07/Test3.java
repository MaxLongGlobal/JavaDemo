package test_demo_07;

public class Test3 {

	private static int numInstances = 0;
	protected static int getCount() {
		return numInstances;
	}
	
	private static void setCount() {
		numInstances ++;
	}
	Test3(){
		
		Test3.setCount();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Starting with " + Test3.getCount() 
		+ " instances");
		
		for (int i = 0; i < 500; i++) {
			new Test3();
		}
		System.out.println("Created with " + Test3.getCount() + " instances");
	}
}

package test_demo_01;

public class TestDemo {
	public TestDemo(String name){
	      //�������������һ��������name
	      System.out.println("С���������� : " + name ); 
	   }
    /* ��һ��Java����
     * ��������ַ��� Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // ��� Hello World
    	TestDemo myDog = new TestDemo("Сè");
    }

}

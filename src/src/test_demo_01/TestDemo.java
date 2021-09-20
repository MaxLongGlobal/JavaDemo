package test_demo_01;

public class TestDemo {
	public TestDemo(String name){
	      //这个构造器仅有一个参数：name
	      System.out.println("小狗的名字是 : " + name ); 
	   }
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    	TestDemo myDog = new TestDemo("小猫");
    }

}

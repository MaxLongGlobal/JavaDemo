package test_demo_07;

public class Test6 {
	public static int value = 10;
	  // 下面是声明常量的实例
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
 
	public void changeValue(){
	  value = 12; //将输出一个错误
	}
	public static void main(String[] args) {
	  Test6 t = new Test6();
	  t.changeValue();
	  System.out.println(value);
	  System.out.println(Test6.BOXWIDTH + "\n" + Test6.TITLE);
	}
}

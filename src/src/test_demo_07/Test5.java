package test_demo_07;

public class Test5 {
	public static int value = 10;
	  // 下面是声明常量的实例
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
 
	public void changeValue(){
	  value = 12; //将输出一个错误
	}
	public static void main(String[] args) {
	  Test5 t = new Test5();
	  t.changeValue();
	  System.out.println(value);
	  System.out.println(Test5.BOXWIDTH + "\n" + Test5.TITLE);
	}
}

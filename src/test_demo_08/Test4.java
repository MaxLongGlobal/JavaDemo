package test_demo_08;

public class Test4 {
	public static int value = 10;
	  // 下面是声明常量的实例
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
 
	public void changeValue(){
	  value = 12; //将输出一个错误
	}
	public static void main(String[] args) {
	  Test4 t = new Test4();
	  t.changeValue();
	  System.out.println(value);
	  System.out.println(Test4.BOXWIDTH + "\n" + Test4.TITLE);
	}
}

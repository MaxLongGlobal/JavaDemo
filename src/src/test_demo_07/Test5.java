package test_demo_07;

public class Test5 {
	public static int value = 10;
	  // ����������������ʵ��
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
 
	public void changeValue(){
	  value = 12; //�����һ������
	}
	public static void main(String[] args) {
	  Test5 t = new Test5();
	  t.changeValue();
	  System.out.println(value);
	  System.out.println(Test5.BOXWIDTH + "\n" + Test5.TITLE);
	}
}

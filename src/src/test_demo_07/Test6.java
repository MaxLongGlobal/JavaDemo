package test_demo_07;

public class Test6 {
	public static int value = 10;
	  // ����������������ʵ��
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
 
	public void changeValue(){
	  value = 12; //�����һ������
	}
	public static void main(String[] args) {
	  Test6 t = new Test6();
	  t.changeValue();
	  System.out.println(value);
	  System.out.println(Test6.BOXWIDTH + "\n" + Test6.TITLE);
	}
}

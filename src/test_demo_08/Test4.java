package test_demo_08;

public class Test4 {
	public static int value = 10;
	  // ����������������ʵ��
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
 
	public void changeValue(){
	  value = 12; //�����һ������
	}
	public static void main(String[] args) {
	  Test4 t = new Test4();
	  t.changeValue();
	  System.out.println(value);
	  System.out.println(Test4.BOXWIDTH + "\n" + Test4.TITLE);
	}
}

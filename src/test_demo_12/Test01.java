package test_demo_12;
//Java switch case ���
//switch case ����ж�һ��������һϵ��ֵ��ĳ��ֵ�Ƿ���ȣ�ÿ��ֵ��Ϊһ����֧��

//switch case ����﷨��ʽ���£�
//
//switch(expression){
//    case value :
//       //���
//       break; //��ѡ
//    case value :
//       //���
//       break; //��ѡ
//    //�����������������case���
//    default : //��ѡ
//       //���
//}

public class Test01 {
	public static void main(String[] args) {
		int key = 10;
		switch (key) {
		case 1:
			System.out.println("1");
			break;

		default:
			System.out.println("2");
			break;
		}
		System.out.println("end");
		

		int i = 0;
		switch(i){
	         case 0:
	            System.out.println("0");
	         case 1:
	            System.out.println("1");
	         case 2:
	            System.out.println("2");
	         default:
	            System.out.println("default");
	     }
	}
}

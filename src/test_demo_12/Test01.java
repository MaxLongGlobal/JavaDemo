package test_demo_12;
//Java switch case 语句
//switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。

//switch case 语句语法格式如下：
//
//switch(expression){
//    case value :
//       //语句
//       break; //可选
//    case value :
//       //语句
//       break; //可选
//    //你可以有任意数量的case语句
//    default : //可选
//       //语句
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

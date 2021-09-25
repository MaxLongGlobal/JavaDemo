package test_demo_11;
//if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行
public class Test01 {
	public static void main(String[] args) {
		int num = 10;
		if(num < 10) {
			System.out.println("This is a 'if' statement");
		}
		else {
			System.out.println("This is a 'else' statement");
		}
	}
}

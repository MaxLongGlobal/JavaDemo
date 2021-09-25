package test_demo_11;

//if...else if...else 语句
//if 语句后面可以跟 else if…else 语句，这种语句可以检测到多种可能的情况
public class Test02 {
	public static void main(String[] args) {
		int num = 20;
		if(num < 10) {
			System.out.println("This is a 'if' statement");
		}
		else if(num == 20){
			System.out.println("This is a 'else if #1' statement");
		}
		else if(num == 30){
			System.out.println("This is a 'else if #2' statement");
		}
		else {
			System.out.println("This is a 'else' statement");
			
		}
	}
}

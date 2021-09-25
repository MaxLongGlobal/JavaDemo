package test_demo_10;
// for(声明语句 : 表达式){...}
public class Test04 {
	
	public static void main(String[] args) {
		int [] nums = {1, 2 , 3, 4, 5};
		for(int num : nums) {
			System.out.println("num = " + num);
		}
		String [] strs = {"12", "34", "ds", "55", "66", "", "24"};
		for(String str : strs) {
			System.out.println("str = " + str);
		}
		
	}

}

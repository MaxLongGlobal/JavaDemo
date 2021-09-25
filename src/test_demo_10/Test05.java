package test_demo_10;
//break 用于循环或switch
public class Test05 {
	public static void main(String[] args) {
		
		int i = 10;
		do {
			
			System.out.println("i = " + i);
			if(i == 10) {
				break;
			}
			i--;
		}while(i > 0);
		
		String [] strs = {"1", "2", "3", "4", "5", "6", "7", "8"};
		for(String str :strs) {
			System.out.println("str = " + str);
			if(str == "3") {
				break;
			}
		}
	}
}

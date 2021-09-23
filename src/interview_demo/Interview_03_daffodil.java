package interview_demo;

//如果一个 3 位数等于其各位数字的立方和，则称这个数为水仙花数。  
//例如：153 = 1^3 + 5^3 + 3^3，因此 153 就是一个水仙花数
//求1000以内的水仙花数（3位数）


public class Interview_03_daffodil {

	public void Daffodil() {
		String str = "";
		int a, b, c;
		for(int i = 100; i< 1000; i++) {
//
			//百位数
			a = i/100;
			//十位数
			b = (i - a*100)/10;
			//个位数
			c = i - a*100- b*10;
			if(i == (a*a*a + b*b*b + c*c*c)) {
				str += Integer.toString(i) + ",";
//				System.out.println("daffodil is " + i + a + b + c);
			}
			
		}
		System.out.println("all daffodil is " + str);

	}
	
	public static void main(String[] args) {
		Interview_03_daffodil daf = new Interview_03_daffodil();
		daf.Daffodil();
	}
}

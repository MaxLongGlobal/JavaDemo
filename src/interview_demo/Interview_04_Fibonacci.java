package interview_demo;

//斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，
//指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，
//斐波纳契数列以如下被以递归的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）

public class Interview_04_Fibonacci {

	public long fibonacci(long n) {

		long sum;
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			sum = fibonacci(n-1) + fibonacci(n-2);
			return sum;
		}
		
	}
	
	public static void main(String[] args) {
		Interview_04_Fibonacci fib = new Interview_04_Fibonacci();
		String str = "";
		for(long i = 1; i<=50; i++) {
			str +=" " + Long.toString(fib.fibonacci(i));
		}
		System.out.println("Daffodil is" + str + ".");
	}
}

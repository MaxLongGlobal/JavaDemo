package interview_demo;

//쳲��������У�Fibonacci sequence�����ֳƻƽ�ָ����С�����ѧ���а��ɶࡤ쳲�������Leonardoda Fibonacci�������ӷ�ֳΪ���Ӷ����룬���ֳ�Ϊ���������С���
//ָ��������һ�����У�1��1��2��3��5��8��13��21��34����������ѧ�ϣ�
//쳲��������������±��Եݹ�ķ������壺F(1)=1��F(2)=1, F(n)=F(n-1)+F(n-2)��n>=2��n��N*��

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

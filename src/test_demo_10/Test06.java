package test_demo_10;
// continue �ж�ĳ��ѭ��Ȼ�����
public class Test06 {
	public static void main(String[] args) {
		int [] nums = {1, 3, 4, 5, 32, 98};
		for(int num : nums) {
			if(num == 5) {
				System.out.println("skip at " + num);

				continue;
			}
			System.out.println("num = " + num);

		}
		
	}
}

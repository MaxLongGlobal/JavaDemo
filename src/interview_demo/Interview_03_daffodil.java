package interview_demo;

//���һ�� 3 λ���������λ���ֵ������ͣ���������Ϊˮ�ɻ�����  
//���磺153 = 1^3 + 5^3 + 3^3����� 153 ����һ��ˮ�ɻ���
//��1000���ڵ�ˮ�ɻ�����3λ����


public class Interview_03_daffodil {

	public void Daffodil() {
		String str = "";
		int a, b, c;
		for(int i = 100; i< 1000; i++) {
//
			//��λ��
			a = i/100;
			//ʮλ��
			b = (i - a*100)/10;
			//��λ��
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

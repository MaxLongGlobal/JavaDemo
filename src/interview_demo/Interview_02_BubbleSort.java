package interview_demo;

import java.util.Arrays;

//����һ������ [64, 34, 25, 12, 22, 11, 90, 10]�������������顣
//ð������Bubble Sort��Ҳ��һ�ּ�ֱ�۵������㷨
//ʾ�����
//1.������
//2.�����������ڵ�����ǰһ�������ں�һ��������ʱ���������򲻽����������ж���һ�����ڵ���
//3.ÿ��ѭ������ѭ��0 ��ѭ��7-0-1 �� ��ѭ��1 ��ѭ��7-1-1 

public class Interview_02_BubbleSort {

	public void BubbleSort(int[] bubble) {
		int temp;
		for (int i = 0; i< bubble.length; i++) {
//			System.out.println("bubble = " + bubble[i]);
			for (int j = 0; j< bubble.length-1-i; j++) {
				if (bubble[j] > bubble[j + 1]) {
					temp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(bubble));
//		Arrays.stream(bubble).forEach(num -> System.out.println(num));
//		for (int i = 0; i< bubble.length; i++) {
//			System.out.println(", " + bubble[i]);
//		}
	}
	
	public static void main(String[] args) {

		int [] bubble = {64, 34, 25, 12, 22, 11, 90, 10};
//		System.out.println("bubble = " + bubble.length);
		Interview_02_BubbleSort b_sort = new Interview_02_BubbleSort();
		b_sort.BubbleSort(bubble);
	}
}

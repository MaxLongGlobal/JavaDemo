package interview_demo;

import java.util.Arrays;

//给定一个数组 [64, 34, 25, 12, 22, 11, 90, 10]，求排序后的数组。
//冒泡排序（Bubble Sort）也是一种简单直观的排序算法
//示例结果
//1.给数据
//2.当数组中相邻的数其前一个数大于后一个数，此时交换；否则不交换；继续判断下一个相邻的数
//3.每次循环：主循环0 自循环7-0-1 ； 主循环1 自循环7-1-1 

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

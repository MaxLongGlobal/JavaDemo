package interview_demo;

import java.util.Scanner;

//����һ���ַ������ҵ����ĵ�һ�����ظ����ַ�������������������
//��������ڣ��򷵻� -1
//ʾ��
//s = "leetcode" ����0
//s = "loveleetcode" ����2 

public class Interview_01_StringCount {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String str = x.nextLine();
//		System.out.println("str = " + str);
		int len = str.length();
		int i, j, tag = 0, tagg = 0;
		//1.���������ַ���
		for(i = 0; i < len; i++) {
//			System.out.println("s = " + str.charAt(i));
			for(j = 0; j < len; j++) {	
				//2.��¼�ַ��������ظ����ַ����ڲ����tagΪ1
				if ((str.charAt(i) == str.charAt(j)) && (i!=j)) {
					tag = 1;
				}
			}
			//3.����һ�κ��ж�û���ظ����ַ���ֱ���ж�ѭ������֮����tagΪ0
			if(tag == 0) {
				System.out.println("s = "+ str + ", un-repeat character's index is " + i);
				//4.��¼û���ظ����ַ����ڽ����tagg����Ϊ1����֮һֱΪĬ��ֵ0
				tagg = 1;
				break;
				}
			else {
				tag = 0;
			}
				
		}
		//5.���ظ��ַ����ڣ�ֱ�ӷ���-1
		if(tagg == 0) {
			System.out.println("s = "+ str + ", not find return -1");
		}
	}
}

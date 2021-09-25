package interview_demo;

import java.util.Scanner;

//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。
//如果不存在，则返回 -1
//示例
//s = "leetcode" 返回0
//s = "loveleetcode" 返回2 

public class Interview_01_StringCount {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String str = x.nextLine();
//		System.out.println("str = " + str);
		int len = str.length();
		int i, j, tag = 0, tagg = 0;
		//1.遍历所有字符串
		for(i = 0; i < len; i++) {
//			System.out.println("s = " + str.charAt(i));
			for(j = 0; j < len; j++) {	
				//2.记录字符串中有重复的字符存在并标记tag为1
				if ((str.charAt(i) == str.charAt(j)) && (i!=j)) {
					tag = 1;
				}
			}
			//3.遍历一次后判断没有重复的字符就直接中断循环，反之重置tag为0
			if(tag == 0) {
				System.out.println("s = "+ str + ", un-repeat character's index is " + i);
				//4.记录没有重复的字符存在将标记tagg设置为1，反之一直为默认值0
				tagg = 1;
				break;
				}
			else {
				tag = 0;
			}
				
		}
		//5.有重复字符存在，直接返回-1
		if(tagg == 0) {
			System.out.println("s = "+ str + ", not find return -1");
		}
	}
}

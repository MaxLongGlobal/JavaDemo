/**
* <p>Project:JavaDemo</p>
* <p>Title: Test02.java</p>
* <p>Description:</p>
* <p>Copyright: Copyright (c) 2021</p>
* <p>Company: www.baidudu.com</p>
* @author max
* @date 2021-09-26 20:30.905
* @version 1.0
 */
package test_demo_16;

/**
* <p>Title: Test02</p>
* <p>Description: </p>
* @author max
* @date 2021-09-26 20:30.906
*/

public class Test02 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello welcome to learn Java, Thanks!");
		sb.insert(5, ',');
		System.out.println(sb);
		sb.delete(5, 6);
		System.out.println(sb);
		sb.append('-');
		System.out.println(sb);
		sb.insert(0, "well. ");
		System.out.println(sb);
	}

}

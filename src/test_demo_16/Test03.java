/**
* <p>Project:JavaDemo</p>
* <p>Title: Test03.java</p>
* <p>Description:</p>
* <p>Copyright: Copyright (c) 2021</p>
* <p>Company: www.baidudu.com</p>
* @author max
* @date 2021-09-26 20:49.365
* @version 1.0
 */
package test_demo_16;

/**
* <p>Title: Test03</p>
* <p>Description: </p>
* @author max
* @date 2021-09-26 20:49.365
*/

public class Test03 {

	public static void main(String args []) {
		
		StringBuffer sb = new StringBuffer("hello u are a big bug.");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" Pass."));
		System.out.println(sb.substring(8));
		sb.ensureCapacity(90);
		System.out.println(sb.capacity() + " " + sb.length());
		
	}
}

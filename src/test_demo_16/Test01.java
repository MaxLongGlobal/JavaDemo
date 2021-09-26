/**
 * 
 */
package test_demo_16;

/**
 * @author max
 *
 */
public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("hello welcome to learn Java, Thanks!");
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

package test_demo_15;

public class Test02 {
	public static void main(String args []) {
		String str = "This is a big bug at this stage.";
		System.out.println(String.format("at index is %d char is %s", str.length()-2, str.charAt(str.length()-2)));
		System.out.println(str.compareTo("This is a big bug at this stage."));
		System.out.println(str.equals(str));
		System.out.println(str.compareToIgnoreCase("This is"));
		System.out.println(str.concat(" end!!!"));
		
		
		StringBuffer sb = new StringBuffer("This is a big bug at this stage.");
		StringBuilder sd = new StringBuilder("This is a big bug at this stage.");
		System.out.println(str.contentEquals(sb));
		System.out.println(str.equals(sd));
//		String st = "h";
		char [] ch = {'i', 's', 'h', 'g'};
		System.out.println(String.copyValueOf(ch, 0, 4));
		
		String str01 = "www.baidu.com";
		System.out.println(str01.endsWith(".c0m"));
		for(String s : str01.split("\\.")) {
			System.out.println(s);

		}
		
	}

}

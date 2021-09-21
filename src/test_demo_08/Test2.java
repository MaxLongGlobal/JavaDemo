package test_demo_08;

public class Test2 {
	private String format;
	public String getFormat() {
		return this.format;
		}
	public void setFormat(String format) {
		this.format = format;
		}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		t.setFormat("good work");
		System.out.println(t.getFormat());
	}
}

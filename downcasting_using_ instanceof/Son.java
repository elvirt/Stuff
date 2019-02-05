class Father{}

public class Son extends Father {
	
	static void method(Father father) {
		Son s = (Son) father;
		System.out.println("downcasting was successful!!!");
	}

	public static void main(String[] args) {
		Father f = new Son();
		Son.method(f);
	}
}
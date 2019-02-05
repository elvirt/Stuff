
public class Test {

	public static void main(String[] args) {
		Printable p = new B();
		Call c = new Call();
		c.invoke(p);
	}
}
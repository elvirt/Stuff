public interface Printable {}

class A implements Printable{
	public void a() {
		System.out.println("a method");
	}
}
	
class B implements Printable{
	public void b() {
		System.out.println("b method");
	}
}

class Call{
	void invoke(Printable p) { //upcasting
		if(p instanceof A) {
			A a = (A) p; //downcasting
			a.a();
		}
		if(p instanceof B) {
			B b = (B) p; // downcasting
			b.b();
		}
	}
}
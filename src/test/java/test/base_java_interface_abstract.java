package test;

interface A {
	void a();

	void b();

	void c();

	void d();
}

//abstract class can implement multiple interfaces
abstract class B implements A {
	public void b() {
		System.out.println("I am C");
	}

	public void a() {
		System.out.println("//abstract class can implement multiple interfaces");
		System.out.println("I am a");
	}
}

//a class can extend another java class and implement multiple java interfaces
class M extends B {
	public void c() {
		System.out.println("//a class can extend another java class and implement multiple java interfaces");
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

//abstract class can have both abstract and non-abstract methods
abstract class Wrestle {
	abstract void abstract_method();

//declare non-abstract methods it has default implementation
	String objectName = " ";

	Wrestle(String name) {
		this.objectName = name;
	}

	public void non_abstract_method(int age) {
		System.out.println("A non abstract method, from an Abstract class");
		System.out.println("\t" + this.objectName + ", age= " + age);
	}
}

class N extends Wrestle {

	N(String name) {
		super(name);
	}

	@Override
	void abstract_method() {
		System.out.println("Implementing an abstract method OVERRIDDEN from Abstract class");
	}

}

class base_java_interface_abstract {
	public static void main(String args[]) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
		Wrestle wr = new N("Iylin");
		wr.abstract_method();
		wr.non_abstract_method(18);
	}
}

/*
 * 
 * //abstract class can implement multiple interfaces I am a I am C //a class
 * can extend another java class and implement multiple java interfaces I am b I
 * am d Implementing an abstract method OVERRIDDEN from Abstract class A non
 * abstract method, from an Abstract class Iylin, age= 18
 * 
 */

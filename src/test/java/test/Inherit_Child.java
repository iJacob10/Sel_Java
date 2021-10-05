package test;

public class Inherit_Child extends Inherti_Parent { // Parent constructor gets inherited
	String name = "QAClickAcademy";

	public Inherit_Child() {
		super();// this should be always be at first line
		System.out.println("child class construtor"); // Child constructor gets inherited

	}

	public void getStringdata() {
		System.out.println(super.name); // Parent variable gets inherited
		System.out.println(name); // Child variable gets inherited
	}

	public void getData() {
		super.getData(); 							// Parent method gets inherited
		System.out.println("I am from child class");// Child method gets inherited
	}

	public static void main(String[] args) {

		Inherit_Child cd = new Inherit_Child();

		// Parent constructor gets inherited
		// Child constructor gets inherited
		cd.getStringdata(); //Parent variable gets inherited  // Child variable gets inherited 
		cd.getData();        //Parent method gets inherited  // Child method gets inherited 
	}
}

/*
 Parent class construtor
child class construtor
Iylin
QAClickAcademy
 I am from parent class
I am from child class

 * 
 */
package test;

public class Interface_class implements Interface_1,Interface_2 {

	public static void main(String[] args) {
		Interface_1 i1 = new Interface_class();
		i1.FlashYellow();
		i1.greenGo();
		i1.redStop();
		
		Interface_2 i2 = new Interface_class();
		i2.Trainsymbol();
		Interface_class i3 = new Interface_class();
		i3.FlashYellow();
		i3.self();
		i3.Trainsymbol();
	}

	public void self()
	{
		System.out.println("Calling self class method");
	}
	public void Trainsymbol() {
		System.out.println("Implementing interface2 - Trainsymbol");
	}

	public void greenGo() {
		System.out.println("Implementing interface1 - greenGo");
	}

	public void redStop() {
		System.out.println("Implementing interface1 - redStop");
	}

	public void FlashYellow() {
		System.out.println("Implementing interface1 - FlashYellow");
	}

}

/*
Implementing interface1 - FlashYellow
Implementing interface1 - greenGo
Implementing interface1 - redStop
Implementing interface2 - Trainsymbol
Implementing interface1 - FlashYellow
Calling self class method
Implementing interface2 - Trainsymbol
*/

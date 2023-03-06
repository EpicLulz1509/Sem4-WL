// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class A
{
	void display()
	{
		System.out.println("Inside A's m1 method");
	}
}

class B extends A
{
	// overriding m1()
	void display()
	{
		System.out.println("Inside B's m1 method");
	}
}

class C extends A
{
	// overriding m1()
	void display()
	{
		System.out.println("Inside C's m1 method");
	}
}

class dispatch{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
        a.display();
        b.display();
        c.display();

        A ref1 = new B();
        ref1.display();
	}
}

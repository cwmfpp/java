class A
{
	void fun1()
	{
		System.out.println("class A fun1");
	}
}

abstract class B
{
	abstract void fun2();
}

class C extends A
{
	B getB()
	{
		return new B()
		{
			public void fun2()
			{
				System.out.println("class B fun2");
			}
		};
	}
}

class Test
{
	static void method1(C c)
	{
		c.fun1();
	}

	static void method2(C c)
	{
		c.getB().fun2();
	}

	public static void main(String[] args)
	{
		C c = new C();
		method1(c);
		method2(c);
	}
}


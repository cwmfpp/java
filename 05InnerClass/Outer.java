/*
1 内部类访问外部类不需要实例化外部类.(外部类.this.member)
2 调用内部类方法需要实例化外部类 
3 没有直系亲属关系的内部类相互调用成员变量方法需要实例化外部类
4 静态内部类可以有静态的方法,非静态内部类不可以有静态的方法

 */
class Outer
{
	private int index = 100;

	public void print()
	{
		System.out.println("Outer print");
	}

	public void func()
	{
		class Middle
		{
			private int index = 80;
			class Bottem
			{
				private int index = 70;

				public void print()
				{
					int index = 65;
					System.out.println("stack index=" + index);
					System.out.println("this index=" + this.index);
					System.out.println("Middle index=" + Middle.this.index);
					System.out.println("Inner index=" + Outer.this.getInner().index);
					System.out.println("Outer index=" + Outer.this.index);
				}
			}
		}
		Middle mid = new Middle();
		Middle.Bottem bott = mid.new Bottem();
		bott.print();

	}

	class Inner
	{
		private int index = 60;
		public void print()
		{
			int index = 30;
			System.out.println("Inner print");
			System.out.println("index="+index);
			System.out.println("Inner index=" + this.index);
			System.out.println("Outer index="+Outer.this.index);
		}
	}

	class Second
	{
		private int index = 90;
	}

	Inner getInner()
	{
		return new Inner();
	}

	/*
	public static void main(String[] args)
	{
		Outer out = new Outer();
		Outer.Inner inner = out.getInner();
		//Inner inner1 = new Inner();//error Inner no static member
		inner.print();
	}
	*/
}


class Test
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
	/*	out.print();
		Outer.Inner inner = out.getInner();
		inner.print();
	*/
	/*
		Outer.Inner inner = out.new Inner();
		inner.print();
	*/

		out.func();
	}
}


public class Operator{
	public static void main(String[] args)
	{
		/*
		int i = 0xffffffff;
		int c = i<<2;
		System.out.println(i);
		System.out.println(c);
		System.out.println(Integer.toHexString(c));
		c = i >> 2;//sign shift
		System.out.println(Integer.toHexString(c));
		c = i >>> 2;//unsign shift
		System.out.println(Integer.toHexString(c));
		*/
		Point pt;
		pt = new Point();
		pt.output();
		pt.x = 10;
		pt.y = 20;
		pt.output();
		pt = new Point(1, 2);
		pt.output();
		pt.output(3, 3);
		pt.output();
		Point.output(5);
	}
}

class Point{
	Point(int a, int b)
	{
		x = a;
		y = b;
		PI = 3.1415926;
	}

	Point()
	{
		//this(1, 1);//call Point(1, 1)
		x = 5;
		y = 6;
		PI = 3.14;
	}

	int x, y;
	static int z;
	final double PI;
	static final int value = 123;

	void output(int x, int y)
	{
		this.x = x; // != x = x
		this.y = y; // != y = y
		z = 100;
	}
	void output()
	{
		System.out.println(x);	
		System.out.println(y);	
	}
	static void output(int a)
	{
		a = a;
		System.out.println("static output");
		//System.out.println(x);//error	
		System.out.println(z);	
	}
}


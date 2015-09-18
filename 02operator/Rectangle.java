class Rectangle
{
	int l, w;
	int perimeter()
	{
		return 2*(l + w);
	}

	int area()
	{
		return l*w;
	}
	
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle();

		rect1.l = 5;
		rect1.w = 10;
		System.out.println("perimeter of rect1 = " + rect1.perimeter());
	}
}


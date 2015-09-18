

class Garbage
{
	int index;
	static int count;

	Garbage()
	{
		count++;
		setID(count);
	}

	private void setID(int id)
	{
		index = id;
		System.out.println("setID "+index+" create");
	}

	protected void finalize()
	{
		System.out.println("finalize "+index+" recycle");
	}

	public static void main(String[] args)
	{
		new Garbage();
		new Garbage();
		new Garbage();
		new Garbage();
		System.gc();
	}
}

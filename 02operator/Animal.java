//super instanceof 
class Animal
{
	Animal()
	{
		System.out.println("animal construct");
	}
	int height, weight;

	void eat()
	{
		System.out.println("animal eat");
	}

	void sleep()
	{
		System.out.println("animal sleep");
	}

	void breathe()
	{
		System.out.println("animal breathe");
	}
}

class Fish extends Animal
{
	Fish()
	{
	//	super();
		//Animal();//error
		System.out.println("fish construct");
	}
	int height;

	void breathe()//override
	{
		//super.breathe();
		//super.height = 40;
		System.out.println("fish breathe");
	}

}

class Integration
{
	static void fn(Animal an)
	{
		an.breathe();
	}
	public static void main(String[] args)
	{
		Fish fh = new Fish();
		Animal an = fh;

		an.breathe();
		fh.breathe();
		if(an instanceof Animal)
		{
			System.out.println("an is animal's instance");
		}

		if(an instanceof Fish)
		{
			System.out.println("an is fish's instance");
		}else
		{
			System.out.println("an isnot fish's instance");
		}

		if(fh instanceof Animal)
		{
			System.out.println("fish is Animal's instance");
		}else
		{
			System.out.println("fish isnot Animal's instance");
		}
	}
}


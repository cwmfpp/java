class Dmeng implements VideoCard
{
	String name;
	Dmeng()
	{
		name = "Dmeng VideoCard";
		System.out.println("Dmeng construct");
	}
	public void display()
	{
		System.out.println("Dmeng display");
	}

	public void setName(String name)
	{
		System.out.println("Dmeng setName");
		this.name = name;
	}
	public String getName()
	{
		System.out.println("Dmeng getName");
		return name;
	}
}

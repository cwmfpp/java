interface Sport
{
	void run();//public abstract
	void jump();
}


class Athlete implements Sport
{
	public void run()
	{
		System.out.println("run");
	}

	public void jump()
	{
		System.out.println("jump");
	}

	public static void main(String[] args)
	{
		Athlete ath = new Athlete();
		ath.run();
		ath.jump();
	}
}


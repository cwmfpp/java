interface Machine
{
	void run();
}

class Person
{
	void run()
	{
		System.out.println("person run");
	}
}

class Robot extends Person
{
	private class MachineHeart implements Machine
	{
		public void run()
		{
			System.out.println("MachineHeart run");
		}
	}

	Machine getMachine()
	{
		return new MachineHeart();
	}
}

class Test
{
	public static void main(String[] args)
	{
		Robot robot = new Robot();
		Machine machine = robot.getMachine();

		machine.run();
		robot.run();
	}
}

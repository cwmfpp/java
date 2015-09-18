class Computer
{
	public static void main(String[] args)
	{
		Dmeng d = new Dmeng();
		Mainboard m = new Mainboard();

		m.setCPU("intel's CPU");
		m.setVideoCard(d);
		m.run();
	}
}

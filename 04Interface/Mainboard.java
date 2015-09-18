class Mainboard
{
	String strCPU;
	VideoCard vc;

	public void setCPU(String strCPU)
	{
		this.strCPU = strCPU;
	}

	public void setVideoCard(VideoCard vc)
	{
		this.vc = vc;
	}

	public void run()
	{
		System.out.println(strCPU);
		System.out.println(vc.getName());
		vc.display();
		System.out.println("mainboard runing");
	}
}

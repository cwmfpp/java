//public > protected > default > private
//class > package > extends > noclass&nopackage&extends
//static final abstract native synchronized
package cn.bj;
import log.Log;

public abstract class Authority1
{
	public void pubMethod()
	{
		System.out.println(Log.__line__() + ":" + Log.__func__());
	}
	
	protected void proMethod()
	{
		System.out.println(Log.__line__() + ":" + Log.__func__());
	}
	
	void defMethod()
	{
		System.out.println(Log.__line__() + ":" + Log.__func__());
	}
	
	private void priMethod()
	{
		System.out.println(Log.__line__() + ":" + Log.__func__());
	}


	private void sameClassCall()
	{
		pubMethod();	
		proMethod();	
		defMethod();	
		priMethod();	
	}

	public final void noChange()
	{
		System.out.println(Log.__line__() + ":" + Log.__func__());
	}

	public abstract void abstractFunc();//no function entity

/*
	public static void main(String[] args)
	{
		Authority1 ath1 = new Authority1();
		ath1.pubMethod();
		ath1.proMethod();
		ath1.defMethod();
		ath1.priMethod();
	}
*/
}


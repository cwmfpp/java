//javac -d . Authority2.java
//java us.york.Authority2
package us.york;
import cn.bj.Authority1;

class Authority2 extends Authority1
{
	/*
	//package cn.bj
	public void samePackage()
	{
		Authority1 auh1 = new Authority1();
		auh1.pubMethod();
		auh1.proMethod();
		auh1.defMethod();
		//auh1.priMethod();//cannot call
	}
	*/

	/*
	//extends Authority1
	//package us.york;
	//import cn.bj.Authority1;
	public void extendsRelation()
	{
		pubMethod();
		proMethod();
	//	auh1.defMethod();//cannot call
	//	auh1.priMethod();//cannot call
	}
	*/
/*
	public void noSamePackageNoExtendsRelation()
	{
		Authority1 auh1 = new Authority1();
		auh1.pubMethod();
	//	auh1.proMethod();
	//	auh1.defMethod();
	//	auh1.priMethod();
	}
*/

	/*
	//extends Authority1
	//error for final
	public void noChange()
	{
	
	}
	*/
	//from Authority1
	public void abstractFunc()
	{
	}

	public static void main(String[] args)
	{
	//	Authority2 auh2 = new Authority2();
	//	auh2.samePackage();
	//	auh2.extendsRelation();
	//	auh2.noSamePackageNoExtendsRelation();
	}
}

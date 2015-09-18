import java.io.*;

class Except
{
	Except() throws ArithmeticException 
	{
		System.out.println("Except construct");
	}
	public int division(int a, int b) throws Exception, MyselfException
	{
		if(b < 0)
		{
			throw new MyselfException("myself exception");
		}
		try
		{
			return a/b;
		}
	
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			throw new Exception("cwm division cannot zero");
		}
	}

	public int func(int a, int b) throws Exception, MyselfException
	{
		return division(a, b);
	}
}

class ChildExcept extends Except
{
	ChildExcept() throws FileNotFoundException
	{
		System.out.println("ChildExcept construct");
	}
	public int division(int a, int b) throws Exception//, MyselfException//, FileNotFoundException
	{
		return a/b;	   
	}
}

class MyselfException extends Exception
{
	MyselfException(String str)
	{
		super(str);
	}
}



class TestExcept
{
	public static void main(String[] args) //throws Exception
	{
		int result = 0;
		Except ex = new Except();
		try
		{
			result = ex.division(5, -1);//(5, 0)(5, -1)
			//return;
		}

		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("ArithmeticException");
		}

		catch(MyselfException e)
		{
			System.out.println("myself===============exception");
		}

		catch(Exception e)
		{
	//		System.out.println(e.getMessage());
			System.out.println(e.toString());
		//	e.printStackTrace();
			//System.out.println("cannot divied by zero");
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("finally");//return, System.exit(-1)
		}
		System.out.println("finished");
	}
}


package log;

public class Log 
{
	public static String __file__()
	{
		StackTraceElement traceElement = ((new Exception()).getStackTrace())[1]; 
		return traceElement.getFileName(); 
	}
	
	public static String __func__()
	{
		StackTraceElement traceElement = ((new Exception()).getStackTrace())[1]; 
		return traceElement.getMethodName(); 
	}

	public static int __line__()
	{
		StackTraceElement traceElement = ((new Exception()).getStackTrace())[1]; 
		return traceElement.getLineNumber(); 
	}

	//public static void main(String[] args)
	{
	}
}

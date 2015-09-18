
public class HelloWorld {
	public static void main(String[] args)
	{
		System.out.println("HelloWorld");
		byte b;//1bytes,-128~127
		b = 3;
		b = (byte)(b*3);
		System.out.println(b);
		short s;
//		int i;
		long l;
		char ch;//2bytes,0~65535
		ch = 'a';
		System.out.println(ch);
		System.out.println((int)ch);
		float f;
		f = 1.3f;
		System.out.println(f);
		double d;
		d = 1.3;
		System.out.println(d);
		boolean bool;
		//bool = 1;//error
		bool = true;
		System.out.println(bool);
		
//		if(1)//error
		{
			System.out.println("wei zhen 1");
		}
		if(true)
		{
			System.out.println("wei zhen true");
		}

		int[] num = {1, 2, 3};
	//	num = {1, 2, 3};//error
		//int [] num2 = new int[]{1, 2, 3};//ok
		//int [] num2 = new int[3]{1, 2, 3};//error
		int [] num3;
		num3 = new int[3];
		num3[0] = 1;
		num3[1] = 2;
		num3[2] = 3;

		int [][] array;
		array = new int[3][4];
		array[0][2] = 13;

		int [][]array2;
		array2 = new int[3][];
		array[0] = new int[5];
		array[1] = new int[3];
		array[2] = new int[6];
		
		int [][]array3 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8}};
		System.out.println(array3[0][2]);
		System.out.println(array3[1][2]);
		System.out.println(array3[2][1]);
		//int [2][]array3 = new int[][]{{1, 2, 3}, {4, 5, 6}};//error
		int i = 3;
		int count;
		count = (i++) + (i++) + (i++);
		System.out.println(i);
		System.out.println(count);
		i = 3;
		count = (++i) + (++i) + (++i);
		System.out.println(i);
		System.out.println(count);

	}
}

package fib;

public class Fib {
	public static void main(String[] args)
	{
		int f = fib(20);
		System.out.println("Result: " + f);
	}
	
	// 0 1 1 2 3 5 8 13 21 ...
	
	public static int fib(int idx)
	{
		int a = 0;
		int b = 1;
		int temp_c = 0;
		
		if (idx == 1)
		{
			return a;
		}
		for(int i = 2; i < idx; i++) // i++ means i += 1 means i = i + 1
		{
			System.out.println("Iteration #" + i);

			temp_c = b;
			//b = b + a; 
			b += a;
			a = temp_c;
			
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + temp_c);
		}
		return b;
	}
}

package test_git_jenkins;

public class Program 
{

	public static void main(String[] args) 
	{
		int a = 8;
		int b = 8;
		
		System.out.println("This is first code");
		System.out.println("multiplication:" + (a * b));
		System.out.println("addition:" + (a + b));
		System.out.println("subtraction:" + (a - b));
		System.out.println("division:" + (a/b));

		Calc(47);
		
	}
	
	public static void Calc(int a)
	{
		System.out.println(a);
		
		a = a * 2;
		a = a + 3;
		a = a * 5;
		a = a - 6;
		
		System.out.println(a);
		
	}

	
	
}

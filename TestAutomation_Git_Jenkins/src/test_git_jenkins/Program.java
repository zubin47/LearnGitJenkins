package test_git_jenkins;

public class Program 
{

	public static void main(String[] args) 
	{
		int a = 11;
		int b = 10;
		
		System.out.println("This is math project");
		System.out.println("multiplication:" + (a * b));
		System.out.println("addition:" + (a + b));
		System.out.println("subtraction:" + (a - b));
		System.out.println("division:" + (a/b));
		System.out.println("modulus:" + (a%b));

		Calc(Calc(420));
		
	}
	
	public static int Calc(int a)
	{
		System.out.println(a);
		
		a = a * 2;
		a = a + 3;
		a = a * 5;
		a = a - 6;
		
		System.out.println(a);
		
		return a;
	}

	
	
}

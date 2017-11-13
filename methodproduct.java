import java.util.Scanner;

public class methodproduct {
	public static void main(String[] args) {
		int i;
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		i = console.nextInt(); 
		System.out.println("Prod of digits "+PrintNumber(i));
		console.close();
	}
	
	public static int PrintNumber(int n)
	{
		int prod=1,i=1,rem;
		String str=Integer.toString(n);
		int length=str.length();
		System.out.println("length "+length);
		while(i<=length)
		{
			rem=n%10;
			n=n/10;
			prod=rem*prod;
			i++;
		}
		return prod;
	}
}


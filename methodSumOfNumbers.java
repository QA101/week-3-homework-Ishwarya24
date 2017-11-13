import java.util.Scanner;

public class methodSumOfNumbers {
	public static void main(String[] args) {
		int i;
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		i = console.nextInt(); 
		System.out.println("sum of digits "+PrintNumber(i));
		console.close();
	}
	
	public static int PrintNumber(int n)
	{
		int sum=0,i=0,rem;
		String str=Integer.toString(n);
		int length=str.length();
		System.out.println("length "+length);
		while(i<length)
		{
			rem=n%10;
			n=n/10;
			sum=rem+sum;
			i++;
		}
		return sum;
	}
}


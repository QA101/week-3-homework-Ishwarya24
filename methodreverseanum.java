import java.util.Scanner;

public class methodreverseanum {
	public static void main(String[] args) {
		PrintNumber();
		
	}
	
	public static void PrintNumber()
	{
		int i=1,rem,n;
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		n = console.nextInt(); 
		String str=Integer.toString(n);
		int length=str.length();
		System.out.println("length "+length);
		System.out.print("Reverse of the number ");
		while(i<=length)
		{
			rem=n%10;
			System.out.print(rem);
			n=n/10;			
			i++;
		}
		console.close();
	}

}

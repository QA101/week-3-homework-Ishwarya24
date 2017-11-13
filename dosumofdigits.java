import java.util.Scanner;

public class dosumofdigits {
	public static void main(String[] args)
	{
		int n,sum=0,i=1,rem;
		System.out.println("Enter a 3 digit number");
		Scanner console=new Scanner(System.in);
		n=console.nextInt();
		do
		{			
			rem=n%10;
			n=n/10;
			sum=rem+sum;
			i++;		
		}while(i<=3);
	System.out.println("sum of the digits is  "+sum);
		console.close();	
		
}
}

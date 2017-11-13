import java.util.Scanner;

public class doprodofdigits {
	public static void main(String[] args)
	{
		int n,prod=1,i=1,rem;
		System.out.println("Enter a 3 digit number");
		Scanner console=new Scanner(System.in);
		n=console.nextInt();
		do
		{			
			rem=n%10;
			n=n/10;
			prod=rem*prod;
			i++;		
		}while(i<=3);
		
	System.out.println("product of the digits is  "+prod);
		console.close();	
		
}
}

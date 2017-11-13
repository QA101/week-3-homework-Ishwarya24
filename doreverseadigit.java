import java.util.Scanner;

public class doreverseadigit {
	public static void main(String[] args)
	{
		int n,i=1,rem;
		System.out.println("Enter a 3 digit number");
		Scanner console=new Scanner(System.in);
		n=console.nextInt();
		System.out.print("Reverse of number ");
		do
		{			
			rem=n%10;			
			System.out.print(rem);	
			n=n/10;
			i++;		
		}while(i<=3);
		
	
		console.close();	
		
}
}

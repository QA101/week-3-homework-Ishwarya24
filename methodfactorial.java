import java.util.Scanner;

public class methodfactorial {

	public static void main(String[] args)
	{
		factorial();
}
	public static void factorial()
	{
	int n,i=1,fact=1;
	System.out.println("Enter the number ");
	Scanner console=new Scanner(System.in);
	n=console.nextInt();
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("Factorial of "+n+" is "+fact);
	console.close();
	
}
}
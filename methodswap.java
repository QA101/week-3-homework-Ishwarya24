import java.util.Scanner;

public class methodswap {
	public static void main(String[] args)
	{
		int x,y;
		System.out.println("Enter the values of x and y");
		Scanner console=new Scanner(System.in);
		x=console.nextInt();
		y=console.nextInt();
		swap(x,y);
		console.close();
		
	}


public static void swap(int i,int j)
{
	int temp;
	temp=i;
	i=j;
	j=temp;
	System.out.println("x= "+i+" y= "+j);
	
}
}
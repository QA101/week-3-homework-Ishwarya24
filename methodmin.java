import java.util.Scanner;

public class methodmin {
	public static void main(String[] args)
	{
		int x,y;
		System.out.println("Enter the values of x and y");
		Scanner console=new Scanner(System.in);
		x=console.nextInt();
		y=console.nextInt();
		//max(x,y);
		System.out.println("Minimum of two numbers is "+min(x,y));
		console.close();
		
	}
	public static int min(int i,int j)
	{
		int min;
		if(i<j)
		{
			min=i;
		}
		else
		{
			min=j;
		}
		return min;
	}
}

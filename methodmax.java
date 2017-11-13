import java.util.Scanner;

public class methodmax {
	public static void main(String[] args)
	{
		int x,y;
		System.out.println("Enter the values of x and y");
		Scanner console=new Scanner(System.in);
		x=console.nextInt();
		y=console.nextInt();
		//max(x,y);
		System.out.println("Maximum of two number is "+max(x,y));
		console.close();
		
	}
	public static int max(int i,int j)
	{
		int max;
		if(i>j)
		{
			max=i;
		}
		else
		{
			max=j;
		}
		return max;
	}
	
}

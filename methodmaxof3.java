import java.util.Scanner;

public class methodmaxof3 {
	public static void main(String[] args)
	{
		int x,y,z;
		System.out.println("Enter the values of x,y and z");
		Scanner console=new Scanner(System.in);
		x=console.nextInt();
		y=console.nextInt();
		z=console.nextInt();
		//max(x,y);
		System.out.println("Maximum of three numbers is "+max(x,y,z));
		console.close();
		
	}
	public static int max(int i,int j,int k)
	{
		int max;
		if((i>j)&&(i>k))
		{
			max=i;
		}
		else if((j>i)&&(j>k))
		{
			max=j;
		}
		else
		{
			max=k;
		}
		return max;
	}
}

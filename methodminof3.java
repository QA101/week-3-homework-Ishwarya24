import java.util.Scanner;

public class methodminof3 {
	public static void main(String[] args)
	{
		int x,y,z;
		System.out.println("Enter the values of x,y and z");
		Scanner console=new Scanner(System.in);
		x=console.nextInt();
		y=console.nextInt();
		z=console.nextInt();
		//max(x,y);
		System.out.println("Minimum of three numbers is "+min(x,y,z));
		console.close();
		
	}
	public static int min(int i,int j,int k)
	{
		int min;
		if((i<j)&&(i<k))
		{
			min=i;
		}
		else if((j<i)&&(j<k))
		{
			min=j;
		}
		else
		{
			min=k;
		}
		return min;
	}

}

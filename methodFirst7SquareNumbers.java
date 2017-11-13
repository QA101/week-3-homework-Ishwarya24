import java.util.Scanner;

public class methodFirst7SquareNumbers {
	public static void main(String[] args) {
		int i;
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		i = console.nextInt(); 
		System.out.println(PrintNumber(i));
		console.close();
	}
	
	public static String PrintNumber(int n)
	{
		int i=1;
		int j=1;
		String Final = "";
		while(i<=n)
		{
			int sqrt = (int) Math.sqrt(j);
			
			if(sqrt * sqrt == j)
			{
				Final = Final + " " + j;	
				i++;
			}
			j++;
		}
		return Final;
	}
}

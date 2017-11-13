import java.util.Scanner;

public class dosqrtnum {
	public static void main(String[] args)
	{
		int start_number = 1;
		int end_number = 1;
		int i;
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		i = console.nextInt(); 
		do
		{
			int sqrt = (int) Math.sqrt(start_number);
			
				if(sqrt * sqrt == start_number)
				{
					System.out.println(start_number + " = " + sqrt + "*" + sqrt);	
					end_number++;
				}
				start_number++;
		}while(end_number <= i);	
		console.close();
	}

}

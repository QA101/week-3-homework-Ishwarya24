import java.util.Scanner;

public class cbrtnum {
	public static void main(String[] args)
	{
		int start_number = 1;
		int end_number = 1;
		int i;
		System.out.println("enter the number");
		Scanner console = new Scanner(System.in);
		i = console.nextInt(); 
		while(end_number <= i)
		{
			int cbrt = (int) Math.cbrt(start_number);
			
				if(cbrt * cbrt * cbrt == start_number)
				{
					System.out.println(start_number + " = " + cbrt + "*" + cbrt+"*"+cbrt);	
					end_number++;
				}
				start_number++;
		}	
		console.close();
	}

}

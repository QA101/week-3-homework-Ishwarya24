
public class dosumofeven {
	public static void main(String[] args)
	{
		int i=1,sum=0;
		do
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
			i++;
	}while(i<=10);
		System.out.println("sum of evendigits "+sum);
}

}

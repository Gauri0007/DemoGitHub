package test1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=19;
		int count =0;
		
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				
					count++;
				
			}
			
				if(count==2)
				{
					System.out.println(" prime number");
				}
				else
				{
					System.out.println("Not prime number");
				}
			}
			
		
		else
		{
			System.out.println("Number is Prime number");
		}

	}

}


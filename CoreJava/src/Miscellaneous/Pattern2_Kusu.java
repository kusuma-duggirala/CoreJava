package Miscellaneous;

public class Pattern2_Kusu 
{
static int temp;
static int i;
static int j;
	public static void main(String[] args) 
	{
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<=i+4;j++)
			{
				//int k=(i+j)%6;
				if(j>4)
					System.out.print(j-4+" ");
				else
					System.out.print(j+" ");
				
			}
			System.out.println();
			//temp=j++;
		}

	}

}

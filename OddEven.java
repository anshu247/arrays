import java.util.*;
class OddEven
{
	public static void main(String[]args)
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the 2 digit number:");
		int arr1[][]=new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr1[i][j]=scan.nextInt();
				while(true)
				{
					if(arr1[i][j]>9&& arr1[i][j]<100)
						break;
					else
					{
						System.out.println("re-enter");
						arr1[i][j]=scan.nextInt();
					}
				}
			}
		}
		System.out.println("the 2-D array is:");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr1[i][j]%2==1)
				{
					arr1[i][j]=arr1[i][j]*2;

				}
				else
					continue;
			}
		}
		System.out.println("the new array is:");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(arr1[i][j]+"t");
			}
				System.out.println("  ");
			
		}
	}
}
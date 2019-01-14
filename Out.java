import java.util.*;
class Out
{


public static void main(String[] args)
{
	int selement;
	int flag=-1;
	int counter;
	Scanner scan= new Scanner(System.in);
	int elements[]=new int[10];
	System.out.println("enter the element in the arrays:");
	for(counter=0;counter<10;counter++)
	{
	elements[counter]=scan.nextInt();

	}
	System.out.println("the  following elements were enterd in the arrays");
	for(counter=0;counter<10;counter++)
	{
	System.out.println(elements[counter]);

	}
	System.out.println("enter the element to be searched:");
	selement=scan.nextInt();
	for(counter =0;counter<10;counter++)
	{
		if(elements[counter]==selement)
		{
		flag=1;
		break;

		}
		else
		{
			flag=-1;
		}
	}
	if(flag==1)
	{
	System.out.println("element"+elements[counter]+"found at position:"+(counter+1));

	}
    else
    {
    System.out.println("elements not founded"+flag);
    }

	}
}
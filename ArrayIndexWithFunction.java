import java.util.*;
public class  ArrayIndexWithFunction //class name
{
	int selement;
	int flag=-1;
	int counter;
	Scanner scan= new Scanner(System.in);
	int elements[]=new int[10];
	void enterElements()
	{//function
	   System.out.println("enter the 10 element in the arrays:");
	   for(counter=0;counter<10;counter++)//loop for to take input from user to put elements in arrays
	   {
	   elements[counter]=scan.nextInt();

	   }
	}

   void displayElements(){//function
   	System.out.println("the  following elements were enterd in the arrays");
	for(counter=0;counter<10;counter++)//loop for displaying the elements
	{
	System.out.println(elements[counter]);

	}
   }
   void checkElements()
   {for(counter =0;counter<10;counter++)//function
	   {//condition if element matchs the user input to check wherther there is the element or not 
		 if(elements[counter]==selement)//check the elements if matchs or not 
		   {
		     flag=1;//true then value of flag become 1 from -1
		     break;//if condition matchs then breaks from if

		   }
		 else
		   {
			 flag=-1;// false then flag value remain same
		   }
	}
	if(flag==1)//if flag is =1 the element found at a certain position
	   {
	    System.out.println("element"+elements[counter]+"found at position:"+(counter+1));

	   }
    else//not found the value of flag is -1
       {
         System.out.println("elements not founded"+flag);
       }

	}

public static void main(String[] args)
{   
	int selement;
	ArrayIndexWithFunction aiwf=new ArrayIndexWithFunction();//classname (we have created a object)=new classname()
	aiwf.enterElements();//enter the number of elements
	System.out.print("enter the element you want to find:");//input from user to find the number from the array
	Scanner scan=new Scanner(System.in);
	selement=scan.nextInt();

	aiwf.displayElements();//function to display the elements of arrays
	aiwf.checkElements();//check wheather the element is present in array or not
}
}
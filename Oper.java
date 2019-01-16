import java.util.*;
public class Oper{
	Scanner scan=new Scanner(System.in);
	void Element(int arr[]){
	for (int i =0;i<5;i++)
	{
		System.out.println(int arr[]);
		

		}}
	void Sum(int arr[])
		
	{
     int sum=0;
     for(int i=0;i<5;i++)
     {
     	sum +=arr[i];

     }
     System.out.println(sum );
	}
   void largest(int arr[])
   {
   	int lar=arr[0];
   	for(int i=0;i<5;i++)
   	{
   		if(lar<arr[i])
   		{
   			lar=arr[i];
   		}
   	}
   	System.out.println(max);

   }

   void secondLargest(int arr[]){
   int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}



   void small(int arr[])
   {
   	int small=arr[0];
   	for(int i=0;i<5;i++)
   	{
   		if(small=arr[i])
   		{
   			small=arr[i];
   		}
   	}
   	System.out.println(small);
   }



   void Even(int arr[])
   {
   	int temp=0;
   	for(int i=0;i<5;i++){
   		if(arr[i]%2==0)
   		{
   			temp=temp+1;
   		}
   		System.out.println(temp);
   	}

   }


   void fre(int arr[])
   {
   	System.out.println("enter the eloement to check the frequancy:");
   	int as=scan.nextInt();
   	int fre=0;
   	for(int i=0;i<5;i++)
   	{
   		if (arr[i]==as)
   			{fre++;}

   	}
   	System.out.println(as+"occues"+fre);
   }

   public static void main(String []args)
   {
   	Scanner scan =new Scanner(System.in);
   	char Choice;
   	int op;
   	oper cl=new oper();
   	do{
   		System.out.println("enter the element of Array:");
   		int arr[]=new int[5];
   		for(int i=0;i<5;i++)
   		{
   			arr[i]=scan.nextInt();

   		}
   		System.out.println("Choose:");
   		System.out.println("Choose an option:\n1.Display the elements\n2.Sum of all the elements\n3.Largest number in array");
			System.out.println("4.Smallest number in array\n5.Second Largest number in array\n6.Sum of alternate elements in array");
			System.out.println("7.Count even numbers in array\n8.Frequency of a number in array");
			option = scan.nextInt();
			switch (option)
			{
				case 1:
				{c1.Element(arr[]);
					break;}
				case 2:
				{c1.sum(arr[]);	
					break;}
				case 3:
				{c1.largest(arr[]);
					break;}
				case 4:
				{c1.small(arr[]);	
					break;}
				case 5:
				{c1.secondLargest(arr); 
					break;}
			
				case 6:
				{c1.even(arr);	
					break;}
				case 7:
				{c1.fre(arr);	
					break;}
			}
			System.out.println("If you want to run the program for another array press 'Y' otherwise 'N'");
			choice=scan.next().charAt(0);
		}
		while(choice=='Y');
	}
}
   
   
import java.util.*;
class Twoarray{
	public static void main(String args[])

	{  
      int n,m,counter;


	System.out.println(" enter the 2 sorted arrays");//ask to enter the 2 arrays

       Scanner as=new Scanner(System.in);
       System.out.println("enter the number of element to be stored in array 1:");//ask the user to input the length of the array 1

       int n=as.nextInt();//stored the value of n that is length of array 1
       int[]arr1= new int[n];
       System.out.println("enter the number of element to be stored in array 2 :");// ask the user to input the length of the array 2
       int m=as.nextInt();// stored the value of n that is the length of array 2
       int arr2=new int[m];
       
       System.out.println("enter the number in the array in array 1:");
       for(counter=0;counter<n;counter++)//loop for input the element in the array
       {
       	arr1[counter]=as.nextInt();
       }
        

        for(counter =0;counter<n;counter++)//loop for display the elements of array1
       {
       	System.out.println(arr1[counter]);
       }
       System.out.println("enter the element in array2:");
       //loop for input the elements in the array
       for(counter=0;counter<m;counter++)
       {
       	arr2[counter]=as.nextInt();
       }
       for (counter =0;counter<m;counter++)//loop for display the element of the array2
       {
       	System.out.println(arr2[counter]);
       }
       int[]arr3 =new int [arr1.length + arr2.length];
       int i=0,j=0,k=0;
       while(i<arr1.length && j<arr2.length ){
       	if (arr1[i]<arr2[j]){
       		arr3[k]=arr1[i];
       		i++;
       	} else{
       		arr3[k]=arr2[j];
       		j++;
       	}
       	k++;
       }
        //Copy the remaining elements from array 1 to array 3
       if(i<arr1.length){
       	System.arraycopy(arr1,i,arr3,k,(arr1.length-i));
       }
        //Copy the remaining elements from array 2 to array 3
       if(j<arr2.length){
       	System.arraycopy(arr2,j,arr3,k,(arr2.length-j));
       }
       System.out.println("Merged Sorted Array"+ Arrays.toString(arr3));
}}
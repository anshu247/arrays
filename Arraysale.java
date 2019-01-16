
import java.util.Scanner;

public class Arraysale {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     
       
       int item, salesperson, price, count = 0;
       int[][] arraySales = new int[5][4];
       
        
        for(int i = 0; i < 20; i++){
           
            System.out.println("Enter pay slip values .");
            System.out.println("Sales Person ID(1,2,3,4): ");
            salesperson = input.nextInt();
            System.out.println("Product ID(1,2,3,4,5): ");
            item = input.nextInt();
            System.out.println("Product value: ");
            price = input.nextInt();
            
            arraySales[item-1][salesperson-1] += price;
            
            System.out.println("Enter 1 to terminate || 0 to continue");
            count = input.nextInt();
            if(count == 1)
                break;
       }
        int sum = 0, sp1 =0, sp2 = 0, sp3 = 0, sp4 = 0;
        System.out.printf("%s%8s%7s%8s%8s   %10s\n", "Item Number","SP1", "SP2", "SP3", "SP4", "*Row Total*");
         for(int i=0;i<5;i++){
             System.out.printf("Item %d\t\t", i);
            for(int j=0;j<4;j++){
                System.out.print(arraySales[i][j] + "\t");
                sum += arraySales[i][j]; 
                if(j == 0)
                    sp1 += arraySales[i][j];
                else if(j == 1)
                    sp2 += arraySales[i][j];
                else if(j == 2)
                    sp3 += arraySales[i][j];
                else if(j == 3)
                    sp4 += arraySales[i][j];
            }
            System.out.print(sum); sum = 0;
             System.out.println();
        }
         System.out.println();
         System.out.print("*Col Tot*");
         System.out.printf("%8d%8d%8d%8d\n",sp1, sp2, sp3, sp4);
        
        
        
        
        
        
       
    }
    
}
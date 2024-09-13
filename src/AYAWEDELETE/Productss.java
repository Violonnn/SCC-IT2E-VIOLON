
package AYAWEDELETE;
import java.util.Scanner;

public class Productss {
public void inputP(){
       Products[] pr = new Products[100];
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Products: ");
        int np= sc.nextInt();
        
        for (int i = 0;i < np; i++){
            System.out.println("Enter details of product "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name= sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stocks: ");
            int stocks = sc.nextInt();
            System.out.print("Sold: ");
            int sold = sc.nextInt();
            
            pr[i] = new Products();
            pr[i].addProducts(id, name, price, stocks, sold);        
            
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-20s %-10s\n","ID","Name","Price"," Stocks"
        ,"Sold","Profit","Estimated Profit","Status");
        
        
        double tpg = 0;
        for(int i = 0; i < np; i++){
        tpg = tpg + (pr[i].price * pr[i].sold);
        pr[i].viewProducts();
    }
       System.out.printf("\nGross Profit: "+tpg);
      
        
//        for (int i=0; i < np; i++){
//            pr[i].viewProducts();
//}
        }
}


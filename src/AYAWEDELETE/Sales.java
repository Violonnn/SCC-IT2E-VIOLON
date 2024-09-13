
package AYAWEDELETE;
import java.util.Scanner;

public class Sales {
    public void inputS(){
        Scanner sc = new Scanner(System.in);
        Saless sls = new Saless();
        
        System.out.println("Running Sales Program:\n");
        System.out.print("Enter customer name: ");
        String name = sc.next();
        System.out.print("Enter product name: ");
        String product = sc.next();
        System.out.print("Enter quantity: ");
        int quant = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter cash: ");
        double cash = sc.nextDouble();
        
        sls.addSales(name, product, quant, price, cash);
        sls.viewSales();
    }
}

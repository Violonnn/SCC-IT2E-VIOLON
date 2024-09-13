
package AYAWEDELETE;
import java.util.Scanner;
public class Main {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("[1]Grades\n[2]Products\n[3]Sales\n[4]Account\n");
        System.out.print("Option Number: ");
        int on = in.nextInt();
       
        while (!(on == 1 || on == 2 || on == 3 || on == 4)){
            System.out.print("Error.Option Number: ");
            on = in.nextInt();
        }
        
        
        if (on == 2){
            Productss pr = new Productss();
            pr.inputP();
        } else if (on == 1) {
            Gradess gr = new Gradess();
            gr.inputG();
        } else if (on == 4){
            Account ac = new Account();
            ac.inputA();
        } else if (on == 3){
            Sales ss = new Sales();
            ss.inputS();
        }
        
//        Products[] pr = new Products[100];
//        
//        System.out.println("Enter no. of Products: ");
//        int np= sc.nextInt();
//        
//        for (int i = 0;i < np; i++){
//            System.out.println("Enter details of product "+(i+1));
//            System.out.println("ID: ");
//            int id = sc.nextInt();
//            System.out.println("Name: ");
//            String name= sc.next();
//            System.out.println("Price: ");
//            double price = sc.nextDouble();
//            System.out.println("Stocks: ");
//            int stocks = sc.nextInt();
//            System.out.println("Sold: ");
//            int sold = sc.nextInt();
//            
//            pr[i] = new Products();
//            pr[i].addProducts(id, name, price, stocks, sold);        
//            
//        }
//        double tpg = 0;
//        for(int i = 0; i < np; i++){
//        tpg = tpg + (pr[i].price * pr[i].sold);
//        pr[i].viewProducts();
//    }
//        
//        for (int i=0; i < np; i++){
//            pr[i].viewProducts();
//        }
      
//       Grades gr = new Grades();
//       gr.addGrades(1011, "Violon M", 1.0, 2.2, 2.3, 1.3);
//       gr.viewGrades();

//      Products pr = new Products();
//      pr.addProducts(1011, "Sabon", 30.00, 60, 0);
//      pr.viewProducts();
//     
//      Products pr1 = new Products();
//      pr1.addProducts(1011, "Sabon", 30.00, 0, 0);
//      pr1.viewProducts();

     
    }
    
}

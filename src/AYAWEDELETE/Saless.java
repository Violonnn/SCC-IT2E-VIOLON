
package AYAWEDELETE;


public class Saless {
     String cname, pname;
    int quantity;
    double price, cash;
    
    public void addSales(String c_name, String p_name, int qty, double prc, double csh){
        this.cname = c_name;
        this.pname = p_name;
        this.quantity = qty;
        this.price = prc;
        this.cash = csh;
    }
    
    public void viewSales(){
        System.out.println("\n---------------------------");
        System.out.println("RECEIPT:");
        System.out.println("---------------------------");
        System.out.println("Name: "+cname);
        System.out.println("\nItem Name: "+pname);
        System.out.println("Quantity: "+quantity);
        System.out.println("---------------------------");
        


        System.out.printf("Total Due: %.2f\n", price*quantity);
        


        System.out.printf("Cash: %.2f\n", cash);
        System.out.println("---------------------------");
        


        System.out.printf("Change: %.2f", cash-(price*quantity));
    }
}

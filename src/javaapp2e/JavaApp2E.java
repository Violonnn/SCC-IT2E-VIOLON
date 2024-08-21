
package javaapp2e;

public class JavaApp2E {

 
    public static void main(String[] args) {
      
//        Grades gr = new Grades();
//        gr.addGrades(1011, "Violon", 1.0, 2.2, 3.3, 1.3);
//        gr.viewGrades();
      Products pr = new Products();
      pr.addProducts(1011, "Sabon", 30.00, 60, 0);
     pr.viewProducts();
     
       Products pr1 = new Products();
      pr1.addProducts(1011, "Sabon", 30.00, 0, 0);
     pr1.viewProducts();

    }
    
}

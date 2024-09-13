
package AYAWEDELETE;
import java.util.Scanner;

public class Gradess {
 public void inputG(){
    Scanner in = new Scanner(System.in);
    Grades[] grr = new Grades[100];
    
     System.out.print("Input number of Students: ");
     int st = in.nextInt();
     
     for (int i = 0; i < st; i++){
         System.out.print("ID: ");
         int id = in.nextInt();
         System.out.print("Name: ");
         String name = in.next();
         System.out.print("Prelim: ");
         double pre = in.nextDouble();
         System.out.print("Midterm: ");
         double mid = in.nextDouble();
         System.out.print("Pre-Final: ");
         double pf = in.nextDouble();
         System.out.print("Final: ");
         double f = in.nextDouble();
         
         grr[i] = new Grades();
         grr[i].addGrades(id, name, pre, mid, pf, f);         
     }
     double ave = 0;
     double Oave = 0;
     double Fave = 0;
     for (int i = 0; i < st; i++){
         ave += ((grr[i].p + grr[i].m + grr[i].pf + grr[i].f)/4);
         Oave = ave / st;
     } 
     
      System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
             "ID", "Name", "Prelim","Midterm","Pre-Final","Final","average","remarks");
     
     // 
     int passed = 0, failed = 0;
     for (int i = 0; i < st; i++){
         if (((grr[i].p + grr[i].m + grr[i].pf + grr[i].f)/4) > 3.0) {
             failed = failed + 1;
         }
      else {
             passed = passed + 1;
             }
         grr[i].viewGrades();
     }
     
     System.out.println("No .of Students: "+st);
     System.out.println("Total Class Average: "+Oave);
     System.out.println("No. of Passed: "+passed);
     System.out.println("No of Failed: "+failed);
     
     
}
}

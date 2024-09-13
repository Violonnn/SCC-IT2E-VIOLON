
package AYAWEDELETE;
import java.util.*;

public class Account {
       Scanner sc = new Scanner(System.in);
    Accounts[] acs = new Accounts[100];
    
    int anum;
    String id, fname, lname, email, password, user;
    
    public void inputA(){
        
        System.out.println("Account Information System\n");
        System.out.print("Enter number of accounts: ");
        anum = sc.nextInt();
        
        for(int i = 0; i < anum; i++){
            System.out.println("Enter details of user "+(i+1)+":\n");
            System.out.print("ID: ");
            id = sc.next();
            
            while(validateID(id)){
                id = sc.next();
            }
            
            while(duplicateID(id,anum)){
                id = sc.next();
            }
            
            System.out.print("First name: ");
            fname = sc.next();
            System.out.print("Last name: ");
            lname = sc.next();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Username: ");
            user = sc.next();
            System.out.print("Password: ");
            password = sc.next();
            
            acs[i] = new Accounts();
            acs[i].processAccounts(id, fname, lname, email, user, password);
        }
        
        System.out.printf("\n\n%-5s %-10s %-10s %-20s %-10s %-10s\n","ID", "First Name", "Last Name", "Email", "Username", "Password");
         
        for(int i = 0; i < anum; i++){
            acs[i].viewAccounts();
        }
    }
    
    public boolean validateID(String getID){
        for(char c : getID.toCharArray()){
            if(!Character.isDigit(c)){
                System.out.print("Input invalid: Must not have a letter or a special Character,try again: ");
                return true;
            }
        }
        return false;
    }
    
    public boolean duplicateID(String getID, int max){
        for(int i = 0; i < max; i++){
            if(acs[i] != null && getID.equals(acs[i].id)){
                System.out.print("Input invalid: Must not have a duplicated ID, try again: ");
                return true;
            }
        }
        return false;
    }
}

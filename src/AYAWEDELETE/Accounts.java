
package AYAWEDELETE;


public class Accounts {
  String fname, lname, email, password, username, id;
    
    public void processAccounts(String aid, String first, String last, String mail, String user, String pass){
        this.id = aid;
        this.fname = first;
        this.lname = last;
        this.email = mail;
        this.username = user;
        this.password = pass;
    }
    
    public void viewAccounts(){
         System.out.printf("%-5s %-10s %-10s %-20s %-10s %-10s\n",id, fname, lname, email, username, password);
    }
  
}


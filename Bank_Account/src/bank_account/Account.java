
package bank_account;


public class Account {
    String name;
    String password;
    double balance ;
    
    public Account(String name, String pass ){
         this.name = name;
         this.password = pass;
         this.balance = 2000;
    }
    
    public void deposite(double amount){
           balance = balance+amount;
    }
    public boolean withdraw(double amount){
          if(balance>=amount){
              balance -= amount;
               return true;
          }else{
              return false;
          }
    }
    public double checkBalance(){
        return balance;
    }
    public boolean transfer(Account other,double amount){
          if(balance >= amount){
              this.balance -= amount;
              other.balance += amount;
              return true;
          }else{
              return false;
          }
    }
    public boolean checkName(String name){
        if(this.name.equals(name)){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkPass(String pass){
        return this.password.equals(pass);
    }
}


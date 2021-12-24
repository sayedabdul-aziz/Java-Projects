
package bankacc;

public class BankAccount {
  String name;
  String password;
  double money;

    public BankAccount(String name, String pass , double money) {  //con.
     this.money = money;
     this.name = name;
     password = pass;
    }
   public boolean withdraw(double amount){  //500
      if( money >= amount){  //1000
          money -= amount;   //500
          return true;
      } 
      return false;
  }
   public void deposit(double amount){ //500
         money += amount; //1500
   }
   public double checkBalance(){
       return money;
   }
   public boolean transfer(BankAccount other , double amount){
        if(money >= amount){
            this.money -= amount;
            other.money += amount;
            return true;
        }
        return false;
   }
   public boolean checkName(String name){
       return this.name.equals(name);
   }
   public boolean checkPass(String pass){
       return this.password.equals(pass);
   }
    
}

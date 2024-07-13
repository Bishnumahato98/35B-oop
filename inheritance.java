// public class inheritance {
//     public static void main(String[] args) {
//       programmer p=new programmer();
//       p.salary();
//       p.bomus();  
//     }
// }


// class employee{
//     void salary(){
//         System.out.println("salary = 40000");
//     }
// }

// class programmer extends employee{
//     void bomus(){
//         System.out.println("bonus = 1000");
//     }
// }


// public class inheritance extends claculation  {
    
//     public void mutiplication(int x, int y){
//         z=x*y;
//         System.out.println("The product of x and y is :"+z);
//     }
//     public static void main(String[] args) {
//         int x=20;
//         int y=30;
//         inheritance demo=new inheritance();
//         demo.addition(x, y);
//         demo.subtraction(x, y);
//         demo.mutiplication(x, y);
//     }
    
// }

// class claculation{
//     int z;
//     public void addition(int x, int y){
//         z=x+y;
//         System.out.println("The sum of x and y is :"+z);
//     }

    
//     public void subtraction(int x, int y){
//         z=x-y;
//         System.out.println("The subtraction of x and y is :"+z);
//     }
// }


// int day 3;
// String dayString;
// switch (day) { case 1:
// dayString "Monday"; break;
// 2:
// dayString "Tuesday"; break;
// dayString "Wednesday";
// break; default:
// dayString "Invalid day";
// .println("Day of the week: dayString);




public class inheritance {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println(account.getBalance()); // Output: 1500

        account.withdraw(2000); // Trying to withdraw more than balance
        System.out.println(account.getBalance()); // Output: 1500 (unchanged due to insufficient funds message)
    }
}

class BankAccount {
    private double balance; // private access modifier

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

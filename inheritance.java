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


public class inheritance extends claculation  {
    
    public void mutiplication(int x, int y){
        z=x*y;
        System.out.println("The product of x and y is :"+z);
    }
    public static void main(String[] args) {
        int x=20;
        int y=30;
        inheritance demo=new inheritance();
        demo.addition(x, y);
        demo.subtraction(x, y);
        demo.mutiplication(x, y);
    }
    
}

class claculation{
    int z;
    public void addition(int x, int y){
        z=x+y;
        System.out.println("The sum of x and y is :"+z);
    }

    
    public void subtraction(int x, int y){
        z=x-y;
        System.out.println("The subtraction of x and y is :"+z);
    }
}

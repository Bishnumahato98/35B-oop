public class staticFuction {
    public static int multiply(int a, int b){
        int multiplication= a*b;
        return multiplication;
    }



    public static String vendingMachine(int menu){
        if (menu==1){
            return "coke";
        }
        if (menu==2){
            return "water";
        }
        if (menu==3){
            return "frooti";
        }
        
        return "Invalid menu";
        
    }



    public static String checkeligible(String name, int age) {
        if ( age <0 || age>200){
            return "hello" + name+"Invalid age"; 
        }
             
        
        if ( age <18){
              return "sorry" + name +"youn are not eligible";  
    }
    
    return "Congrulation "+name+ "You are not eligible";
    }


    public static void main(String[] args) {
        /* if the function is stactic and in same class
         * no need to make object simply call
         */
        int multiplyreturn =multiply(10,2);
        System.out.println("Result is "+ multiplyreturn);

        String iget= vendingMachine(1);
        System.out.println("I get "+ iget);

        String check= checkeligible("Ram", 28);
        System.out.println(check);





    }
}

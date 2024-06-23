// import java.util.Scanner;
// public class task5 {
//     public static void main(String[] args) {
//         Scanner scanner =new Scanner(System.in);
        //1. Make a method to check if a number is prime or not. in jva method
    //     int number=3;
    //     if (isPrime(number)){
    //         System.out.println("The number is prime: "+ number);
    //     }else{
    //         System.out.println("The number is not prime:"+number);
    //     }
    // }
    //     public static boolean isPrime(int number){
    //         if (number <= 1) {
    //             return false;
    //         }
    //         if (number <= 3) {
    //             return true;
    //         }

    //         if (number % 2 == 0 || number % 3 == 0) {
    //             return false;
    //         }
    //         for (int i = 5; i * i <= number; i += 6) {
    //             if (number % i == 0 || number % (i + 2) == 0) {
    //                 return false;

    //             }
    //         }
    //         return true;








    //2. Make a method to check if a given number n is even or not.
    //         System.out.print("Enter a number :");
    //         int num=scanner.nextInt();
    //         if(even(num)){
    //             System.out.println("The number is even: "+num);
    //         }else{
    //             System.out.println("The number is not even: "+num);
    //         }

    //         scanner.close();
    //     }
    //         public static boolean even(int num){
    //             return num%2==0;
        
    //         }
    // }




    //3. Make a method to print the table of a given number n.
    //         System.out.print("Enter a number :");
    //         int n=scanner.nextInt();
            

    //         printTable(n);
    //         scanner.close();

    //     }
    //         public static void printTable(int n) {
    //             System.out.println("Multiplication table of " + n + ":");
    //             for (int i = 1; i <= 10; i++) {
    //                 System.out.println(n + " x " + i + " = " + (n * i));
    //             }
    //         }
    // }    

    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.


    public class task5 {
    
        private static int getsquare(int x){
            return x*x;
        }
        public static void main(String[] args) {
            for(int i=1; i<=5; i++){
                int result=getsquare(i);
                System.out.println("Square of "+i+" is :"+result);
            }
        }
    }
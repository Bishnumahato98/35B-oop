import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            //1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
            // System.out.print("Enter your Name: ");
            // String name= scanner.nextLine();
        
            // for(int i=1; i<=5; i++){
            //     System.out.println("Hello "+name);
            // }
            // scanner.close();



            //2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
            // Miles    Kilometers
            // 1    1.609
            // 2    3.218
            // …    ….
            // 9    14.481
            // 10    16.090

            // System.out.println("Miles                 Kilometer");
            // double milesdivision=1.609;
            // for(int i=1; i<=10; i++){
            //     double kilometers=(i*milesdivision);
            //     System.err.println(i + "                     " +kilometers);

            // }
            


                //3. Write a program that generates the following table: 
                // Number    Square
                // 10    100
                // 9    81
                // ..    ….
                // 2    4
                // 1    1

                // System.out.println("Number             square");
                // int num;
                // for (num=10; num>=1; num--){
                //     int feb=num* num;
                //     System.out.println(num+"                   "+ feb);
                // }



                // 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
                //     *****
                //     *****
                //     *****
                //     *****
                //     *****

                //---->don't know



                // 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
                // Sample Run:
                // Enter a positive non-zero integer 4
                // Sum of 1 to 4 is 10
                // Do you want to continue? Enter ‘y’ for yes or any other character for no.
                // y
                // Enter a positive non-zero integer 3
                // Sum of 1 to 3 is 6
                // Do you want to continue? Enter ‘y’ for yes and any other character for no.
                // n.
                // char choice;
                // do{
                //     System.out.print("Enter a non positive Zero: ");
                //     int num=scanner.nextInt();
                //     int sum=0;
                //     for(int i=1; i<= num; i++){
                //         sum +=i;
                //     }
                //     System.out.println("Sum of all the number 0-"+num+ " is : "+sum);
                //     System.out.println("Do you want to continue? yes or no");
                //     choice = scanner.next().charAt(0);
                // } while (choice == 'y' || choice == 'Y');
                // scanner.close();
                
                


                //9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.
                // int greaterThan50 = 0;
                // int lessThan50 = 0;
                // int equalTo50 = 0;
                // int sumGreaterThan50 = 0;
                // int sumLessThan50 = 0;

                // for (int i = 0; i < 10; i++) {
                //     System.out.print("Enter an integer number: ");
                //     int num = scanner.nextInt();
                //     if (num > 50) {
                //         greaterThan50++;
                //         sumGreaterThan50 += num;
                //     } else if (num < 50) {
                //         lessThan50++;
                //         sumLessThan50 += num;
                //     } else {
                //         equalTo50++;
                //     }
                // }

                // System.out.println("Number of inputs greater than 50: " + greaterThan50);
                // System.out.println("Number of inputs less than 50: " + lessThan50);
                // System.out.println("Number of inputs equal to 50: " + equalTo50);

                // if (greaterThan50 > 0) {
                //     double avgGreaterThan50 = (double) sumGreaterThan50 / greaterThan50;
                //     System.out.println("Average of numbers greater than 50: " + avgGreaterThan50);
                // } else {
                //     System.out.println("No numbers greater than 50 were entered.");
                // }

                // if (lessThan50 > 0) {
                //     double avgLessThan50 = (double) sumLessThan50 / lessThan50;
                //     System.out.println("Average of numbers less than 50: " + avgLessThan50);
                // } else {
                //     System.out.println("No numbers less than 50 were entered.");
                // }

                // scanner.close();





                //10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50
                
                // System.out.println("Enter a non Zero postove number :");
                // int num=scanner.nextInt();
                // int sum=0;
                // for(int i=1; i<=num; i++){
                //     sum +=i;
                // }
                // System.out.println("The sum all the number from 1-" +num+ " is : "+sum);
                















                //7. Write a program to calculate the HCF of Two given numbers.
                // import java.util.Scanner;
                // public class task4 {
                //     public static void main(String[] args) {
                //         Scanner scanner = new Scanner(System.in);
                
                //         System.out.print("Enter the first number: ");
                //         int num1 = scanner.nextInt();
                
                //         System.out.print("Enter the second number: ");
                //         int num2 = scanner.nextInt();
                
                //         int hcf = calculateHCF(num1, num2);
                //         System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
                
                //         scanner.close();
                //     }
                
                //     public static int calculateHCF(int a, int b) {
                //         while (b != 0) {
                //             int temp = b;
                //             b = a % b;
                //             a = temp;
                //         }
                //         return a;
                //     }
                // }




                //8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
                // import java.util.Scanner;
                
                // public class task4 {
                //     public static void main(String[] args) {
                //         Scanner scanner = new Scanner(System.in);
                
                //         System.out.print("Enter an integer: ");
                //         int num = scanner.nextInt();
                //         int reversedNum = reverseInteger(num);
                //         System.out.println("Reversed number: " + reversedNum);
                
                //         scanner.close();
                //     }
                
                //     public static int reverseInteger(int n) {
                //         int reversedNum = 0;
                //         while (n != 0) {
                //             int digit = n % 10;
                //             reversedNum = reversedNum * 10 + digit;
                //             n /= 10;
                //         }
                //         return reversedNum;
                //     }
                // }


                //6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
                // *
                // **
                // ***
                // ****
                // *****
                // Use a nested for loop to generate the above pattern.

                // System.out.println("Enter a number :");
                // int num=scanner.nextInt();
                // for(int i=1; i<=num; i++){
                //     for(int j=1; j<num; j++){
                //         System.out.println("*");
                //     }
                // System.out.println();
                // }
                // scanner.close();;

    }
}

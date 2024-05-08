import java.util.Scanner;
public class task3{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // 1. Write a JAVA program to find the maximum between three numbers.
        // int a=21;
        // int b=4;
        // int c=6;
        // if (a>b && a>c){
        //     System.out.println("A is bigger than other "+ a);
        // }else if(b>c && b>a){
        //     System.out.println("B is greater than other "+ b);
        // }else if (c>a && c>b){
        //     System.out.println("C is greater than other "+ c);
        // }else {
        //     System.out.println("Some numbers are equal or all are equal.");
        // }
        
                    
        // 2. Write a JAVA program to check whether a number is negative, positive, or zero
            // System.out.println("Enter a number");
            // int number=scanner.nextInt();
            // if (number>0){
            //     System.err.println("The number is positive");
            // }else if(number<0){
            //     System.out.println("The number is Negative");
            // }else{
            //     System.out.println("The number is Equal is to zero");
            // }

        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not
        // System.out.print("Enter a number: ");
        // int number =scanner.nextInt();
        // if (number % 5==0 || number%11==0){
        //     System.out.println("The number is divisible");
        // }else{
        //     System.out.println("The number is not divisbile by 5 and 11");
        // }


        // 4. Write a JAVA program to check whether a number is even or odd.
        // System.out.print("Enter a number: ");
        // int number =scanner.nextInt();
        // if (number%2==0){
        //     System.out.println("The number is Even");
        // }else{
        //     System.out.println("The number is odd");
        // }

        
        // 5. Write a JAVA program to check whether a year is a leap year or not. 
        // System.out.print("Enter a number: ");
        // int number =scanner.nextInt();
        // if (number %4==0){
        //     System.out.println("This year is a leap year");
        // }else{
        //     System.out.println("This is not a leap year");
        // }

        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        // System.out.print("Enter a character :");
        // char letter = scanner.next().charAt(0);

        // if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' ||
        //     letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        //     System.out.print("This is a vowel character: " + letter);
        // } else {
        //     System.out.print("This is a consonant: " + letter);
        // }
        // scanner.close();
            


        // Switch case

        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.

        // char charValue='B';
        // int charInt=2;
        // switch(charValue){
        //     case 'A':
        //     System.out.println("3.80");
        //     break;
        //     case 'B':
        //     System.out.println("3.60");
        //     break;
        //     case 'C':
        //     System.out.println("3.20");
        //     break;
        //     case 'D':
        //     System.out.println("2.80");
        //     break;
        //     case 'F':
        //     System.out.println("3.60");
        //     break;    

        // }


        // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
        

        // System.out.println("Enter first number: ");
        // double num1 = scanner.nextDouble();

        // System.out.println("Enter second number: ");
        // double num2 = scanner.nextDouble();

        // System.out.println("Enter operator (+, -, *, /): ");
        // char operator = scanner.next().charAt(0);

        // double result;

        // switch (operator) {
        //     case '+':
        //         result = num1 + num2;
        //         break;
        //     case '-':
        //         result = num1 - num2;
        //         break;
        //     case '*':
        //         result = num1 * num2;
        //         break;
        //     case '/':
        //         if (num2 != 0) {
        //             result = num1 / num2;
        //         } else {
        //             System.out.println("Error! Division by zero.");
        //             return;
        //         }
        //         break;
        //     default:
        //         System.out.println("Error! Invalid operator.");
        //         return;
        // }

        // System.out.println("Result: " + result);


        // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
    
        // System.out.print("Enter an interger: ");
        // int number=scanner.nextInt();

        // if ( number>=1 && number<=12){
        //     if (number>=1 && number<=3){
        //         System.out.println("The corresponding season is : Winter");
        //     }
        //     else if (number>=4 && number<=6){
        //         System.out.println("The corresponding season is: Spring");
        //     }
        //     else if (number>=7 && number<=9){
        //         System.out.println("The corresponding season is: Summer");
        //     }
        //     else if (number>=10 && number<=12){
        //         System.out.println("The corresponding season is: Fall");
        //     }
        // }
        // else{
        //     System.out.println("Invalid");
        // }  


        // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
        // System.out.println("Please selected which area do you need; ");
        // System.out.println("1. Circle");
        // System.out.println("2. rectangle");
        // System.out.println("3. square");
        // System.out.println("4. triangle");
        // System.out.print("Enter your choice: ");
        // int number=scanner.nextInt();
        
        // switch(number){
        //     case 1:
        //         System.out.print("Enter the radius of the circle: ");
        //         double radius = scanner.nextDouble();
        //         double circleArea = Math.PI * radius * radius;
        //         System.out.println("Area of the circle: " + circleArea);
        //         break;
        //     case 2:
        //         System.out.print("Enter the radius of the rectangle: ");
        //         double radius1 = scanner.nextDouble();
        //         double rectangleArea = Math.PI * radius1 * radius1;
        //         System.out.println("Area of the circle: " + rectangleArea);
        //         break;
        //     case 3:
        //         System.out.print("Enter the radius of the square: ");
        //         double radius3 = scanner.nextDouble();
        //         double circlesquare = Math.PI * radius3 * radius3;
        //         System.out.println("Area of the square: " + circlesquare);
        //         break;
        //     case 4:
        //         System.out.print("Enter the radius of the triangle: ");
        //         double radius2=scanner.nextDouble();
        //         double radiustraingle= 3.14*radius2*radius2;
        //         System.out.println("Area of the triangle:"+ radiustraingle);
            
        // }
        


    


        




    }
}

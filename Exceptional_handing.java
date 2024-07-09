// public class Exceptional_handing {
//     public static void main(String[] args) {
//         System.out.println("Program start");
        
//         // Example of handling ArithmeticException
//         int num1 = 10;
//         try {
//             int num2 = num1 / 0; // ArithmeticException: division by zero
//         } catch (ArithmeticException ex) {
//             // ex will have the system-generated message
//             System.out.println("Cannot divide by zero");
//         } finally {
//             System.out.println("Finally runs whether exception occurs or not");
//         }
//         // Note: catch and finally are optional, but either or both should be present after try

//         // Example of handling ArrayIndexOutOfBoundsException
//         int[] numA = new int[5];
//         numA[0] = 100;
//         try {
//             numA[100] = 1000; // ArrayIndexOutOfBoundsException
//         } catch (ArrayIndexOutOfBoundsException ex) {
//             System.out.println("Array is not large enough");
//         }

//         // Example of handling NullPointerException
//         String data = null;
//         try {
//             System.out.println(data.length()); // NullPointerException
//         } catch (NullPointerException ex) {
//             System.out.println("Null value encountered");
//         }

//         // Example of handling multiple exceptions
//         try {
//             int numMulti = 1000 / 0; // ArithmeticException
//             String d2 = null; // NullPointerException
//             System.out.println(d2.length());
//         } catch (ArithmeticException ex) {
//             System.out.println("Number error");
//         } catch (NullPointerException ex) {
//             System.out.println("Null value encountered");
//         } finally {
//             System.out.println("Try block ended");
//         }

//         // Catching a general exception
//         try {
//             int num3 = 10 / 0; // ArithmeticException
//             int[] numArray2 = new int[100];
//             numArray2[10000] = 10; // ArrayIndexOutOfBoundsException
//         } catch (Exception ex) {
//             System.out.println("Caught a general exception");
//         }

//         // Manually throwing an exception
//         try {
//             throwExample();
//         } catch (ArithmeticException ex) {
//             System.out.println("Manually thrown exception: " + ex.getMessage());
//         }

//         // Wrapping a method that throws a checked exception in try-catch
//         try {
//             checkTry();
//         } catch (Exception ex) {
//             System.out.println("Exception from checkTry: " + ex.getMessage());
//         }

//         System.out.println("Program end");
//     }

//     static void throwExample() {
//         throw new ArithmeticException("Where is the number?");
//     }

//     static void checkTry() throws Exception {
//         System.out.println("When running this function, wrap around try-catch");
//     }
// }


// Task
        // Find the exception and use try catch block finally accordingly
        // int number1 = 10;
        // int number2 = number1 - 10;
        // int number3 = number1 / number2;
        // String name;
        // System.out.println(name.length());
        // String[] names = new String[100];
        // names[0] = "Ram";
        // names[110] = "Shyam";
        //  Task end

        public class Exceptional_handing {
            public static void main(String[] args) {
                int number1 = 10;
                int number2 = number1 - 10;
                try {
                    int number3 = number1 / number2;
                    System.out.println("Result of division: " + number3);
                } catch (ArithmeticException e) {
                    System.out.println("Exception caught: Division by zero or invalid calculation");
                } finally {
                    System.out.println("Part 1 completed.");
                }
        
                
                String name = null;
                try {
                    System.out.println("Length of name: " + name.length()); 
                } catch (NullPointerException e) {
                    System.out.println("Exception caught: Null pointer encountered");
                } finally {
                    System.out.println("Part 2 completed.");
                }
        
                
                String[] names = new String[100];
                try {
                    names[0] = "Ram";
                    names[110] = "Shyam"; 
                    System.out.println("Names updated successfully.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception caught: Array index out of bounds");
                } finally {
                    System.out.println("Part 3 completed.");
                }
        
                System.out.println("Task completed.");
            }
        }
        
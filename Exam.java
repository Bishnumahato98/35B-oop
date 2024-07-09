// /------------Task1-------------
// public class Exam {
//     public static void main(String[] args) {
//         Students p1=new Students(1, "Bishnu", 3.75);
//         System.out.println("Current Student profile");
//         p1.StudentProfile();

//         p1.updateGPA(3.90);
//         System.out.println("\nUpdate Student Profile");
//         p1.StudentProfile();
//     }
// }
// class Students{
//     private int studentID;
//     private String name;
//     private double gpa;

//     public Students(int studentID, String name, double gpa){
//         this.studentID=studentID;
//         this.name=name;
//         this.gpa=gpa;
//     }

//     public void updateGPA(double newgpa){
//         this.gpa=newgpa;
//     }

//     public void StudentProfile(){
//         System.out.println("Student ID is: "+studentID);
//         System.out.println("Student name is: "+name);
//         System.out.println("Student GPA is: "+gpa);
//     }

// }



// ---------------Task2-----------
// public class Exam{
//     public static void main(String[] args){
//         BankAccount ba = new BankAccount(
//             "1001-A", "Albert", 10
//         );
        
//         System.out.println(ba.getAccountBalance());
//         ba.deposit(100);
//         System.out.println(ba.getAccountBalance());
//         ba.withdraw(5);
//         System.out.println(ba.getAccountBalance());
//         ba.withdraw(10000);
//         System.out.println(ba.getAccountBalance());
//     }
// }
// class BankAccount{
//     private String accountNumber;
//     private String accountHolderName;
//     private double accountBalance;
//     BankAccount(
//         String accountNumber, 
//         String accountHolderName, 
//         double accountBalance
//     ){
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.accountBalance = accountBalance;
//     }
//     public void deposit(double money){
//         this.accountBalance += money;
//     }
//     public void withdraw(double money){
//         if(money > accountBalance){
//             System.out.println("You are poor");
//         }else{
//             this.accountBalance -= money;
//             System.out.println("Withdrawn");
//         }
//     }
//     public double getAccountBalance(){
//         return this.accountBalance;
//     }
// }




// ------------Taks3--------
/*Create a Shopping Cart class to simulate an online shopping cart. The class should have the following attributes: cart ID, customer name, and items (a list of products). Include methods to additem(), removeltem(), and calculate Total(). Implement functionality to create new shopping carts, add/remove items, and calculate the total cost of items in the cart */

// import java.util.ArrayList;
// import java.util.List;

// class ShoppingCart {
//     private String cartId;
//     private String customerName;
//     private List<Item> items;

//     public ShoppingCart(String cartId, String customerName) {
//         this.cartId = cartId;
//         this.customerName = customerName;
//         this.items = new ArrayList<>();
//     }

//     public String getCartId() {
//         return cartId;
//     }

//     public String getCustomerName() {
//         return customerName;
//     }

//     public List<Item> getItems() {
//         return items;
//     }

//     public void addItem(Item item) {
//         items.add(item);
//     }

//     public void removeItem(Item item) {
//         items.remove(item);
//     }

//     public double calculateTotal() {
//         double total = 0;
//         for (Item item : items) {
//             total += item.getPrice();
//         }
//         return total;
//     }

//     @Override
//     public String toString() {
//         return "ShoppingCart{" +
//                 "cartId=" + cartId + '\'' +
//                 ", customerName='" + customerName + '\'' +
//                 ", items=" + items +
//                 '}';
//     }

//     public static void main(String[] args) {
//         ShoppingCart cart = new ShoppingCart("CART123", "John Doe");

//         Item item1 = new Item("Apple", 1.99);
//         Item item2 = new Item("Banana", 0.99);

//         cart.addItem(item1);
//         cart.addItem(item2);

//         System.out.println(cart);
//         System.out.println("Total: $" + cart.calculateTotal());

//         cart.removeItem(item1);

//         System.out.println(cart);
//         System.out.println("Total: $" + cart.calculateTotal());
//     }
// }

// class Item {
//     private String name;
//     private double price;

//     public Item(String name, double price) {
//         this.name = name;
//         this.price = price;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }

//     @Override
//     public String toString() {
//         return "Item{" +
//                 "name='" + name + '\'' +
//                 ", price=" + price +
//                 '}';
//     }
// }






// --------------Task10-------------
/*Write a program that prompts the user to enter a sentence and reads it into a string. The program should consist of the following methods:
a method named "count Vowels" that reads a string and returns the number of vowels in the string a method named "count Consonants" that reads a string and returns the number of consonants in the string. Invoke the above methods and demonstrate them in the program. */

// import java.util.Scanner;
// public class Exam {

//     public static int countVowels(String sentence) {
//         int count = 0;
//         for (char c : sentence.toCharArray()) {
//             if (isVowel(c)) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static int countConsonants(String sentence) {
//         int count = 0;
//         for (char c : sentence.toCharArray()) {
//             if (isConsonant(c)) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static boolean isVowel(char c) {
//         c = Character.toLowerCase(c);
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//     }

//     public static boolean isConsonant(char c) {
//         c = Character.toLowerCase(c);
//         return (c >= 'a' && c <= 'z') && !isVowel(c);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a sentence: ");
//         String sentence = scanner.nextLine();

//         int numVowels = countVowels(sentence);
//         int numConsonants = countConsonants(sentence);

//         System.out.println("Number of vowels: " + numVowels);
//         System.out.println("Number of consonants: " + numConsonants);
//     }
// }




//--------------Task9---------
/*Write a program that prompts the user to enter five integer values and reads them into an array. The program should consist of the following methods: a method named "max" that reads an array of integer values and returns the maximum value a method named indexOfHighest" that returns the index of the highest element in an array of integers. If more than one such element exists, return the smallest index. Invoke the above methods and demonstrate them in the program. */

// import java.util.Scanner;
// public class Exam {

//     public static int max(int[] array) {
//         int maxValue = array[0];
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] > maxValue) {
//                 maxValue = array[i];
//             }
//         }
//         return maxValue;
//     }

//     public static int indexOfHighest(int[] array) {
//         int maxValue = array[0];
//         int maxIndex = 0;
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] > maxValue) {
//                 maxValue = array[i];
//                 maxIndex = i;
//             }
//         }
//         return maxIndex;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[5];

//         System.out.println("Enter five integer values:");
//         for (int i = 0; i < 5; i++) {
//             numbers[i] = scanner.nextInt();
//         }

//         int maxValue = max(numbers);
//         int maxIndex = indexOfHighest(numbers);

//         System.out.println("Maximum value: " + maxValue);
//         System.out.println("Index of highest value: " + maxIndex);
//     }
// }







// -------------Task8----------
// Design and implement a simple Java application that prompts the user to enter a valid email address. Your application should throw and handle a custom exception if the user enters an invalid email address InvalidEmail Exception A custom exception that is thrown when the user enters an email address that does not match a valid email pattern (e.g., it should contain '@' and characters)
// import java.util.Scanner;

// // Custom exception for invalid email addresses
// class InvalidEmailException extends Exception {
//     public InvalidEmailException(String message) {
//         super(message);
//     }
// }

// // Main application class
// public class Exam {

//     // Method to validate email address
//     public static void validateEmail(String email) throws InvalidEmailException {
//         // Check if the email contains '@' and '.'
//         if (!email.contains("@") || !email.contains(".")) {
//             throw new InvalidEmailException("Invalid email address: " + email);
//         }
        
//         // Check if '@' is before '.'
//         int atIndex = email.indexOf('@');
//         int dotIndex = email.lastIndexOf('.');
//         if (atIndex > dotIndex) {
//             throw new InvalidEmailException("Invalid email address: " + email);
//         }

//         // Ensure that there is at least one character before '@', between '@' and '.', and after '.'
//         if (atIndex < 1 || dotIndex < atIndex + 2 || dotIndex + 2 >= email.length()) {
//             throw new InvalidEmailException("Invalid email address: " + email);
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a valid email address: ");
//         String email = scanner.nextLine();

//         try {
//             validateEmail(email);
//             System.out.println("The email address is valid.");
//         } catch (InvalidEmailException e) {
//             System.err.println(e.getMessage());
//         } finally {
//             scanner.close();
//         }
//     }
// }








// ----------------Task7--------------
// Design and implement a simple Java application that prompts the user to enter a string within a specified length, for example, between 5 and 20 characters. Your application should throw and handle a custom exception if the user enters a string outside this length. InvalidStringLengthException: A custom exception that is thrown when the user enters a string with a length outside the valid range (5 to 20 characters).

// import java.util.Scanner;
// class InvalidStringLengthException extends Exception {
//     public InvalidStringLengthException(String message) {
//         super(message);
//     }
// }

// public class Exam {
//     public static void validateStringLength(String input) throws InvalidStringLengthException {
//         int length = input.length();
//         if (length < 5 || length > 20) {
//             throw new InvalidStringLengthException("Invalid string length: " + length + ". Must be between 5 and 20 characters.");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string between 5 and 20 characters: ");
//         String input = scanner.nextLine();

//         try {
//             validateStringLength(input);
//             System.out.println("The string length is valid.");
//         } catch (InvalidStringLengthException e) {
//             System.err.println(e.getMessage());
//         } finally {
//             scanner.close();
//         }
//     }
// }




// ---------------Task6--------------
/*Design and implement a Java program that simulates the undo feature of a text editor using a stack. The program should support adding text to the editor and undoing changes. The stack should store strings, each representing a version of the text. Implement methods for: adding text to the editor: addText(String text) undoing changes: undo() getting the current text: getCurrentText() */

// import java.util.Stack;
// public class Exam {
//     public static void main(String[] args) {
//         TextEditor editor = new TextEditor();
        
//         // Add text and print current text
//         editor.addText("Hello");
//         System.out.println("Current text: " + editor.getCurrentText());  // Output: Hello
        
//         // Add more text and print current text
//         editor.addText(" World");
//         System.out.println("Current text: " + editor.getCurrentText());  // Output: Hello World
        
//         // Undo the last change and print current text
//         editor.undo();
//         System.out.println("Current text: " + editor.getCurrentText());  // Output: Hello
        
//         // Undo again and print current text
//         editor.undo();
//         System.out.println("Current text: " + editor.getCurrentText());  // Output: (empty string)
//     }
// }

// class TextEditor{
//     private Stack<String> textStack;
//     private String currentText;

//     public TextEditor() {
//         textStack = new Stack<>();
//         currentText = "";
//     }

//     // Add text to the editor and save the state in the stack
//     public void addText(String text) {
//         textStack.push(currentText);  // Save current state
//         currentText += text;  // Update current text
//     }

//     // Undo the last change
//     public void undo() {
//         if (!textStack.isEmpty()) {
//             currentText = textStack.pop();  // Revert to the previous state
//         }
//     }

//     // Get the current text
//     public String getCurrentText() {
//         return currentText;
//     }
// }





// ----------------Task5----------
/* Design and implement a Java program that simulates a network monitoring system. Your system should be capable of monitoring different types of network devices, such as routers and switches, and alerting if any devices are experiencing errors or downtime. Use interfaces to define common behaviors for network devices and implement these behaviors in different device classes.
Create an interface named Network Device with at least two methods:
getStatus() which returns a String indicating the current status of the device isAvailable() which returns a boolean indicating if the device is currently available and functioning correctly.
Implement the Network Device interface in at least three separate classes, Router and Switch. Each class should have a constructor that sets specific properties for the device and specific logic to determine its status and availability.*/



// interface NetworkDevice {
//     String getStatus();
//     boolean isAvailable();
// }


// class Router implements NetworkDevice {
//     private String ipAddress;
//     private boolean operational;

//     public Router(String ipAddress, boolean operational) {
//         this.ipAddress = ipAddress;
//         this.operational = operational;
//     }

//     @Override
//     public String getStatus() {
//         return operational ? "Router is operational" : "Router is down";
//     }

//     @Override
//     public boolean isAvailable() {
//         return operational;
//     }
// }


// class Switch implements NetworkDevice {
//     private String ipAddress;
//     private boolean operational;

//     public Switch(String ipAddress, boolean operational) {
//         this.ipAddress = ipAddress;
//         this.operational = operational;
//     }

//     @Override
//     public String getStatus() {
//         return operational ? "Switch is operational" : "Switch is down";
//     }

//     @Override
//     public boolean isAvailable() {
//         return operational;
//     }
// }



// class AccessPoint implements NetworkDevice {
//     private String macAddress;
//     private boolean operational;

//     public AccessPoint(String macAddress, boolean operational) {
//         this.macAddress = macAddress;
//         this.operational = operational;
//     }

//     @Override
//     public String getStatus() {
//         return operational ? "Access Point is operational" : "Access Point is down";
//     }

//     @Override
//     public boolean isAvailable() {
//         return operational;
//     }
// }


// import java.util.ArrayList;
// import java.util.List;

// class Exam {
//     private List<NetworkDevice> devices;

//     public Exam() {
//         devices = new ArrayList<>();
//     }

//     public void addDevice(NetworkDevice device) {
//         devices.add(device);
//     }

//     public void checkDevices() {
//         for (NetworkDevice device : devices) {
//             System.out.println(device.getStatus());
//             if (!device.isAvailable()) {
//                 System.out.println("Alert: Device " + device.getClass().getSimpleName() + " is down!");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Exam system = new Exam();

//         Router router = new Router("192.168.1.1", true);
//         Switch switchDevice = new Switch("192.168.1.2", false);
//         AccessPoint accessPoint = new AccessPoint("00:1A:2B:3C:4D:5E", true);

//         system.addDevice(router);
//         system.addDevice(switchDevice);
//         system.addDevice(accessPoint);

//         system.checkDevices();
//     }
// }








// ----------------Task4------------
/*Question Design and implement a Java program that simulates a financial transaction system. Your system should be capable of processing different types of transactions, such as deposits and withdrawals, and alerting if any transactions exceed certain limits. Use interfaces to define common behaviors for transactions and implement these behaviors in different transaction classes.
Create an interface named Transaction with at least two methods:
getAmount() which returns the amount of the transaction as a double isValid() which returns a boolean indicating if the transaction is valid based on certain criteria.
Implement the Transaction interface in at least three separate classes, Deposit Transaction and Withdrawal Transaction. Each class should have a constructor that sets a limit for transactions and specific logic to determine if the transaction is valid. */
// import java.util.ArrayList;
// import java.util.List;

// interface Transaction {
//     double getAmount();
//     boolean isValid();
// }
// class DepositTransaction implements Transaction {
//     private double amount;
//     private double limit;

//     public DepositTransaction(double amount, double limit) {
//         this.amount = amount;
//         this.limit = limit;
//     }

//     @Override
//     public double getAmount() {
//         return amount;
//     }

//     @Override
//     public boolean isValid() {
//         return amount <= limit;
//     }
// }


// class WithdrawalTransaction implements Transaction {
//     private double amount;
//     private double limit;

//     public WithdrawalTransaction(double amount, double limit) {
//         this.amount = amount;
//         this.limit = limit;
//     }

//     @Override
//     public double getAmount() {
//         return amount;
//     }

//     @Override
//     public boolean isValid() {
//         return amount <= limit;
//     }
// }


// public class Exam{
//     public static void main(String[] args) {
//         List<Transaction> transactions = new ArrayList<>();

//         double depositLimit = 10000.00;
//         double withdrawalLimit = 5000.00;


//         transactions.add(new DepositTransaction(5000.00, depositLimit));
//         transactions.add(new DepositTransaction(15000.00, depositLimit));
//         transactions.add(new WithdrawalTransaction(3000.00, withdrawalLimit));
//         transactions.add(new WithdrawalTransaction(6000.00, withdrawalLimit));

//         for (Transaction transaction : transactions) {
//             if (transaction.isValid()) {
//                 System.out.println("Transaction of amount $" + transaction.getAmount() + " is valid.");
//             } else {
//                 System.out.println("Transaction of amount $" + transaction.getAmount() + " exceeds the limit and is invalid.");
//             }
//         }
//     }
// }

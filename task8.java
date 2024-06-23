
//1. You are building a banking application that has a BankAccount class. Implement the BankAccount class with encapsulation principles in mind. Include private instance variables for the account number, account holder name, and account balance. Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. Ensure that the account balance cannot be accessed or modified directly.

// class BankAccount {
//     private String account_number;
//     private String account_holder_name;
//     private double account_balance;

//     BankAccount(String account_number, String account_holder_name, double account_balance) {
//         this.account_number = account_number;
//         this.account_holder_name = account_holder_name;
//         this.account_balance = account_balance;
//     }


//     public void deposit(double money){
//         this.account_balance += money;
//     }
//     public void withdraw(double money){
//         if(money > account_balance){
//             System.out.println("You are poor");
//         }else{
//             this.account_balance -= money;
//             System.out.println("Withdrawn");
//         }
//     }

//     public String getAccountNumber() {
//         return account_number;
//     }
//     public String getAccountHolderName() {
//         return account_holder_name;
//     }
//     public double getAccountBalance() {
//         return account_balance;
//     }
//     public void info() {
//         System.out.println("Account number: " + account_number);
//         System.out.println("Account holder: " + account_holder_name);
//         System.out.println("Account Balance: " + account_balance);
//     }
// }


// public class task8 {
//     public static void main(String[] args) {
//         BankAccount p1 = new BankAccount("181212", "Bishnu", 12000); 
//         p1.deposit(500.0);
//         p1.withdraw(200.0);
//         System.out.println("Current balance: $" + p1.getAccountBalance());
//         p1.info();
//     }
// }





// 2. You are developing a library management system and need to implement a Book class. The Book class should have private instance variables for the book title, author name, and publication year. Implement appropriate getter and setter methods to ensure encapsulation. Additionally, include a private variable to track the availability of the book (e.g., true if available, false if borrowed), and provide a public method to borrow the book, updating its availability status.

// class Book {
//     private String bookTitle;
//     private String authorName;
//     private int publicationYear;
//     private boolean isAvailable;

//     Book(String bookTitle, String authorName, int publicationYear) {
//         this.bookTitle = bookTitle;
//         this.authorName = authorName;
//         this.publicationYear = publicationYear;
//         this.isAvailable = true;
//     }

//     public String getBookTitle() {
//         return bookTitle;
//     }

//     public void setBookTitle(String bookTitle) {
//         this.bookTitle = bookTitle;
//     }

//     public String getAuthorName() {
//         return authorName;
//     }

//     public void setAuthorName(String authorName) {
//         this.authorName = authorName;
//     }

//     public int getPublicationYear() {
//         return publicationYear;
//     }

//     public void setPublicationYear(int publicationYear) {
//         this.publicationYear = publicationYear;
//     }

//     public boolean isAvailable() {
//         return isAvailable;
//     }

//     public boolean borrowBook() {
//         if (isAvailable) {
//             isAvailable = false;
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public void returnBook() {
//         isAvailable = true;
//     }

//     public void info() {
//         System.out.println("Book Title: " + bookTitle);
//         System.out.println("Author Name: " + authorName);
//         System.out.println("Publication Year: " + publicationYear);
//         System.out.println("Is Available: " + isAvailable);
//     }
// }

// public class task8 {
//     public static void main(String[] args) {
//         Book p1 = new Book("Rich Dad", "Robert Kiyosaki", 1996);
        
//         p1.info();
        
//         // Borrow the book
//         if (p1.borrowBook()) {
//             System.out.println("You have borrowed the book.");
//         } else {
//             System.out.println("The book is already borrowed.");
//         }
        
//         // Check availability after borrowing
//         System.out.println("Is Available after borrowing: " + p1.isAvailable());
        
//         // Return the book
//         p1.returnBook();
//         System.out.println("Is Available after returning: " + p1.isAvailable());
//     }
// }




// 3. You are working on a student information system and need to create a Student class. The student class should have private instance variables for the student's name, ID number, and grade point average (GPA). Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods. However, the GPA should be read-only and can only be set within the class constructor.


// class Student{
//     private String name;
//     private int id;
//     private int gpa;

//     Student(String name, int id, int gpa){
//         this.name=name;
//         this.id=id;
//         this.gpa=gpa;
//     }

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }

//     public int getID(){
//         return id;
//     }
//     public void setID(int id){
//         this.id=id;
//     }
//     public int setGPA(){
//         return gpa;
//     }

//     public void info(){
//         System.out.println("Name of the students :"+name);
//         System.out.println("ID of the students :"+id);
//         System.out.println("The gpa of the students :"+gpa);
//     }

// }

// public class task8 {

//     public static void main(String[] args) {
//         Student p1=new Student("Bishnu", 101, 3);
//         p1.info();

//         p1.setID(123);
//         p1.setName("prabin");
//         p1.info();
//     }
// }


// 5. You are designing a car rental system, and you need to create a Car class. The Car class should have private instance variables for the car's make, model, and rental price per day. Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set once during object creation. Additionally, include a private variable to track the availability of the car (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car, updating its availability status.

// class RentalSystem{
//     private String make;
//     private String model;
//     private int per_day;
//     private boolean isAvailable;

//     Rental_system(String make, String model, int per_day){
//         this.make=make;
//         this.model=model;
//         this.per_day=per_day;
//         this.isAvailable=isAvailable;
//     }

//     public String getMake(){
//         return make;
//     }
//     public void setMake(String make){
//         this.make=make;
//     }

//     public String getModel(){
//         return model;
//     }
//     public void setModel(String model){
//         this.model=model;
//     }

//     public int getPerDay(){
//         return per_day;
//     }
//     public void setPerDay(int per_day){
//         this.per_day=per_day;
//     }

//     public boolean getIsAvailable(){
//         return isAvailable;
//     }
//     public void setIsAvailable(boolean isAvailable){
//         this.isAvailable=isAvailable;
//     }

//     public String Rent(){
//         if (isAvailable){
//             isAvailable=false;
//             return true;
//         } else{
//             return false;
//         }
//     }
//     public void returnBook() {
//         isAvailable = true;
//     }


//     public void info(){
//         System.out.println("Make of car "+make);
//         System.out.println("Model of car "+model);
//         System.out.println("Rent for per day "+per_day);
//         System.out.println("Available for rent per day "+ isAvailable);
//     }
// }


// public class task8 {

//     public static void main(String[] args) {
//         RentalSystem p1=new RentalSystem();
//         p1.setMake("BMW");
//         p1.setModel("Audi");
//         p1.setPerDay(100);
//         p1.info();


//         if (p1.Rent()) {
//             System.out.println("The car is available.");
//         else {
//             System.out.println("The car is not npow available.");
//         }
//         System.out.println("Is Available after borrowing: " + p1.isAvailable());

//         p1.Rent();
//             System.out.println("Is Available after returning: " + p1.isAvailable());
//     }
// }



public class task8 {
    // Private instance variables
    private String make;
    private String model;
    private double rentalPricePerDay;
    private boolean available;

    // Constructor to initialize make, model, and rentalPricePerDay
    public task8(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.available = true; // By default, the car is available when created
    }

    // Getter method for make
    public String getMake() {
        return make;
    }

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Getter method for rentalPricePerDay
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    // Setter method for rentalPricePerDay
    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Method to check availability
    public boolean isAvailable() {
        return available;
    }

    // Method to rent the car
    public boolean rentCar() {
        if (available) {
            available = false;
            return true; // Successfully rented the car
        }
        return false; // Car was already rented
    }

    // Method to return the car
    public void returnCar() {
        available = true;
    }

    // Main method for testing the class functionality
    public static void main(String[] args) {
        // Create a new car object
        task8 car1 = new task8("Toyota", "Corolla", 40.0);

        // Print car details
        System.out.println("Car make: " + car1.getMake());
        System.out.println("Car model: " + car1.getModel());
        System.out.println("Rental price per day: $" + car1.getRentalPricePerDay());
        System.out.println("Is car available? " + car1.isAvailable());

        // Rent the car
        boolean rented = car1.rentCar();
        System.out.println("Car rented: " + rented);
        System.out.println("Is car available after renting? " + car1.isAvailable());

        // Return the car
        car1.returnCar();
        System.out.println("Is car available after returning? " + car1.isAvailable());

        // Update rental price per day
        car1.setRentalPricePerDay(45.0);
        System.out.println("Updated rental price per day: $" + car1.getRentalPricePerDay());
    }
}

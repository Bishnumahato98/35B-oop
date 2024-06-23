// public class Sambhunath {
//     public static void main(String[] args) {
//         person p1 =new person();
//         p1.name="bishnu";
//         p1.age=22;
//         p1.info();

//         person p2 =new person();
//         p2.name="Abishek";
//         p2.age=18;
//         p2.info();

//         Rectangle r1 = new Rectangle();
//         r1.length = 12;
//         r1.width = 6;
//         System.out.println("The total area is: " + r1.calculateArea());

//         Rectangle r2 = new Rectangle();
//         r2.length = 20;
//         r2.width = 10;
//         System.out.println("The area of rectangle is: " + r2.calculateArea());
//     }
// }
// class person{
//     String name;
//     int age;

//     void info(){
//         System.out.println("Name : "+ name);
//         System.out.println("Age : "+age);
//     }
// }

// class Rectangle {
//     int length;
//     int width;

//     int calculateArea() {
//         return length * width;
//     }
// }



// public class Sambhunath {

//     public static void main(String[] args) {
//         Intro p1=new Intro("Bishnu",12);
//         p1.info2();
//     }
// }


// class Intro{
//     private String name;
//     private int age;

//     public Intro(String name, int age){
//         this.name=name;
//         this.age=age;
//     }

//     private void info(){
//         System.out.println("Name"+name);
//         System.out.println("Age"+age);
//     }
//     public void info2(){
//         System.out.println("My name is " +name+ " And i am "+age+" years old");
//     }
// }


// public class Sambhunath {

//     public static void main(String[] args) {
//         box p1=new box();
//         double vol=p1.volume();
//         System.out.println("The total volume is "+vol);
//     }
// }


// class box{
//     double height;
//     double breadth;
//     double width;
    
//     box(){
//         height=10;
//         breadth=12;
//         width=14;
//     }


//     double volume(){
//         return height*breadth*width;
//     }

// }


// public class Sambhunath {

//     public static void main(String[] args) {
//         Person p1=new Person("Bshnu",12);
//         p1.info();
//         Person p2=new Person(p1);
//         p2.info();
//     }
// }

// class Person{
//     String name;
//     int age;
//     Person(String n,int m){
//         name=n;
//         age=m;
//     }
//     Person(Person s2){
//         name=s2.name;
//         age=s2.age;
//     }

//     void info(){
//         System.out.println(name +" "+age);
//     }
// }


// public class Sambhunath {

//     public static void main(String[] args) {
//         Person p1=new Person();
//         p1.setName("Bishnu");
//         p1.setAge(12);
//         System.out.println("My name is "+ p1.getName());
//         System.out.println("My age is "+ p1.getAge());
//     }
// }
// class Person{
//     private String name;
//     private int age;

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name= name;
//     }

//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }

// }



// //1. Write a Java program to create a class called "Circle" with a radius attribute. You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.

// public class Sambhunath {
//     public static void main(String[] args) {
//         Circle p1=new Circle();
//         p1.setRadius(12);
//         double vol=2*3.14*p1.getRadius();
//         System.out.println("The radius is "+ vol);
//     }
// }

// class Circle{
//     private double radius;

//     public double getRadius(){
//         return radius;
//     }
//     public void setRadius(double radius){
//         this.radius=radius;
//     }
// }


//4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.


// public class Sambhunath {

//     public static void main(String[] args) {
//         Employee p1=new Employee();
//         p1.setName("Bishnu");
//         p1.setJob("IT officer");
//         p1.setSalary(12000);
//         System.out.println("My name is "+p1.getName());
//         System.out.println("My job is"+p1.getJob());
//         System.out.println("My salary is "+ p1.getSalary());
        
//         p1.updateSalary(10);
//         System.out.println("Updated Monthly Salary " + p1.getSalary());

//     }
// }

// class Employee{
//     private String name;
//     private String job;
//     private int salary;

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public String getJob(){
//         return job;
//     }
//     public void setJob(String job){
//         this.job=job;
//     }
//     public int getSalary(){
//         return salary;
//     }
//     public void setSalary(int salary){
//         this.salary=salary;
//     }

//     public void updateSalary(double percentage) {
//         if (percentage > 0) {
//             salary += salary * (percentage / 100);
//         }
//     }

// }




// public class Sambhunath{
//     public static void main(String[] args) {
//         Area p1=new Area(12, 40);
//         p1.getArea();
//     }
// }

// class Area{
//     int length;
//     int breath;

//     Area(int length, int breath){
//         this.length=length;
//         this.breath=breath;
//     }

//     public void getArea(){
//         int Area=length*breath;
//         System.out.println("Area :"+Area);
//     }
// }



// public class Sambhunath {

//     public static void main(String[] args) {
//         Car p1=new Car("Audi", "bmw", 1999);
//         p1.info();
//     }
// }


// class Car{
//     String make;
//     String model;
//     int year;

//     public Car(String make, String model, int year){
//         this.make=make;
//         this.model=model;
//         this.year=year;

//     }

//     public void info(){
//         System.out.println("Make : "+make);
//         System.out.println("Model : "+model);
//         System.out.println("Year : "+year);
//     }
// }







// public class Sambhunath {

//     public static void main(String[] args) {
//         Person p1=new Person("Bishnu", 12);
//         System.out.println("Name and age");
//         p1.info();

//         System.out.println("Update list is :");
//         p1.setName("Abishek");
//         p1.setAge(22);

//         System.out.println("Name : "+p1.getName());
//         System.out.println("Age : "+p1.getAge());
//     }
// }
// class Person{
//     private String name;
//     private int age;

//     Person(String name, int age){
//         this.name=name;
//         this.age=age;
//     }

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         if(name !=null && !name.isEmpty()){
//             this.name=name;
//         }else{
//             System.out.println("Invalid name");
//         }
//     }

//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         if (age>=0 && age<=120){
//             this.age=age;
//         }else{
//             System.out.println("Invalid age");
//         }
        
//     }

//     public void info(){
//         System.out.println("Name : "+name);
//         System.out.println("Age : "+age);
//     }


// }






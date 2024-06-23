// public class AbstractClass {
//     public static void main(String[] args) {
        
//         Samsung s1=new Samsung();
//         s1.sms();
//         s1.call("9800802443");
//         Apple a1= new Apple();
//         a1.sms();
//         a1.call("9807836196");
//     }

// }

// //TA make abstract class keyword "Abstract " before "class"
// // If you make abstract class, cannot make object of it
// abstract class SmartPhone{
//     //abstract class may or may not contain abstract function
//     //to make abstrcat function use "abstract" before making function
//     //abstract class do not have a body
//     abstract void sms();
//     abstract public boolean call(String number);
//     //abstract calss can have normal function
//     void imei(){
//         System.out.println("Imei Number");
//     }
// }

// //abstract class can only be used in sub/chid class
// class Samsung extends SmartPhone{
//     //when extending abstract class we have to implement/override
//     //all the abstract function of abstrcat class
//     @Override
//     void sms(){
//         System.out.println("Samsung way of sending sms");
//     }
//     @Override
//     public boolean call(String number){
//         System.out.println("Samsung calling to "+number);
//         return true;
//     }
    
// }

// //make a class Apple extending Smartphone 
// //Make onject of Samsung and Apple
// //call sms() and call() function of them

// class Apple extends SmartPhone{
//     //when extending abstract class we have to implement/override
//     //all the abstract function of abstrcat class
//     @Override
//     void sms(){
//         System.out.println("Apple way of sending sms");
//     }
//     @Override
//     public boolean call(String number){
//         System.out.println("Apple calling to "+number);
//         return true;
//     }
    
// }







//--------------------------------------Task---------------------------
/*
You are building a shape hierarchy for a drawing application. 
Design an abstract class named "Shape" with the following abstract methods:

calculateArea(): 
This method should calculate and return the area of the shape.

calculatePerimeter(): 
This method should calculate and return the perimeter of the shape.

Implement the abstract class and provide concrete implementations for
 the abstract methods. Create subclasses for different shapes such as "Circle,"
  "Rectangle," and "Triangle." 
  Each subclass should provide specific implementations for 
  calculating the area and perimeter of that shape. 
  Create instances of each shape class and demonstrate 
  how you can calculate their respective areas and perimeters.
*/

public class AbstractClass {

    public static void main(String[] args) {
        
    }
}

abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();

}
class Rectangle extends Shape{
    double length =10;
    double breadth=12;
    @Override
    double calculateArea(){
        return this.length*this.breadth;
    }

    @Override
    double calculatePerimeter(){
        return 2*(this.length + this.breadth);
    }
}

class Triangle extends Shape{
    int sides=12;
    int sides=13;
    int sides=14;
    @Override
    int calculateArea(){
        return this.length*this.breadth;
    }

    @Override
    double calculatePerimeter(){
        return 2*(this.length + this.breadth);
    }
}
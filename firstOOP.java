// public class firstOOP {
//     public static void main(String[] args) {
//         Person p1=new Person();
//         p1.name="Ram";
//         p1.age=12;
//         p1.gender=12;
//         System.out.println(p1.age);
//         p1.introduction();



//         Man p2=new Man();
//         p2.name="prabin";
//         p2.age=65;
//         p2.gender='F';
//         System.out.println(p2.name);
//         p2.introduction();

//     }
// }
// class  Person{
//     // data/field/attribute/properties
//     String name;
//     int age;
//     char gender;

//     //procedures/finction/methods
//     void introduction(){
//         System.err.println("Hi my name is "+ name);


//     Square s1=new Square();
//     s1.sides=10;
//     int s1Area=s1.area();
//     System.out.println(s1Area);
//     s1.addSides(2);
//     System.out.println(s1.area());

//     }

// }




// class Man{
//     String name;
//     int age;
//     char gender;

//     void introduction(){
//         System.out.println("Hi my name is "+ name);
//     }
// }

// class Square{
//     int sides;
//     int area(){
//         int area=sides*sides;
//         return area;

//     }
//     void addSides(int val){
//         sides=sides + val;  //sides will retain state/data
//     }
// }













//task  
//make a class rectangle
// make 2 attribute in double, length and breath
// make a functiion areofRecatngle that returns length*breath
//make a function perimeterofRectangle that return 2(length*breath)
//make an object of rectanglle and print area and perimeter


// public class firstOOP {
//     public static void main(String[] args) {
//         rectangle area=new rectangle();
//         area.length=12.12;
//         area.breath=10.98;
//         System.out.println("The area is " + area.area());
        
//     }
// }
// class rectangle{
//     double length;
//     double breath;
//     double area(){
//         return length * breath;
//     }
//     double perimeter(){
//         return 2 * (length + breath);
//     }
// }




// class car{
    //make attribute: name,brand,year,color
    //make a function modify()that takes new color and set to old color 
    //make a function expiry() that return 100 added to year 
    //make a function start() that prints(nams is starting )
    //make a function stop() that print (name, brad is stoping)
    //make a functiondetails() that print (name,brand, color, and year)
    //make 3 object of car
    //stop only 1st object
    //modify 2nd car to green color
    //print the expriy of 3rd color
    // print deyail of all 3 object
// }





// public class firstOOP {
//     public static void main(String[] args) {
//         Car firstCar = new Car();
//         Car secondCar = new Car();
//         Car thirdCar = new Car();

//         firstCar.name = "Car1";
//         firstCar.brand = "Brand1";
//         firstCar.color =   "Red";
//         firstCar.year = 2020;

//         secondCar.name = "Car2";
//         secondCar.brand = "Brand2";
//         secondCar.color = "Blue";
//         secondCar.year = 2018;

//         thirdCar.name = "Car3";
//         thirdCar.brand = "Brand3";
//         thirdCar.color = "Green";
//         thirdCar.year = 2022;

//         firstCar.start();
//         firstCar.stop();
//         firstCar.modify("Yellow");
//         firstCar.detail();

//         secondCar.start();
//         secondCar.stop();
//         secondCar.detail();

//         thirdCar.start();
//         thirdCar.stop();
//         thirdCar.modify("White");
//         thirdCar.detail();
//     }
// }

// class Car {
//     String name, brand, color;
//     int year;

//     void modify(String color) {
//         this.color = color;
//     }

//     int expiry() {
//         return year + 100;
//     }

//     void start() {
//         System.out.println(name + " is starting");
//     }

//     void stop() {
//         System.out.println(name + brand + ", is stopping");
//     }

//     void detail() {
//         System.out.println("Name: " + name + ", Brand: " + brand + ", Color: " + color + ", Year: " + year);
//     }
// }






public class firstOOP {

    public static void main(String[] args) {
        Rectangle rec1=new Rectangle();
        rec1.length=10;
        rec1.breath=20; 
        System.out.println("The area of rectabgle is:"+rec1.area());



        Rectangle rec2=new Rectangle();
        rec2.length=30;
        rec2.breath=20;
        System.out.println("The area of rectabgle is:"+rec2.area());
    }
}


class Rectangle{
    int length;
    int breath;
    int area(){
        return length*breath;
    }
}
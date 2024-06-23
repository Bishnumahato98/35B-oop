// public class constructorClass {
//     public static void main(String[] args) {
//         ConstructorExample ce = new ConstructorExample();
//         System.out.println("After object creation of constructorExample");
//         ParamConstructor pc = new ParamConstructor(10, 20);
//         System.out.println(pc.getData1());
//     }
// }

// class ParamConstructor {
//     private int data1;
//     private int data2;
//     public ParamConstructor(int d1, int d2) {
//         this.data1 = d1;
//         this.data2 = d2;
//     }
//     public int getData1() {
//         return data1;
//     }
//     public void setData1(int data1) {
//         this.data1 = data1;
//     }

//     public int getData2() {
//         return data2;
//     }
//     public void setData2(int data2) {
//         this.data2 = data2;
//     }
// }

// class ConstructorExample {
//     // Non-parameterized constructor
//     public ConstructorExample() {
//         System.out.println("I run during object creation of ConstructorExample");
//         // Add more logic here if needed
//     }
// }


// Task
        // Make a class Cat
        // Make 2 private attribute name, age
        // Make 2 public attribute breed, color
        // Make a constructor to only set name and age
        // Make getter for name and age
        // Make a setter for age
        // Make an Object of cat
        // Fill the attributes
        // Add +1 to the current age
        // Print the Following using object
        // Name: Ny
        // Age: 4
        // Breed: Xy
        // Color: Orange 

public class constructorClass {

    public static void main(String[] args) {
        cat c=new cat("nya",3);
        c.breed="hw";
        c.color="orange";
        c.setAge(c.getAge()+1);
        System.out.println("Name : " + c.getName());
        System.out.println("age : " + c.getAge());
        // System.out.println("Breed : " + c.breed());
        // System.out.println("color : " + c.color());
    }
}
        class cat{
            private String name;
            private int age;
            public String breed;
            public String color;
            cat(String n, int a){
                this.name = n;
                age = a;
            }
            String getName(){
                return this.name;
            }
            int getAge(){
                return this.age;
            }
            void setAge(int a){
                this.age=age;
            }
        }
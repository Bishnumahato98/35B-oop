// public class Inheritanceconstructor{
//     public static void main(String[] args) {
//         Polo p1 = new Polo();
//         p1.differentColor("Yellow");
//         //call constructor with overloaded param
//     }
// }

// class Shirt{
//     String color;
//     Shirt(){
//         System.out.println("Making shirt");
//     }
//     Shirt(String color){
//         this.color=color;
//         System.out.println("hi");
//     }
// }
// class Polo extends Shirt{
//     String color;
//     String texture;
//     Polo(){
//         //By defult the constructor of parent is called 
//         //meaning super() or Shirt() on first loine of execution
//         super("White");        
//         System.out.println("making polo shirt");
//     }
//     /*constructor Overloading
//      * Same name function/consuructor with different logic/param*/
//     Polo(String color){
//         this.color=color;
//         System.out.println("Constructor with one string");
//     } 
//     Polo(String color, String texture){
//         this.color=color;
//         this.texture=texture;
//         System.out.println("Constructor with two string");
//     } 
//     Polo(int num){
//         System.out.println(num);
//         System.out.println("Constructor with one int");
//     } 
//     void differentColor(String color){
//         System.out.println("Param color" +  color);
//         System.out.println("Class color" + this.color);
//         System.out.println("Parent color" + super.color);
//     }
// }



//------task-----
// Task
    // Make a class Pant
    // Add two attribute color and texture
    // Make constructor or Pant that takes color and texture 
    // Make a class HalfPant that extends Pant
    // Make a attribute color and add default String White
    // Make a non param constructor of HalfPant and \
    // call the Parameterized constructor of parent Pant with "Black" and "Wool"
    // Make a function design() in HalfPant that takes String color \
    // change the parent color to current color of halfpant
    // change the current color of half pant to provided parameter


    public class Inheritanceconstructor{

        public static void main(String[] args) {
            HalfPant p = new HalfPant();
            System.out.println("Before design: HalfPant color = " + p.color + ", Pant color = " + p.superColor());
            p.design("Red");
            System.out.println("After design: HalfPant color = " + p.color + ", Pant color = " + p.superColor());
        }
    }
    
    class Pant {
        String color;
        String texture;
    
        public Pant(String color, String texture) {
            this.color = color;
            this.texture = texture;
        }
        
        public String getColor() {
            return color;
        }
    }
    
    class HalfPant extends Pant {
        String color = "White";
    
        HalfPant() {
            super("Black", "Wool");
        }
    
        void design(String color) {
            super.color = this.color;
            this.color = color;
        }
    
        // Additional method to get the color from the superclass
        String superColor() {
            return super.color;
        }
    }
    
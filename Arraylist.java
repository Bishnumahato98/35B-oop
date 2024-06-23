import java.util.ArrayList;
// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<String>animal=new ArrayList<>();
//         animal.add("dog");
//         animal.add("cat");
//         animal.add("bear");
//         animal.add("tiger");
//         System.out.println("ArrayList: "+animal);
//     }
// }


// public class Arraylist {
//     public static void main(String[] args) {
//         ArrayList<Integer>animal=new ArrayList<>();
//         animal.add(20);
//         animal.add(10);
//         animal.add(5);
//         animal.add(9);
//         System.out.println("ArrayList: "+animal);


//         animal.remove(0);
//         System.out.println(animal);

//         animal.set(0,123);
//         System.out.println(animal);


//     }
// }

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String>animal=new ArrayList<>();
        animal.add("apple");
        animal.add("orange");
        animal.add("banana");
        animal.add("waterlemon");
        animal.add("pineapple");



        animal.set(1,"grapes");
        System.out.println(animal);

        animal.remove(1);
        System.out.println(animal);

        animal.remove(3);
        System.out.println(animal);

        animal.set(2,"Avacado");
        System.out.println(animal);


        animal.set(0,"cherry");
        System.out.println(animal);

        System.out.println("ArrayList: "+animal); 
    }
}



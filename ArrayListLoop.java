// import java.util.ArrayList;
// public class ArrayListLoop {
//     public static void main(String[] args) {
//         /* Import ArrayList on top, import java.until.ArrayList */

//         ArrayList<Integer>intarr=new ArrayList<>();
//         intarr.add(10);
//         intarr.add(20);
//         intarr.add(30);
//         intarr.add(40);
//         intarr.add(50);
//         int arrLen= intarr.size();
//         for (int i=0; i<arrLen; i++){
//             System.out.println("Index "+i+" value "+ intarr.get(i));
//         }

//         /*using for each */
//         for(Integer element: intarr){
//             System.out.println(element);
//         } 
//     }
// }







/*Make an arraylist as student as folowing 
 * ["aaruna","shreeya","yudip","anjali","nischay","krsishna"]
 * make 2 another ArrayList males and females
 * loop the student arrayList
 * add "yudip","Nischay" and "krishna" in males
 * add "aruna"."shreeya" and "anajlai" in females
 * print anjali from females
 * print yudip from males
 */
import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Aurana");
        name.add("shreeya");
        name.add("yudip");
        name.add("anjali");
        name.add("nischay");
        name.add("krishna");
        System.out.println(name);


        ArrayList<String>male=new ArrayList<>();
        ArrayList<String>female=new ArrayList<>();
        for (int i=0; i<name.size(); i++){
            String value=name.get(i);
            if(value=="Auruna" || value=="shreeya" || value=="anjali"){
                female.add(value);
            }else{
                male.add(value);
            }
        }


        System.out.println(male);
        System.out.println(female);
    }
}


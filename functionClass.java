// public class functionClass {
//     /* function are made inside a class scope 
//      * above or below main not inside
//      */
//     void printsomething(){
//         System.out.println("This fuction prints");
//     }


//     /*with return type */
//     int returnInt(){
//         int value=10;
//         return value;

//     }


//     double subtractvalue(int num1,double num2){
//         double subtract=num1-num2;
//         return subtract;
//     }


//     boolean isequal(int num1, int num2){
//         boolean equal =(num1==num2);
//         return equal;
//     }
        


//     public static void main(String[] args) {
//         /* to call a normal/non static function we need to create object
//          * just remember the syntax for now
//          */
//         functionClass fc = new functionClass();
//         /* call function from object/variable of function */
//         fc.printsomething();
//         /*can call multiple times */
//         fc.printsomething();


//         int returnFromFunction=fc.returnInt();
//         System.out.println("Return from function is "+ returnFromFunction);


//         double returnFromAdd = fc.subtractvalue(10,20.2);
//         System.out.println("Add return "+ returnFromAdd);

//         boolean compare =fc.isequal(2,23);
//         System.out.println(compare);

        
//     }
// }



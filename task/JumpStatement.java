package task;

public class JumpStatement {
    public static void main(String[] args) {
        // /*break and continue are jump statement */
        // for (int index =0; index<3; index++){
        //     if(index==1){
        //         break;//this will end the loop from here
        //     }
        //     System.out.println("Index "+ index);
        // }// break will exit scope here



        // /*can be used in while/do while */    
        // int counter =0;
        // while (counter<3){
        //     if(counter==1){
        //         break;//exit here
        //     }

        //     System.out.println("while counter "+ counter);
        //     counter++;







        /*continue will skipe the current iteration 
         * or will bypass all the statement belwo  it 
        */
        // for (int index =0; index<5; index++){
        //     if(index==2){
        //         continue;//when called, it will bypass everything below
        //     }
        //     System.out.println("continue Index "+ index);
        // }





    // /*break on a nested loop */
    // for (int outer=0; outer<2; outer++){
    //     for (int inner =0; inner<=5; inner++){
    //         if (inner==2){
    //             break;//this will only exit the inner for loop
    //         }
    //         System.out.println("Inner index "+ inner);
    //     }// break will exit this scope if used in inner
    //     System.out.println("outer index "+ outer);
    // }

    /*labeled break */
    // outerloop: for(int outer=0; outer<2; outer++){
    //     innerLoop: for(int inner =0; inner<=5; inner++){

    //         if(inner==2){
    //             break;//this will break the loop with this label
    //         }
    //         System.out.println("Index Index "+inner);
    //     }
    //     System.out.println("outer Index"+outer);
    // }




    /* task
     * loop from -5 to 5
     * break the loop if the value is postive
     */

    for (int index=-5; index<=5; index++){
        if (index==0){
            break;
        }
        System.out.println("negative"+ index);
    }





     /* task 
      * loop from 1-20
        print the number only if even
        use continue to complete
      */

    //   for (int index =1; index<=20; index++){
    //     if(index%2!=0){
    //         continue;
    //     }
    //     System.out.println("Even num"+index);
    //   }





    }
}

public class ArrayLoop {
    public static String arrayFinder(String[] array, String find)  {
        for (int i=0; i<=array.length; i++){
            if (array[i] == find){
                return i;

            }
        }
        return -1;
    }


        // int[] arr = new int[4];
        // arr[0]=-10;
        // arr[1]=0;
        // arr[2]=10;
        // arr[3]=20;

        // /* we need lenghtn of array forst, we use.length */
        // int arraylength = arr.length;
        // /*loop from 0-(arrayLenght -1), 0-3 */
        // for (int i=0; i<arraylength; i++){
        //     System.out.println(arr[i]);
        // }
        // //or, use condition, i<=arraylenght-1
        // System.out.println("Descending loop");
        // for (int i=arraylength-1; i>=0; i--){
        //     System.out.println(arr[i]);
        // }


        //Task

        /* loop the arr using while loop */
        /* make an array of ["john, "Doe","Foo","bar"] 
         * make a string "Foo"
         * loop the array and find in which index is "Foo" on 
         * print the index
        */




        // String[] arr=new String[4];
        // arr[0]="John";
        // arr[1]="Doe";
        // arr[2]="Foo";
        // arr[3]="Bar";
        // int i=0;
        // while (i<arr.length){
        //     if (arr[i]=="Foo"){
        //         System.out.println(i);
        //     }
        //    i++;
        // }




        /* MAke the function for the above name arrayFinder
         * Takes array of String and String as parameter
         * return index if 2nd argument = value matches any element of array
         * else return -1
         * print the returned index value
         */


        


    }
}

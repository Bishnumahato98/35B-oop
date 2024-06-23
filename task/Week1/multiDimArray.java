public class multiDimArray {
    public static void main(String[] args) {
        // /* one D aary, one square bracket [] */
        // int[] oneDArray;
        // /*TWo D array, two square bracket[][] */
        // int[][] twoDArray;
        // /*TWo D array, two square bracket[][][[] */
        // int[][][] threeDArray;
        

        // /*memory alloc, must give size to each dimesion */
        // twoDArray =new int [2][3];
        // /* visual
        //  * [
        //  * [0,0,0],-> 0
        //  * [0,0,0,]-> 1
        //  * ]
        //  */

        //  // twoDArray[0]-> access the 0th index array
        // twoDArray[0][0]=10;
        // twoDArray[0][1]=20;
        // twoDArray[1][0]=100;
        // twoDArray[1][2]=200;
        // //access in variable
        // int arrayElement = twoDArray[0][0];
        // System.out.println(arrayElement);
        // System.out.println(twoDArray[0][1]);





        /*make the follwoing array
         * [
         * [10,-10]
         * [20,-20]
         * [-30,8]
         * [40,45]
         * [50,56]
         * ]
         * print the value 
         * 50, 56
         */

        int [][] twoDArray;
        twoDArray =new int [5][2];
        twoDArray[0][0]=10;
        twoDArray[0][1]=-10;
        twoDArray[1][0]=20;
        twoDArray[1][1]=-20;
        twoDArray[2][0]=-30;
        twoDArray[2][1]=8;
        twoDArray[3][0]=40;
        twoDArray[3][1]=45;
        twoDArray[4][0]=50;
        twoDArray[4][1]=56;

        System.out.println(twoDArray[4][1]);
        System.out.println(twoDArray[4][0]);

        







    }
}

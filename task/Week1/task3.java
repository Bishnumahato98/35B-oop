import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int a,b,c,d ;
        // a=12;
        // b=10;
        // c=a + b++;
        // d=a - b--;
        // System.err.println(c);
        // System.out.println(d);


        // for (int i=0; i<6; i++){
        //     if (i==2) break;
        //     System.out.println("hello bishnu");
        // }

        // for (int i=1; i<=5; i++){
        //     for (int j=1; j<=10; j++){
        //         System.out.println(i+" * "+j+" = "+i*j);
        //     }

        // }

            while (true){
                System.out.println("Select a fruit");
                System.out.println("1. Apple");
                System.out.println("2. Banana");
                System.out.println("3. Exit");
                System.out.print("Enter your choice :");
                int choice=scanner.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("You have selected Apple");
                        break;
                    case 2:
                        System.out.println("You have selected Banana");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice.Please selected the valid choice.");
                        break;
                    
                } 

            }

           
            




            

    }
}

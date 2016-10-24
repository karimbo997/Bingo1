import java.util.Scanner;
import java.util.Random;
/**
 * Created by 436251 on 24/10/16.
 */
public class Bingo {
    public void run(){

        Scanner scan = new Scanner(System.in);

        /*
        //Bingo Card Array
        int[] arr = new int[5];
        arr[0] = (int) Math.random();
        arr[1] = (int) Math.random();
        arr[2] = (int) Math.random();
        arr[3] = (int) Math.random();
        arr[4] = (int) Math.random();
        */

        //Bingo! menu
        System.out.println("******************************************");
        System.out.println("* BINGO");
        System.out.println("******************************************");
        System.out.println("* 1) Create a Bingo card");
        System.out.println("* 2) Draw a number");
        System.out.println("* 3) Check Bingo card");
        System.out.println("* 9) Exit");
        System.out.println("******************************************");

        //Variable for menu
        int CreateBingo = scan.nextInt();
        int DrawBingo = scan.nextInt();
        int CheckBingo = scan.nextInt();
        int StopBingo = scan.nextInt();

        boolean check = false;

        //Creating bingo card
        if (CreateBingo == 1){
            System.out.println("Creating bingo card");
            System.out.println("Enter a value for field 1: ");
            int field1 = scan.nextInt();
            if (scan.nextInt() > 20) {
                System.out.println("The value is too high!");
                check = false;
            }
            else if (scan.nextInt() < 0) {
                System.out.println("the valye is too low!");
                check = false;
            }
            System.out.println("Enter a value for field 2: ");
            int field2 = scan.nextInt();
            System.out.println("Enter a value for field 3: ");
            int field3 = scan.nextInt();
            System.out.println("Enter a value for field 4: ");
            int field4 = scan.nextInt();
            System.out.println("Enter a value for field 5: ");
            int field5 = scan.nextInt();
        }


    }

    public static void main(String[] args) {
        new Bingo().run();
    }
}

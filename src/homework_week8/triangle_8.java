package homework_week8;

import java.util.Scanner;

/*Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/
public class triangle_8 {


    public static void main(String[] args) {



            Scanner s1 = new Scanner(System.in);

            System.out.print("Enter Right Angled Triangle Pattern Rows = ");
            int rows = s1.nextInt();

            System.out.println("Printing Right Angled Triangle @ Pattern");

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
    }

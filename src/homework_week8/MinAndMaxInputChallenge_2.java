package homework_week8;

import java.util.Scanner;

/*Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.
        Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge */
public class MinAndMaxInputChallenge_2 {

    public static void main(String[] args) {

            int count = 0;
            int max = 0;
            int min = 0;
            boolean first = true;

            Scanner minimumMAximumInput = new Scanner(System.in);
            while(true){

                System.out.println("Enter a number: ");
                boolean hashNextInt = minimumMAximumInput.hasNextInt();

                count += 1;
                if(hashNextInt) {

                    int storedNumber = minimumMAximumInput.nextInt();

                    if(first){
                        first = false;
                        min = storedNumber;
                        max = storedNumber;
                    }

                    if(storedNumber > max) {
                        max = storedNumber;
                    }

                    if(storedNumber < min) {
                        min = storedNumber;
                    }

                } else {

                    System.out.println("Invalid number");
                    break;
                }

                minimumMAximumInput.nextLine(); // Handle nextline input
            }

            System.out.println("The minimum number of this: " + min);
            System.out.println("The maximum number of this: " + max);


            minimumMAximumInput.close();

        }

}
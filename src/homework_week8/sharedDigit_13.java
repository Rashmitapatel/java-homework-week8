package homework_week8;

/*
        Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
        within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
        otherwise, the method should return false.
        EXAMPLE INPUT/OUTPUT:
        * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
        * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
        * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
        NOTE: The method hasSharedDigit should be defined as public static */
/*public class sharedDigit_13 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number:");
        int one = s1.nextInt();
        int two = s1.nextInt();
        hasSharedDigit
    }
        public static boolean hasSharedDigit ( int one, int two){

            int modulusOne = one % 10;
            int modulusTwo = two % 10;
            int divisionOne = one / 10;
            int divisionTwo = two / 10;

            if ((one < 10 || one > 99) || (two < 10 || two > 99)) {
                return false;
            } else if (one == two) {
                return true;
            } else if (modulusOne == modulusTwo) {
                return true;
            } else if (divisionOne == divisionTwo) {
                return true;
            } else if (divisionOne == modulusTwo) {
                return true;
            } else if (divisionTwo == modulusOne) {
                return true;
            } else {
                return false;
            }
        }
    }
*/

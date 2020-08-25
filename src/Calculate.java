import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        //Create two int variables
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);


        //Ask user for input
        System.out.println("Please enter a whole number: ");
        num1 = sc.nextInt();
        System.out.println("Now, enter another whole number: ");
        num2 = sc.nextInt();

        //Create a variable that adds the numbers
        int sum = num1 + num2;
        //Creates a variable that multiplies the numbers
        int product = num1 * num2;

        System.out.println("The sum of the two integers is: " + sum +
                "\nThe product of the two integers is: " + product);

        System.out.println("... and now this: \nLet's find the square root of a new number  (integer please):");
        int num3 = sc.nextInt();

        //Calculate the square root of a given number
        double squareRoot = Math.sqrt(num3);
        System.out.println("The square root of " + num3 + " is " + squareRoot);

        //an alternative would be to use the following output
        //System.out.println("The square root of " + num3 + " is " + Math.sqrt(num3));


        System.out.println("Goodbye.");




    }
}


import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("How many numbers do you want to check? "); 
        int a = j.nextInt();
        for (int x = a; x > 0; x--) {// Loop naten para dalawa yung maging output, pwde x++ para infinite na inputs

            int number = getIntegerInput(j);
            String result = checkEvenOrOdd(number);
            System.out.println(number + result);
        }
    }

    public static int getIntegerInput(Scanner j) { // pwede pala naten palitan to pero
        System.out.print("Enter an Integer: "); 
        return j.nextInt(); // dapat dito mag palit din, parang scanner overloading pag kakaintindi naten dito
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return " is an even number";
        } else {
            return " is an odd number";
        }
    }
}

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User_input {

    public static void main(String[] args) {

        System.out.println(sumOfFiveNumbers());

    }

    public static int sumOfFiveNumbers(){

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;

        do {

            System.out.println("Enter the number #" + number);
            try {
                sum += scanner.nextInt();
            } catch (InputMismatchException e) {

                System.out.println("Invalid input");
                continue;

            }

            number++ ;
        } while (number <= 5);

        return sum;

    }

}

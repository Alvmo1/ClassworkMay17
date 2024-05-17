package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


//    public static void dividedNumbers(){
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a Numerator");
//            int numerator = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Enter a Denominator");
//            int denominator = scanner.nextInt();
//
//            int result = numerator / denominator;
//            System.out.println("Result: " + result);
//
//
//
//
//        } catch (InputMismatchException inputMismatchException){
//            inputMismatchException.printStackTrace();
//        } catch (ArithmeticException arithmeticException){
//            System.out.println("Error: Cannot divide by Zero");
//        }
//    }


    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a Numerator");
                int numerator = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter a Denominator");
                int denominator = scanner.nextInt();


                int result = numerator / denominator;
                System.out.println("Result: " + result);


            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by 0");
            } catch (InputMismatchException inputMismatchException) {
                inputMismatchException.printStackTrace();
            }
        }
    }
}


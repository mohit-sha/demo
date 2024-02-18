import java.util.Scanner;

public class lecture_3 {
    public static void main(String args[]) {
        //conditon statement

        //1. if else
        //example-1
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("Not adult");
        }

        //example-2
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //example-3
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is greater");
        } else if (a < b) {
            System.out.println("b is greater");
        } else {
            System.out.println("both are equal");
        }

        //2. switch 
        //example-1
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("Invalid Input");
        }
        //example-2 calculator
        int c = sc.nextInt();
        int d = sc.nextInt();
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Additon");
                System.out.println(c + d);
                break;

            case 2:
                System.out.println("Subtraction");
                System.out.println(c - d);
                break;

            case 3:
                System.out.println("Multiplication");
                System.out.println(c * d);
                break;

            case 4:
                System.out.println("Division");
                System.out.println(c / d);
                break;

            case 5:
                System.out.println("Remainder");
                System.out.println(c % d);
                break;

            default:
                System.out.println("Invalid Input");

        }

        //example-3 calendar
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}

import java.util.Scanner;

public class Monobank {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println(sumOfNumbers());
        System.out.println("Task #2");
        System.out.println(monobank());
    }
    public static String sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a random number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter a random number 2: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        return "The sum of these two numbers is: " + sum;
    }
    public static String monobank() {
        System.out.println("Welcome to Monobank!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first name here: ");
        String firstName = scanner.nextLine();
        System.out.print("Please enter your last name here: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter your deposit here : ");
        int deposit = scanner.nextInt();
        System.out.print("Deposit rate: ");
        double rate = scanner.nextDouble();
        int year = 1;
        double depositAfterRate = (deposit * Math.pow(1 + (rate / 100), year));
        System.out.println("Dear " + firstName + " " + lastName + "," + " your deposit after 1 year will be: "
                + depositAfterRate);
        year = 5;
        depositAfterRate = deposit * Math.pow(1 + (rate / 100), year);
        System.out.println("Dear " + firstName + " " + lastName + "," + " your deposit after 5 year will be: "
                + depositAfterRate);
        year = 10;
        depositAfterRate = deposit * Math.pow(1 + (rate / 100), year);
        return "Dear " + firstName + " " + lastName + "," + " your deposit after 10 year will be: " + depositAfterRate;
    }

}

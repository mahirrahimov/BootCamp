package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int requiredsalary = 30000;
        int requiredyears  = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years you worked");
        double years = scanner.nextDouble();
        scanner.close();
        if (salary > requiredsalary)
            if (years>requiredyears){
                System.out.println("Congrats! You are qualified");
            }
        else {
               double neededYears = requiredyears - years;
                System.out.println("You need to work " + neededYears +" more years");
             }
        else {
            double neededmoney = requiredsalary - salary;
            System.out.println("You need to earn  $" + neededmoney + " more money");

        }

    }
}

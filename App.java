package ecutb.claes.akesson;


import java.util.Scanner;

public class App {

    static   Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean onOff = true;
        double answer;



        while(onOff){
            System.out.println("want to calculate y/n?");
            String yn = scanner.nextLine();
            switch(yn){
                case "n":
                    onOff = false;
                    break;
                case "N":
                    onOff = false;
                    break;
                default:
                    System.out.println("Enter your number:");
                    double tal = Double.parseDouble(scanner.nextLine());
                    System.out.println("Choose a operator: ");
                    System.out.println("1. Addition.");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    int operator =  Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter your second number");
                    double tal2 = Double.parseDouble(scanner.nextLine());

                    switch (operator){
                        case 1:
                            answer = addition(tal,tal2);
                            System.out.println(tal+" + "+tal2+" = "+answer);

                            break;
                        case 2:
                            answer = subtraction(tal,tal2);
                            System.out.println(tal+" - "+tal2+" = "+answer);
                            break;
                        case 3:
                            answer = multiplication(tal,tal2);
                            System.out.println(tal+" * "+tal2+" = "+answer);
                            break;
                        case 4:
                            answer = division(tal, tal2);
                            System.out.println(tal+" / "+tal2+" = "+answer);
                            break;


                    }
            }










        }

    }

    public static double division(double number1, double number2) {
        double result;
        result = number1 / number2;
        return result;
    }

    public static double multiplication(double number1, double number2) {
        double result;
        result = number1 * number2;
        return result;
    }

    public static double subtraction(double number1, double number2) {
        double result;
        result = number1 - number2;
        return result;
    }

    public static double addition(double number1, double number2) {
        double result;
        result = number1 + number2;
        return result;
    }


}
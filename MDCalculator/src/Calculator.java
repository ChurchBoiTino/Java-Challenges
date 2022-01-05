import java.util.*;

public class Calculator {
    public static void main(String [] args){
        int value1 = 0;
        int value2 = 0;
        String operator = "";
        Scanner userInput = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter first value: ");
                value1 = userInput.nextInt();
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Input is not a number. Try again");
                userInput.next();
            } catch (InputMismatchException mis) {
                System.out.println("Input is not a number. Try again");
                userInput.next();
            }
        }

        System.out.print("Enter operator: ");
        operator = userInput.next();

        try{
            System.out.print("Enter second value: ");
            value2 = userInput.nextInt();
        }
        catch(NumberFormatException ex){
            System.out.println("Input is not a number. Try again");
        }

        switch(operator){
            case "+":
                System.out.print((value1) + " " + (operator) + " " + (value2) + " = " + (value1 + value2));
                break;
            case "/":
                System.out.println((value1) + " " + (operator) + " " + (value2) + " = " + (value1 / value2));
                break;
            case "*":
                System.out.println((value1) + " " + (operator) + " " + (value2) + " = " + (value1 * value2));
                break;
            case "-":
                System.out.println((value1) + " " + (operator) + " " + (value2) + " = " + (value1 - value2));
                break;
            case "%":
                System.out.println((value1) + " " + (operator) + " " + (value2) + " = " + (value1 % value2));
            default:
                System.out.println("Invalid operand entered. Try again.");
        }
    }
}

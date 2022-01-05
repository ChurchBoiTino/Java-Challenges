import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
        int previousNum = 0;
        int nextNum = 1;
        int maxNum = 0;
        Scanner numInput = new Scanner(System.in);

        System.out.print("Enter max number for fibonacci sequence: ");

        try{
            maxNum = numInput.nextInt();
        }
        catch(NumberFormatException ex){
            System.out.println("You have entered an invalid input. A number is required");
        }

        int i = 1;

        while(i <= maxNum){
            System.out.println(previousNum + " ");
            int total = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = total;
            i++;
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to CISP 401 Simple Calculator. \n\nEnter an Integer: ");
        int int1 = input.nextInt();
        System.out.print("Enter the second Integer: ");
        int int2 = input.nextInt();
        System.out.print("Now, enter the mathematical operator to be used (+: 1, -: 2, *: 3, /: 4): ");
        int operatorKey = input.nextInt();
        int result;
        switch(operatorKey){
            case 1:
                result = int1+int2;
                break;
            case 2:
                result = int1-int2;
                break;
            case 3:
                result = int1*int2;
                break;
            case 4:
                result = int1/int2;
                break;
            default:
                result = -1;
                break;
        }
        if(result == -1){
            System.out.println("Invalid Operator.");
        }else{
            System.out.println("Answer: "+result);
        }
    }
}
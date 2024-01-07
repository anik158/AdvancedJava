package stack_ex_3;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

    public static String insertValue(int num){
        final int BASE = 2;

        Stack<Integer> numbers = new Stack<>();

        do{
            numbers.push(num%BASE);
            num = num/BASE;
        }while (num !=0);

        String bits = "";

        while (!numbers.empty()){
            bits = bits+""+numbers.peek();
            numbers.pop();
        }

        return bits;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal value to convert: ");
        int input = scan.nextInt();

        String convertedDigits = insertValue(input);

        System.out.println(convertedDigits);
    }
}

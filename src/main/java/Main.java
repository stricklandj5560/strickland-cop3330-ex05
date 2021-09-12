import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Strickland
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            double firstNum, secondNum, sum, diff, mult, div = 0;
            System.out.print("What is the first number? ");
            String fn = scan.next();
            System.out.print("What is the second number? ");
            String sn = scan.next();
            // do conversions
            firstNum = Double.valueOf(fn);
            secondNum = Double.valueOf(sn);
            // do calc
            sum = firstNum + secondNum;
            diff = firstNum - secondNum;
            mult = firstNum * secondNum;
            div = firstNum / secondNum;
            // output.
            System.out.println(
                            String.format("%s + %s = %s\n", firstNum, secondNum, sum) +
                            String.format("%s - %s = %s\n", firstNum, secondNum, diff) +
                            String.format("%s * %s = %s\n", firstNum, secondNum, mult) +
                            String.format("%s / %s = %s", firstNum, secondNum, div)
                            );
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

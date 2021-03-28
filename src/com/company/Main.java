package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("###########################################");
        System.out.println("Welcome to the Simple Calculator Program!!!");
        System.out.println("###########################################\n\n");

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers: ");

            double n1 = input.nextDouble();
            double n2 = input.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = input.next().charAt(0);


            switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    play();
                    continue;
                case '-':
                    System.out.println(n1 - n2);
                    play();
                    continue;
                case '*':
                    System.out.println(n1 * n2);
                    play();
                    continue;
                case '/':
                    System.out.println(n1 / n2);
                    play();
                    continue;
                default:
                    System.out.println("ERROR!? operator is not correct!!!!");
                    return;
            }
        } while (true);
    }
    

    static void play() {

            Scanner input = new Scanner(System.in);
            System.out.println("\n\nClick (C) to continue\tor\t(Q) to quit");
            String user = input.nextLine();
            if (user.equals("Q")) {
                System.out.println("\n\nExiting Program.....");
                System.exit(0);
            }
            else if (user.equals("C"))
                System.out.println("\n\nAwesome to hear! Let's do another!!!\n\n");
    }
}

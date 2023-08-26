package edu.wctc;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {

            System.out.println("Welcome to the Preference Quiz!\n" +
                    "-------------------------------");

            Scanner yn = new Scanner(System.in);
            System.out.println("Would You Like to Play? y/n: ");
            String ans = yn.nextLine();

            switch (ans){
                case "y":
                    quiz();
                    break;
                case "n":
                    System.out.println("That's sad. Bye.");
                    break;
            }
        }
        public static void quiz () {

            Scanner answer = new Scanner(System.in);

            int[] respons = {0, 0, 0, 0, 0};

            System.out.println("Do you prefer Dogs or Cats?");
            System.out.println("Enter 0 for left or 1 for right: ");
            respons[0] = answer.nextInt();

            System.out.println("\nDo you prefer Beef or Chicken?");
            System.out.println("Enter 0 for left or 1 for right: ");
            respons[1] = answer.nextInt();

            System.out.println("\nDo you prefer Movies or TV Shows?");
            System.out.println("Enter 0 for left or 1 for right: ");
            respons[2] = answer.nextInt();

            System.out.println("\nDo you prefer Summer or Fall?");
            System.out.println("Enter 0 for left or 1 for right: ");
            respons[3] = answer.nextInt();

            System.out.println("\nDo you Prefer Plastic or Paper?");
            System.out.println("Enter 0 for left or 1 for right: ");
            respons[4] = answer.nextInt();

            int total = 0;

            for(int i = 0; i < 5; i++){
                if(respons[i] == 1){
                    total++;
                }
            }

            System.out.println("Your Coolness Total: " + total);

            Scanner yn = new Scanner(System.in);
            System.out.println("\n-------------------------------" +
                    "\nWould you like to play again? y/n: ");
            String ans = yn.nextLine();
            switch (ans) {
                case "y":
                    quiz();
                    break;
                case "n":
                    System.out.println("That's sad. Bye.");
                    break;
            }
        }
    }




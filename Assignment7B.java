//Class: CSE1321L
// Section: 9
// Term: Fall 2020
// Instructor: Howard Dexter
// Name: Patrick O'Connell
// Assignment 7B
import java.util.Scanner;
public class Assignment7B {
    static int getUserChoice(Scanner keyboard) {
        System.out.println ("Would you like to: ");
        System.out.println ("1) Charge");
        System.out.println ("2) Make a payment");
        System.out.println ("3) See current balance");
        System.out.println ("4) Quit");
        return keyboard.nextInt();
         }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float amount;
        CreditCard myCard = new CreditCard(0);
        int userChoice;
        do {
            userChoice = getUserChoice(scan);
            switch (userChoice) {
                case 1: System.out.println ("Amount to charge: ");
                    amount = scan.nextFloat(); myCard.charge(amount);
                    break;
                case 2: System.out.println ("Amount to pay: ");
                    amount = scan.nextFloat();
                    myCard.makePayment(amount);
                    break;
                case 3: myCard.print();
                    break;
            }
        } while (userChoice !=4);
    } }
  
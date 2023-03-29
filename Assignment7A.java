//Class: CSE1321L
// Section: 9
// Term: Fall 2020
// Instructor: Howard Dexter
// Name: Patrick O'Connell
// Assignment7A
import java.util.Scanner;
public class Assignment7A {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Ball b1;
            int xPos, yPos, xVel, yVel, numMove;
            System.out.println("x:");
            xPos = scan.nextInt();
        System.out.println("y:");
        yPos = scan.nextInt();
        System.out.println("x velocity:");
        xVel = scan.nextInt();
        System.out.println("y velocity:");
        yVel = scan.nextInt();
        System.out.println("Number of moves:");
        numMove = scan.nextInt();

        b1 = new Ball(xPos, yPos, xVel, yVel);

        for(int i=0; i<numMove+1; i++){
            b1.ballPrint();
            b1.move();
        }


        }
}

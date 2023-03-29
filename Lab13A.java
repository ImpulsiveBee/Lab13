//Class: CSE1321L
// Section: 9
// Term: Fall 2020
// Instructor: Howard Dexter
// Name: Patrick O'Connell
// Lab 13
import java.util.Scanner;
public class Lab13A {

    public static int eNumAlive(Enemy[] e){
        int numAlive=0;
        for(int i=0; i<e.length; i++){
            if(e[i].getHP()>0){
                numAlive++;
            }
        }
        return numAlive;
    }
    public static void printEnemyHP(Enemy[] e){
        for(int i=0; i<e.length; i++){
            System.out.print("|"+e[i].getHP());
        }
    }

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int enemyNum, enemyDam, heroHP, heroDam, roundNum=1;
        System.out.print("Enter the number of enemies: ");
        enemyNum = scan.nextInt();
        System.out.print("Enter the enemy damage: ");
        enemyDam = scan.nextInt();
        System.out.print("Enter the hero's starting HP: ");
        heroHP = scan.nextInt();
        System.out.print("Enter the hero's damage: ");
        heroDam = scan.nextInt();

        Hero h1 = new Hero(heroHP, heroDam);
        Enemy[] e = new Enemy[enemyNum];

        for(int i=0; i<enemyNum; i++){
            e[i]= new Enemy((10+2*i),enemyDam);
        }

        do{
            for(int i=0; i<e.length; i++){
                if(e[i].getHP()>0){
                e[i].takeDamage(heroDam);
                h1.takeDamage(enemyDam);}
            }
            System.out.println("==== After round "+(roundNum)+" ====");
            System.out.println("Num enemies left: "+eNumAlive(e));
            printEnemyHP(e);
            System.out.println();
            System.out.println("Hero HP: "+h1.getHP());
            roundNum++;
            if(h1.getHP()<=0){
                System.out.println("Enemies win!");
                break;
            }
            if(eNumAlive(e)<=0){
                System.out.println("Hero wins!");
                break;
            }
        } while(eNumAlive(e)>0 && h1.getHP()>=0);
    }
}

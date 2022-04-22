import java.util.Scanner;
public class Cash {

    public static void main(String[] args) {
// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        double dollar;
        do
        {
            System.out.println("amount of change you owe");
            dollar = input.nextDouble();

        }
        while (dollar < 0);

        double quarter = 25;
        double dime = 10;
        double nickle = 05;
        double penny = 01;

        int cents = (int) Math.round(dollar * 100);
        int change = 0;

        while (cents >= quarter) {
            cents-=quarter;
            change++;
        }

        while (cents >= dime) {
            cents-=dime;
            change++;
        }

        while (cents >= nickle) {
            cents-=nickle;
            change++;
        }

        while (cents >= penny) {
            cents-=penny;
            change++;
        }

        System.out.println ("for $ "+ dollar+ " you owe " +change + " coins");
    }

}

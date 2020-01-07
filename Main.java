import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("this program will compute head and tail percentage");
        System.out.println("Enter number of coins you wanna toss");
        double coins = keyboard.nextDouble();
        int head = 0;
        int tail = 0;
        char value;
        double headPercentage = 0;
        double tailPercentage = 0;
        for(int i = 0; i<coins; i++)
        {
            System.out.println("enter head or tail");
            value = keyboard.next().charAt(0);
            if(value == 'h')
                head++;
            else
                tail++;

        }
        System.out.println("Number of heads: " + head);
        System.out.println("Number of tails: " + tail);
        System.out.println("percent heads: " + ((head/coins)*100));
        System.out.println("percent tails: " + ((tail/coins)*100));
    }
}

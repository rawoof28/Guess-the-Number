import java.util.Random;
import java.util.Scanner;

class GuessNumber
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        String play;
        Random rand = new Random();
        do
        {
            int number = rand.nextInt(1000);

            System.out.println("Start Guessing the Number Start from 0 to 1000");
            int count=0;
            while(true)
            {
                System.out.print("Enter the number :");
                int guess = sc.nextInt();
                count++;

                if(guess == number)
                {
                    System.out.println("You guess the in '"+count+"' times.");
                    System.out.println("The number is "+guess);
                    System.out.println();
                    break;
                }
                else if(guess > number)
                {
                    if(guess-10 >= number)
                    {
                        System.out.println("The Number is Too High.");
                    }
                    else
                    {
                        System.out.println("The Number is High.");
                    }
                }
                else
                {
                    if(guess+10 <= number)
                    {
                        System.out.println("The Number is Too Low.");
                    }
                    else
                    {
                        System.out.println("The Number is Low.");
                    }
                }
                System.out.println();
            }
            
            System.out.println("You want to play (yes/no) :");
            play = sc.next().toLowerCase();

        }while(play.equals("yes"));

        sc.close();
    }
}
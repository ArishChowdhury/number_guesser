//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        int number = (int) (Math.random() *100);
        int guess;
        System.out.println("Guess a number between 1 and 100. You have 10 tries if you fail you are killed ");
        int count = 1;
        do{
            System.out.println("Your guess: ");
            guess = ss.nextInt();

            if (guess == number){
                System.out.print("***CORRECT***");

            }

            else if(guess>number){
                System.out.println("Number is too high");
                count++;
            }

            else{
                System.out.println("Number is too low");
                count++;
            }


        }

        while (guess!=number && count<=10);
        if (count<=10) {
            System.out.println("You found it in the " +count+" times");

        }
        else{
            System.out.println("You failed to find it within 10 attempts!");

        }



    }
}
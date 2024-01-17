import java.util.*;

public class templ {
	public static void main(String [] args){
        int guess, secret, counter;
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        counter = 1;
        guess = 0;
        secret = rand.nextInt(100) + 1;
        System.out.println ("Please input a number to guess: ");
        guess = sc.nextInt();
        while (guess != secret){
            if (guess > secret)         System.out.println("Too big!");
            else if (guess < secret)    System.out.println("Too small!");
            counter += 1;
            System.out.println("Please input another number");
            guess = sc.nextInt();
        }
        System.out.println ("Congratulations! It took you " + counter + " tries.");
	}
}

		

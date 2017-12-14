import java.util.*;
public class Lab06Example04 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a magic number betxeen 0 and 100");
		while (true) {
			System.out.print("\nEnter your guess: ");
			int guess = scan.nextInt();
			if (guess == number) {
				System.out.println("Yes, the number is " + number);
				break;
			} else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}

	}

}
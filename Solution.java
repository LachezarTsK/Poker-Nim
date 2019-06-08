import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfPiles = scanner.nextInt();
			/**
			 * Maximum number of times a player can add chips to a pile.
			 */
			int maximumAdditionsPerPlayer = scanner.nextInt();

			int numberOfChipsAtPile = 0;
			for (int j = 0; j < numberOfPiles; j++) {
				/**
				 * Since each player has an equal number of times to add chips to a pile, an
				 * addition of chips from one player can be negated with an addition from the
				 * other player.
				 * 
				 * Thus, XOR operations for the standard Nim Game (at each turn, removing at
				 * least one element from a pile, up to all contained in the pile) can be
				 * applied.
				 */
				numberOfChipsAtPile = numberOfChipsAtPile ^ scanner.nextInt();
			}

			if (numberOfChipsAtPile == 0) {
				System.out.println("Second");
			} else {
				System.out.println("First");
			}
		}
		scanner.close();
	}
}

import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    enum Move {
        ROCK, PAPER, SCISSORS, LIZARD, SPOCK
    }

    static int winner(Move a, Move b) {

        if (a == b) {
            return 0;
        }

        return switch (a) {

            case ROCK -> 
                (b == Move.LIZARD || b == Move.SCISSORS) ? 1 : -1;

            case PAPER -> 
                (b == Move.ROCK || b == Move.SPOCK) ? 1 : -1;

            case SCISSORS -> 
                (b == Move.PAPER || b == Move.LIZARD) ? 1 : -1;

            case LIZARD -> 
                (b == Move.SPOCK || b == Move.PAPER) ? 1 : -1;

            case SPOCK -> 
                (b == Move.SCISSORS || b == Move.ROCK) ? 1 : -1;
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nRound " + i);

            Move computerMove = Move.values()[
                random.nextInt(Move.values().length)
            ];

            System.out.print(
                "Enter your move (ROCK, PAPER, SCISSORS, LIZARD, SPOCK): "
            );

            String input = sc.nextLine().toUpperCase();

            Move playerMove = Move.valueOf(input);

            System.out.println("You chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);

            int result = winner(playerMove, computerMove);

            switch (result) {
                case 1 -> {
                    System.out.println("You win this round!");
                    playerScore++;
                }
                case -1 -> {
                    System.out.println("Computer wins this round!");
                    computerScore++;
                }
                default -> System.out.println("It's a tie!");
            }
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + playerScore);
        System.out.println("Computer: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("You win " + playerScore + "-" + computerScore);
        }
        else if (computerScore > playerScore) {
            System.out.println(
                "Computer wins " + computerScore + "-" + playerScore
            );
        }
        else {
            System.out.println("Overall tie!");
        }

        sc.close();
    }
}
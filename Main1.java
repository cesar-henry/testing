import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int P1wins = 0;
        int P2wins = 0;

	System.out.println("Let's Play");
        System.out.println("--Rock-Paper-Scissors--");
        System.out.println("Enter R for rock, P for paper, or S for scissors");
        char P1;
        char P2;
        char game;

        do
        {
            System.out.print("Player One: ");
            P1 = kbd.nextLine().charAt(0);
            System.out.print("Player Two: ");
            P2 = kbd.nextLine().charAt(0);
            if (P1 == 'R')
            {
                switch (P2) {
                    case 'R' -> System.out.println("Tie");
                    case 'P' -> {
                        System.out.println("Player Two Wins: Paper covers rock");
                        P2wins++;
                    }
                    case 'S' -> {
                        System.out.println("Player One Wins: Rock smashes scissors");
                        P1wins++;
                    }
                    default -> System.out.println("Player Two did not enter a valid entry");
                }
            }
            else if (P1 == 'P')
            {
                switch (P2) {
                    case 'R' -> {
                        System.out.println("Player One Wins: Paper covers rock");
                        P1wins++;
                    }
                    case 'P' -> System.out.println("Tie");
                    case 'S' -> {
                        System.out.println("Player Two Wins: Scissors cuts paper");
                        P2wins++;
                    }
                    default -> System.out.println("Player Two did not enter a valid entry");
                }
            }
            else if (P1 == 'S')
            {
                switch (P2) {
                    case 'R' -> {
                        System.out.println("Player Two Wins: Rock smashes scissors");
                        P2wins++;
                    }
                    case 'P' -> {
                        System.out.println("Player One Wins: Scissors cuts paper");
                        P1wins++;
                    }
                    case 'S' -> System.out.println("Tie");
                    default -> System.out.println("Player Two did not enter a valid entry");
                }
            }
            else
            {
                switch (P2)
                {
                    case 'R':
                    case 'P':
                    case 'S':
                        System.out.println("Player One did not enter a valid entry.");
                    default:
                        System.out.println("Neither player entered a valid entry.");
                }
            }
            System.out.print("Continue? Enter Y for yes or anything else for no: ");
            game = kbd.nextLine().charAt(0);
            System.out.println();
        } while (game == 'Y');
        System.out.println("Player One has won " + P1wins + " time(s)");
        System.out.println("Player Two has won " + P2wins + " time(s)");
    }
}

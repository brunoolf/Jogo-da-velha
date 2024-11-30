import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        System.out.println("Jogo da velha!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do jogador 1: ");
        String player1Name = scanner.nextLine();
        System.out.print("Nome do jogador 2: ");
        String player2Name = scanner.nextLine();

        Player player1 = new Player(player1Name, "X");
        Player player2 = new Player(player2Name, "O");

        GameService gameService = new GameService(player1, player2);
        gameService.startGame();
    }
}

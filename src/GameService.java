import java.util.Scanner;

public class GameService {
    private Board board;
    private Player player1;
    private Player player2;

    public GameService(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        String winner = null;

        while (winner == null && !board.isFull()) {
            board.displayBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), é a sua vez!");

            int row, col;
            while (true) {
                System.out.print("Escolha a linha (0-2): ");
                row = scanner.nextInt();
                System.out.print("Escolha a coluna (0-2): ");
                col = scanner.nextInt();
                if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                    break;
                } else {
                    System.out.println("Movimento inválido, tente de novo.");
                }
            }

            winner = board.checkWinner();
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        board.displayBoard();
        if (winner != null) {
            System.out.println("Parabéns, " + (winner.equals(player1.getSymbol()) ? player1.getName() : player2.getName()) + "! Você venceu!");
        } else {
            System.out.println("Deu velha!");
        }
    }
}

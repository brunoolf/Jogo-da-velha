public class Board {
    private String[][] board;

    public Board() {
        board = new String[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    public boolean makeMove(int row, int col, String symbol) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || !board[row][col].equals(" ")) {
            return false; // Movimento inválido
        }
        board[row][col] = symbol;
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    public String checkWinner() {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            // Linhas
            if (!board[i][0].equals(" ") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return board[i][0];
            }
            // Colunas
            if (!board[0][i].equals(" ") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return board[0][i];
            }
        }
        // Diagonais
        if (!board[0][0].equals(" ") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0];
        }
        if (!board[0][2].equals(" ") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return board[0][2];
        }
        return null; // Sem vencedor
    }
}

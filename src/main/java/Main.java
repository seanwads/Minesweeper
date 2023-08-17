import java.util.Scanner;

public class Main {

    public static Board board;
    public static void main(String[] args) {

        System.out.println("--------Minesweeper--------");
        System.out.println(" ");
        System.out.println(" ");
        Scanner boardSizeInput = new Scanner(System.in);
        System.out.println("What board size would you like? Please enter an integer between 6 and 10:");
        int boardSize = 0;

        do {
            if(boardSizeInput.hasNextInt()) {
                if (boardSizeInput.nextInt() > 6 && boardSizeInput.nextInt() < 10) {
                    boardSize = boardSizeInput.nextInt();
                } else {
                    System.out.println("Please enter a an integer between 6 and 10");
                }
            }
            else{
                System.out.println("Please enter a an integer between 6 and 10");
                boardSizeInput.next();
            }
        } while (boardSize == 0);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Generating Board...");
        System.out.println(" ");
        System.out.println(" ");
    }

    private static void GenerateEmptyBoard(int boardSize){
        Tile[][] newBoardArray = new Tile[boardSize][boardSize];
        board = new Board(newBoardArray);
    }
}

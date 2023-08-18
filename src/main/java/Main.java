import java.util.Scanner;

public class Main {

    public static Board board;
    private static boolean hasWon = false;
    private static boolean isFirstTry = false;
    public static void main(String[] args) {

        System.out.println("--------Minesweeper--------");
        System.out.println(" ");
        System.out.println(" ");

        Scanner boardSizeInput = new Scanner(System.in);
        System.out.println("What board size would you like?");
        int boardSize = 0;

        do {
            System.out.println("Please enter an integer between 6 and 10:");

            if(!boardSizeInput.hasNextInt()){
                System.out.println("That's not a number! Please enter an integer between 6 and 10");
                boardSizeInput.next();
            }
            boardSize = boardSizeInput.nextInt();
        } while (boardSize < 6 || boardSize > 10);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Generating Board of size " + boardSize + "...");
        System.out.println(" ");
        System.out.println(" ");

        GenerateEmptyBoard(boardSize);
    }

    private static void GenerateEmptyBoard(int boardSize){
        Tile[][] newBoardArray = new Tile[boardSize][boardSize];
        board = new Board(newBoardArray);


        for(int i = 0; i < boardSize; i++)
        {
            for(int j = 0; j < boardSize; j++)
            {
                newBoardArray[i][j] = new Tile();
                System.out.printf("%2s",newBoardArray[i][j].GetDisplayString());
            }
            System.out.println();
        }
    }
}

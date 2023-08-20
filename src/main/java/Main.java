import java.util.Scanner;

public class Main {

    public static Board board;
    private static boolean hasWon = false;
    private static boolean isFirstTry = true;
    private static int x;
    private static int y;
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

        if (isFirstTry) {
            GetPlayerInput();
            board.PopulateBoard(x, y);
        }
        else {

        }

    }

    private static void GenerateEmptyBoard(int boardSize){
        Tile[][] newBoardArray = new Tile[boardSize][boardSize];
        board = new Board(newBoardArray, boardSize);

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

    private static void GetPlayerInput(){

        Scanner CoordInput = new Scanner(System.in);
        System.out.println("Please input the co-ordinates of the tile you would like to select.");

        boolean inputValidated = false;

        do {
            System.out.println("Enter your x co-ordinate:");

            if(!CoordInput.hasNextInt()){
                System.out.println("That's not a number! Please enter your x co-ordinate as an integer:");
                CoordInput.next();
            }
            else if(CoordInput.nextInt() > board.GetBoardSize() || CoordInput.nextInt() < 0){
                System.out.println("Co-ordinate out of range! Please enter your x co-ordinate within board bounds:");
                CoordInput.next();
            }
            else {
                x = CoordInput.nextInt();
                System.out.println("Enter your y co-ordinate:");
                if(!CoordInput.hasNextInt()){
                    System.out.println("That's not a number! Please enter your y co-ordinate as an integer:");
                    CoordInput.next();
                }
                else if(CoordInput.nextInt() > board.GetBoardSize() || CoordInput.nextInt() < 0){
                    System.out.println("Co-ordinate out of range! Please enter your y co-ordinate within board bounds:");
                    CoordInput.next();
                }
                else {
                    y = CoordInput.nextInt();
                    inputValidated = true;
                }
            }
        } while (!inputValidated);
    }
}

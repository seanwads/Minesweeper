public class Board {
    private Tile[][] boardArray;
    public Tile[][] GetBoardArray(){return boardArray;}
    public void SetBoardArray(Tile[][] newArray){boardArray = newArray;}

    private int boardSize;
    public int GetBoardSize() {return boardSize;}
    public void SetBoardSize(int boardSize) {this.boardSize = boardSize;}

    public Board(Tile[][] emptyBoardArray, int boardSize){

        this.boardArray = emptyBoardArray;
        this.boardSize = boardSize;
    }

    public void PopulateBoard(int startX, int startY){

    }

}

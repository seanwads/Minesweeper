public class Board {
    private Tile[][] boardArray;
    public Tile[][] GetBoardArray(){return boardArray;}
    public void SetBoardArray(Tile[][] newArray){boardArray = newArray;}

    public Board(Tile[][] emptyBoardArray){
        this.boardArray = emptyBoardArray;
    }
}

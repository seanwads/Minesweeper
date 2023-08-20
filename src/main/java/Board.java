public class Board {
    private Tile[][] boardArray;
    public Tile[][] GetBoardArray(){return boardArray;}
    public void SetBoardArray(Tile[][] newArray){boardArray = newArray;}

    private int boardSize;
    public int GetBoardSize() {return boardSize;}
    public void SetBoardSize(int boardSize) {this.boardSize = boardSize;}

    private double mineProbability;
    public double getMineProbability() {return mineProbability;}
    public void setMineProbability(double mineProbability) {this.mineProbability = mineProbability;}

    public Board(Tile[][] emptyBoardArray, int boardSize){

        this.boardArray = emptyBoardArray;
        this.boardSize = boardSize;

        //replace with difficulty rules
        mineProbability = 0.2;
    }

    public void PopulateBoard(int startX, int startY){
        boardArray[startX][startY].setBombTile(false);
        boardArray[startX][startY].setAdjacentBombs(0);

        for(int x = 0; x < boardArray.length; x++){
            for(int y = 0; y < boardArray.length; y++){

                if(x != startX && y != startY ){
                    double mineRandom = Math.random();
                    if(mineRandom <= mineProbability){
                        boardArray[x][y].setBombTile(true);
                    }
                    else{
                        boardArray[x][y].setBombTile(false);
                    }
                }

                boardArray[x][y].setAdjacentBombs(CheckMineCount(x,y));
                //add neighbours
            }
        }
    }

    private int CheckMineCount(int selectX, int selectY){
        int count = 0;
        for(int i = (selectX-1); i <= (selectX+1); i++){
            for(int j = (selectY-1); j <= (selectY+1); j++){
                if(i >= 0 && i < boardArray.length && j >= 0 && j < boardArray.length &&
                        boardArray[i][j].GetIsBombTile()){
                    count++;
                }
            }
        }
        return count;
    }

    public void UpdateBoard(int selectX, int selectY, boolean isFirstTurn){
        if(boardArray[selectX][selectY].GetIsBombTile()){
            //game over
        }
        else {
            boardArray[selectX][selectY].SetDisplayString(Integer.toString(boardArray[selectX][selectY].getAdjacentBombs()));
            boardArray[selectX][selectY].SetIsRevealed(true);

            if(isFirstTurn){
                //check neighbours and neighbours of etc and update display
            }
        }
    }
}

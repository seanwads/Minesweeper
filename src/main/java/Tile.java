public class Tile {
    private boolean isBombTile;
    public boolean GetIsBombTile(){return isBombTile;}
    public void setBombTile(boolean bombTile) {isBombTile = bombTile;}

    private int adjacentBombs;
    public int getAdjacentBombs() {return adjacentBombs;}
    public void setAdjacentBombs(int adjacentBombs) {this.adjacentBombs = adjacentBombs;}


}

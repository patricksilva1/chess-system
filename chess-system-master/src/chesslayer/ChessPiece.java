package chesslayer;

public class ChessPiece {

    private Color color;
    private int moveCount;

    public ChessPiece(Color color, int moveCount) {
        this.color = color;
        this.moveCount = moveCount;
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount() {
        this.moveCount = moveCount;
    }

}

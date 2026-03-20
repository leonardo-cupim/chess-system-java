package boardgame;

public class Pierce {

    protected Position position;

    private Board board;

    public Pierce() {
    }

    public Pierce(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

}

package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece() {

	}

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getCollumn()];

	}

	public boolean isThereAnyPossibleMove() {

		boolean[][] matz = possibleMoves();
		for (int i = 0; i < matz.length; i++) {
			for (int j = 0; j < matz.length; j++) {
				if (matz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}

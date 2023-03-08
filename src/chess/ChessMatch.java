package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;

public class ChessMatch {
	
	private Board board;

	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		
		ChessPiece[][] matz = new ChessPiece[board.getRows()][board.getColumns()];  
		
		for (int i=0; i < board.getRows(); i++) {
			for(int j=0; j < board.getColumns(); j++) {
				matz [i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return matz;
	}
	
	private void initialSetup() {
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}

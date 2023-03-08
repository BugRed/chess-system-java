package boardgame;

public class Position {

	private Integer row;
	private Integer collumn;

	public Position() {

	}

	public Position(Integer row, Integer collumn) {
		this.row = row;
		this.collumn = collumn;
	}

	public Integer getRow() {
		return row;
	}

	public Integer getCollumn() {
		return collumn;
	}

	public void setValues(int row, int column) {
		this.row = row;
		this.collumn = column;
	}

	@Override
	public String toString() {
		return row + ", " + collumn;
	}
}

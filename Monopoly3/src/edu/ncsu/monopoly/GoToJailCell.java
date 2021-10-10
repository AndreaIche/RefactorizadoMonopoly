package edu.ncsu.monopoly;

public class GoToJailCell extends Cell {
	
	private boolean available = true;
	public JailCell jail;

	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction(String msg) {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		jail = (JailCell)(GameMaster.instance().getGameBoard().queryCell("Jail"));
		GameMaster.instance().sendToJail(currentPlayer);
		return available;
	}
}

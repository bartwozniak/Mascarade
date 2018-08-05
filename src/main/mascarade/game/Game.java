package mascarade.game;

public class Game {

	private Player[] players;

	public Game(Player... args) {
		players = args;
	}

	public void ExecuteTurn() {
		for (Player p : players) {
			p.MakeAction();
		}
	}
}

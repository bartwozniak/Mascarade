package mascarade.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

class WhenGameIsPlayed {

	@Test
	void PlayersMakeActions() {
		Player p = mock(Player.class);
		Game g = new Game(p);
		g.ExecuteTurn();
		verify(p).MakeAction();
	}
	
	@Test
	void PlayersMakeActionsInTurn() {
		Player p1 = mock(Player.class);
		Player p2 = mock(Player.class);
		
		Game g = new Game(p1, p2);
		g.ExecuteTurn();
		
		InOrder inOrder = inOrder(p1, p2);
		inOrder.verify(p1, times(1)).MakeAction();
		inOrder.verify(p2, times(1)).MakeAction();
	}

}

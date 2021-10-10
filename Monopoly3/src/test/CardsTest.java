package test;

import edu.ncsu.monopoly.Card;
import edu.ncsu.monopoly.GameBoardCCGainMoney;
import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.MockGUI;
import edu.ncsu.monopoly.MoneyCard;
import junit.framework.TestCase;

public class CardsTest extends TestCase {
    Card ccCard, chanceCard;
    
    GameMaster gameMaster;

    protected void setUp() {
        gameMaster = GameMaster.instance();
        gameMaster.setGameBoard(new GameBoardCCGainMoney());
        gameMaster.setNumberOfPlayers(1);
        gameMaster.reset();
        gameMaster.setGUI(new MockGUI());
        ccCard = new MoneyCard("Get 50 dollars", 50, Card.typeCc);
        chanceCard = new MoneyCard("Lose 50 dollars", -50, Card.typeChange);
        gameMaster.getGameBoard().addCard(ccCard);
    }
    
    public void testCardType() {
        Card card = gameMaster.drawCCCard();
        assertEquals(Card.typeCc, ccCard.getCardType());
        card = gameMaster.drawChanceCard();
        assertEquals(Card.typeChange, chanceCard.getCardType());
    }
}

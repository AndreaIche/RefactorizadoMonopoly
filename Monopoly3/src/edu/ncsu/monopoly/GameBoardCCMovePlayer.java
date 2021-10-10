package edu.ncsu.monopoly;


public class GameBoardCCMovePlayer extends GameBoard {
    public GameBoardCCMovePlayer() {
		super();
		PropertyCell blue1 = new PropertyCell();
		PropertyCell blue2 = new PropertyCell();
        IOwnable cc1 = new CardCell(Card.typeCc, "Community Chest 1");
        JailCell jail = new JailCell();
        IOwnable chance1 = new CardCell(Card.typeChange, "Chance 1");
        
        Card ccCard1 = new MovePlayerCard("Blue 1" , Card.typeCc);
        Card ccCard2 = new MovePlayerCard("Blue 2", Card.typeCc);
        blue1.setName("Blue 1");
		blue2.setName("Blue 2");
		
		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		
		blue1.setPrice(100);
		blue2.setPrice(100);
		
		blue1.setRent(10);
		blue2.setRent(10);
		
		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		
		addCard(ccCard1);
		addCard(ccCard2);
		
		addCell(blue1);
		addCell(cc1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}

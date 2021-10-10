package edu.ncsu.monopoly;


public class GameBoardCCJail extends GameBoard {
    
   

	public GameBoardCCJail() {
		super();
		PropertyCell blue1 = new PropertyCell();
		PropertyCell blue2 = new PropertyCell();
        IOwnable cc1 = new CardCell(Card.typeCc, "Community Chest 1");
        JailCell jail = new JailCell();
        IOwnable chance1 = new CardCell(Card.typeChange, "Chance 1");
        
        Card ccCard1 = new JailCard(Card.typeCc);
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
		
		addCell(cc1);
		addCell(blue1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}

package edu.ncsu.monopoly;

public abstract class Card {

    public static int typeChange = 1;
    public static int typeCc = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}

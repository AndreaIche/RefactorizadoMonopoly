package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getProprietary();

	int getPrice();

	boolean playAction(String msg);

	void setName(String name);

	void setProprietary(Player owner);

	String toString();

	boolean isAvailable();

	void setAvailable(boolean available);

}
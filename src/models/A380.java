package models;

public class A380 extends Airplane {
	private static final String modelName = "SAS Boeing A380";
	private static final int seatFirst = 5;
	private static final int seatEconomy = 5;

	public A380() {
		super(modelName, seatFirst, seatEconomy);
	}
}

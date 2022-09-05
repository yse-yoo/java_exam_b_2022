package model;

public interface Calculatable {

	public void calculate();
	public int count();
	public void add(Item item, int amount);
	public int calculateWithoutTaxed();
}

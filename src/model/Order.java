package model;

import java.util.ArrayList;

public class Order implements Calculatable {

	private ArrayList<Item> list = new ArrayList<>();
	private int totalPrice = 0;

	public ArrayList<Item> getList() {
		return list;
	}

	public void setList(ArrayList<Item> list) {
		this.list = list;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public void add(Item item, int amount) {
		for (int i = 0; i < amount; i++) {
			list.add(item);
		}
	}

	@Override
	public void calculate() {
		int price = 0;
		for (Item item : list) {
			price += item.getPrice();
		}
		setTotalPrice(price);
	}

	@Override
	public int count() {
		return list.size();
	}

	@Override
	public int calculateWithoutTaxed() {
		return 0;
	}

	public void pay() {
	}
}

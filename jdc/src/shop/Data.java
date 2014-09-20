package shop;

public class Data {
	// yellow, red, white

	// Quantity on stock
	private int[] plStock = { 5, 7, 3 };

	// Sold quantity
	private int[] plSold = { 2, 3, 2 };

	// Sell price
	private int[] plPrice = { 3, 4, 5 };

	// Sales, the last 7 days
	private int[] last7Days = { 2, 5, 8, 1, 12, 11, 9 };

	public int get7DaysSales(int i) {
		return last7Days[i];
	}

	public int getPlStock(int i) {
		return plStock[i];
	}

	public int getPlSold(int i) {
		return plSold[i];
	}

	public int getPlPrice(int i) {
		return plPrice[i];
	}
}

package shop;

public class Launcher {

	public static void main(String[] args) {
				
		System.out.println("Sell prices");
		System.out.println(sellPrices());
		System.out.println();

		System.out.println("Pcs on stock");
		System.out.println(stockQnty());
		System.out.println();
		
		System.out.println("Last 7 days sales");
		System.out.println(sales7Days());
		System.out.println();
		
		daySalesStats();
	}
	static Data dat = new Data();
	
	static Client cl1 = new Client("John");
	static Client cl2 = new Client("Paul");
	static Client cl3 = new Client("James");
	
	public static String sellPrices() {
		return PColor.YELLOW + " " + dat.getPlPrice(0) + ", " + PColor.RED + " " + dat.getPlPrice(1) + ", "
				+ PColor.WHITE + " " + dat.getPlPrice(2);
	}

	public static String stockQnty() {
		return PColor.YELLOW + " " + dat.getPlStock(0) + ", " + PColor.RED + " " + dat.getPlStock(1) + ", "
				+ PColor.WHITE + " " + dat.getPlStock(2);
	}
	
	public static String sales7Days() {
		return PColor.YELLOW + " " + dat.get7DaysSales(0) + ", " + PColor.RED + " " + dat.get7DaysSales(1) + ", "
		+ PColor.WHITE + " " + dat.get7DaysSales(2) + ", " + PColor.RED + " " + dat.get7DaysSales(3) + ", "
				+ PColor.WHITE + " " + dat.get7DaysSales(4) + ", " + PColor.RED + " " + dat.get7DaysSales(5) + ", "
						+ PColor.WHITE + " " + dat.get7DaysSales(6);
	}
	
	public static void daySalesStats() {
		System.out.println("#1 " + cl1.getName() + " " + PColor.RED + " " + dat.getPlPrice(1) + " 2");
		System.out.println("#2 " + cl2.getName() + " " + PColor.WHITE + " " + dat.getPlPrice(2) + " 1");
		System.out.println("#1 " + cl3.getName() + " " + PColor.YELLOW + " " + dat.getPlPrice(0) + " 3");
	}
	
}

package deposit;

public class Launcher extends Data {

	public static void main(String[] args) {
		Data dat = new Data();
		dat.setMonthlyPayment(500);
		dat.setInterest(12);
		dat.setDreamSum(1000000);

		System.out.println("To collect " + getDreamSum() + " UAH you`ll need " + darkZone() + " years. Good luck...");
	}

	public static int darkZone() {
		double dreamBalance = 0;
		int month = 0;
		while (dreamBalance < getDreamSum()) {
			dreamBalance += getMonthlyPayment() + dreamBalance * ((getInterest() / 12) / 100);
			month++;
		}
		return month / 12;
	}
}

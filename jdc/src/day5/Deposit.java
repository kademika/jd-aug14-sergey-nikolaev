package day5;

public class Deposit {

	public static void main(String[] args) {
		System.out.println(darkZone(500, 12, 1000000));
	}
		public static String darkZone(int monthlyPayment, int interest, int dreamSum) {
			int balance = 0;
			int month = 0;
			while(balance < dreamSum) {
				balance += monthlyPayment + balance * ((interest / 12) / 100);
				month++;
			}
			return month / 12 + " years and " + month % 12 + " months";
		}
}

package deposit;

public class Data {
	private static int monthlyPayment;
	private static int interest;
	private static int dreamSum;
	
	public Data() {
	}

	public static int getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public static int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public static int getDreamSum() {
		return dreamSum;
	}

	public void setDreamSum(int dreamSum) {
		this.dreamSum = dreamSum;
	}
}

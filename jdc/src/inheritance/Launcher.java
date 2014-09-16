package inheritance;

public class Launcher {

	public static void main(String[] args) {
		BT7 t1 = new BT7();
		t1.setColor("white");
		t1.setCrew(2);
		t1.setMaxSpeed(75);

		T34 t2 = new T34();
		t2.setColor("green");
		t2.setCrew(5);
		t2.setMaxSpeed(50);

		Tiger t3 = new Tiger();
		t3.setColor("grey");
		t3.setCrew(6);
		t3.setMaxSpeed(35);

		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	}

}

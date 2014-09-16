package inheritance;

public class Tank {

	private String color;
	private int crew;
	private int maxSpeed;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return this.getColor() + " " + this.getCrew() + " " + this.getMaxSpeed();
	}
	
	public String move() {
		return "The tank is moving";
	}
}

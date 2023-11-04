package q8;

public class Labour implements Emp{
	private double rate;
	private double hours;
	public Labour(double rate, double hours) {
		super();
		this.rate = rate;
		this.hours = hours;
	}
	
	public Labour() {
		// TODO Auto-generated constructor stub
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return hours * rate;
	}
	
	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		return hours > 300 ? 0.05 * getSal(): 0.0;
	}
	
}

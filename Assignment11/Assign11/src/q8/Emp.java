package q8;

public interface Emp {
	
	
	abstract double getSal();
	default double calcIncentives() {
		return 0.0;
		
	}
	static double calcTotalIncome(Emp arr[]) {
		double ans = 0;
		for(Emp e : arr) {
			ans += e.calcIncentives() + e.getSal();
		}
		return 0;
	}
}

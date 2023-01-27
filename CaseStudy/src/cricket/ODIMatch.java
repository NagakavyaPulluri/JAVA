package cricket;

public class ODIMatch extends Match{

	public ODIMatch(int currentScore, float currentOver, int targetScore) {
		super(currentScore, currentOver, targetScore);
	}

	@Override
	public float calculateRunrate() {
		return (float) ((getTargetScore()-getCurrentScore())/(50.0-getCurrentOver()));
	}

	@Override
	public int calculateBalls() {
		return (int)(50.0-getCurrentOver())*6;
	}

	@Override
	public void display(double reqRunRate, int balls) {
		System.out.println("Requirements:\n");
		System.out.println("Need "+(getTargetScore()-getCurrentScore())+" Runs in "+calculateBalls()+" balls");
		System.out.printf("Required Run Rate - %.2f",calculateRunrate());
	}

}
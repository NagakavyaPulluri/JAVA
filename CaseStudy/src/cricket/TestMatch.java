package cricket;

public class TestMatch extends Match {

	public TestMatch(int currentScore, float currentOver, int targetScore) {
		super(currentScore, currentOver, targetScore);
	}

	@Override
	public float calculateRunrate() {
		return (float) ((getTargetScore()-getCurrentScore())/(90.0-getCurrentOver()));
	}

	@Override
	public int calculateBalls() {
		return (int)(90.0-getCurrentOver())*6;
	}

	@Override
	public void display(double reqRunRate, int balls) {
		System.out.println("Requirements:\n");
		System.out.println("Need "+(getTargetScore()-getCurrentScore())+" Runs in "+calculateBalls()+" balls");
		System.out.printf("Required Run Rate - %.2f",calculateRunrate());
	}

}
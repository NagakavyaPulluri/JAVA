package cricket;

public abstract class Match {
 private int currentScore;
 private float currentOver;
 private int targetScore;
public int getCurrentScore() {
	return currentScore;
}
public void setCurrentScore(int currentScore) {
	this.currentScore = currentScore;
}
public float getCurrentOver() {
	return currentOver;
}
public void setCurrentOver(float currentOver) {
	this.currentOver = currentOver;
}
public int getTargetScore() {
	return targetScore;
}
public void setTargetScore(int targetScore) {
	this.targetScore = targetScore;
}
public Match(int currentScore, float currentOver, int targetScore) {
	super();
	this.currentScore = currentScore;
	this.currentOver = currentOver;
	this.targetScore = targetScore;
}
 public abstract float calculateRunrate();
 public abstract int calculateBalls();
 public void display(double reqRunRate, int balls) {
	 
 }
}

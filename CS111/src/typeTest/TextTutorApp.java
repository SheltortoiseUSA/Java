package typeTest;

public class TextTutorApp {

	public static void main(String[] args) {
		Stopwatch s1 = new Stopwatch();
		TextTutorEngine q1 = new TextTutorEngine("Alpha Kanein is awesome.");
		
		s1.startTimer();
		String input = q1.question();
		s1.stopTimer();
		int points1 = q1.addPoints(input);
		int mult1 = pointMultiplier(s1, points1);
		long time1 = s1.getExecutionTime();
		s1.resetTimer();
		
		s1.startTimer();
		String input2 = q1.question();
		s1.stopTimer();
		int points2 = q1.addPoints(input2);
		int mult2 = pointMultiplier(s1, points2);
		long time2 = s1.getExecutionTime();
		s1.resetTimer();
		
		
		s1.startTimer();
		String input3 = q1.question();
		s1.stopTimer();
		int points3 = q1.addPoints(input3);
		int mult3 = pointMultiplier(s1, points3);
		long time3 = s1.getExecutionTime();
		
		long bestTime = bestTime(time1, time2, time3);
		int totalPoints = ((points1 * mult1) + (points2 * mult2) + (points3 * mult3));
		System.out.println("Your best time was " + bestTime + " nanoseconds.");
		System.out.println("You got " + totalPoints + " points.");	
	}
	public static long bestTime(long t1, long t2, long t3) {
		if(t1 > t2 && t1 > t3) {
			return t1;
		}
		else if(t2 > t1 && t2 > t3) {
			return t2;
		}
		else {
			return t3;
		}
	}
	public static int pointMultiplier(Stopwatch s1, int points) {
		int pointMultiplier = 1;
		
		if(s1.getExecutionTime() < 1000000000) {
			pointMultiplier = 3;
		}	
		else if(s1.getExecutionTime() < 2000000000) {
			pointMultiplier = 2;
		}	
		else {
			pointMultiplier = 1;
		}
		return pointMultiplier;
	}
}
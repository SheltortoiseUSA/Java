package typeTest;

import java.util.Timer;
import java.util.TimerTask;

public class Stopwatch { 
	 private long executionTime;
	 
	 public Stopwatch() {
		 this.executionTime = 0;
	 }
	 public void startTimer() {
		 this.executionTime = System.nanoTime();
	 }
	 public void stopTimer() {
		 this.executionTime = System.nanoTime() - executionTime;
	 }
	 public void resetTimer() {
		 this.executionTime = 0;
	 }
	 public long getExecutionTime() {
		 return executionTime;
	 }
	 public String toString(String str) {
		 str = "" + this.executionTime;
		 
		 return str;
	 }
}
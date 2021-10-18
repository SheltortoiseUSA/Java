package homework;

public class LightSwitches {

	public static void main(String[] args) {
		boolean[] lightSwitches = new boolean[100];
		
		for(int i = 0; i < lightSwitches.length; i++) {
			if(i % 4 == 0 && i != 0) {
				lightSwitches[i] = !lightSwitches[i];
			}
			else if(i % 9 == 0 && i != 0) {
				lightSwitches[i] = !lightSwitches[i];
			}
			else if(i % 10 == 0 && i != 0) {
				lightSwitches[i] = !lightSwitches[i];
			}
		}
		for(boolean q : lightSwitches) {
			System.out.println(q);
		}
	}
}
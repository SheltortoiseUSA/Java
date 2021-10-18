package homework;

public class CylinderVolume {

	public static void main(String[] args) {
		double r = 1;
		double p = 3.14;
		double h = 10;
		
		double v = calculateVolume(r, p, h);
		
		System.out.println(v);
	}		
	private static double calculateVolume(double r, double p, double h) {
		return (p * (r * r) * h);
	}
}
package StartPoint;

public class LCM {

	public static void main(String[] args) {
		int divisor = 36;
		int divident = 60;
		int a = divisor;
		int b = divident;
		int lcm = 0;
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		lcm = (a * b) / divisor;
		System.out.println(lcm);
	}
}

package StartPoint;

public class ArmstrongNumber {

	public static void main(String[] args) {
		isArmstrong(153);
	}

	public static int CountDigit(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	public static void isArmstrong(int n) {
		int d = CountDigit(n);
		int sum = 0;
		int p = n;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + (int) Math.pow(rem, d);
			n /= 10;
		}
		if (sum == p) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not a armstrong number");
		}
	}
}

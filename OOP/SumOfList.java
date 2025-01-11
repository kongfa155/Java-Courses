package lab1;

public class SumOfList {
	public static void main(String[] args) {
		float sum = 0f, f, max = Float.MIN_VALUE;
		for (String e : args) {
			try {
				f = Float.parseFloat(e);
			} catch (Exception e1) {
				f = 0;
			}
			max = max > f ? max : f;
			sum += f;
		}
		System.out.println("Max = " + max);
		System.out.println("Sum = " + sum);
	}
}

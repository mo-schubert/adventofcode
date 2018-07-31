/**
 * 
 */
package day01;

/**
 * @author MOS
 *
 */
public class AlgorithmForDay01 {

	private int sum;

	public AlgorithmForDay01() {
		this.sum = 0;
	}

	public int runAlgorithm(String digits) {
		if (digits.length() < 2) {
			return 0;
		}

		int lastDigit = Integer.parseInt(digits.substring(digits.length() - 1,
				digits.length()));

		// start with last digit because the list is circular
		recursive(lastDigit, digits);

		return sum;
	}

	private void recursive(int priorDigit, String digits) {
		if (digits.length() == 0) {
			return;
		}

		int currentDigit = Integer.parseInt(digits.substring(0, 1));

		if (currentDigit == priorDigit) {
			sum += priorDigit;
		}

		String newDigits = digits.substring(1, digits.length());
		recursive(currentDigit, newDigits);

		return;
	}
}

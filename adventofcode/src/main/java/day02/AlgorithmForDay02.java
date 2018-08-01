/**
 * 
 */
package day02;

/**
 * 
 * The spreadsheet consists of rows of apparently-random numbers. To make sure
 * the recovery process is on the right track, they need you to calculate the
 * spreadsheet's checksum. For each row, determine the difference between the
 * largest value and the smallest value; the checksum is the sum of all of these
 * differences.
 * 
 * @author MOS
 *
 */
public class AlgorithmForDay02 {

	public int runAlgorithm(String[] spreadsheet) {

		int sum = 0;

		for (String row : spreadsheet) {
			sum += calculateChecksum(row);
		}
		return sum;
	}

	private int calculateChecksum(String row) {

		int min = 9;
		int max = 0;

		int currentDigit;

		for (int index = 0; index < row.length(); index++) {
			currentDigit = Integer.parseInt(row.substring(index, index + 1));
			if (currentDigit < min) {
				min = currentDigit;
			}
			if (currentDigit > max) {
				max = currentDigit;
			}
		}

		return max - min;
	}

}

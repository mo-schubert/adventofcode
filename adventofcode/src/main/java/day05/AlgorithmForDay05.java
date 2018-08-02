/**
 * 
 */
package day05;

/**
 * @author MOS
 *
 */
public class AlgorithmForDay05 {

	public int runAlgorithm(String instructions) {
		
		int steps = 0;
		int currentIndex = 0;
		int newIndex;
		Integer[] instructionsAsIntArray = transformInstructionsToIntegerArray(instructions);

		// perform instructions
		while (true) {

			if (currentIndex >= instructionsAsIntArray.length) {
				return steps;
			}

			newIndex = currentIndex + instructionsAsIntArray[currentIndex];
			instructionsAsIntArray[currentIndex]++;
			currentIndex = newIndex;

			steps++;
		}
	}

	private Integer[] transformInstructionsToIntegerArray(String instructions) {
		String[] instructionsAsStringArray = instructions.split(" ");

		Integer[] instructionsAsIntArray = new Integer[instructionsAsStringArray.length];
		int counter = 0;
		
		for (String instructionAsString : instructionsAsStringArray) {
			instructionsAsIntArray[counter++] = Integer
					.parseInt(instructionAsString);
		}
		
		return instructionsAsIntArray;
	}
}

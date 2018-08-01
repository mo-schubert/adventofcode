/**
 * 
 */
package day03;

/**
 * Each square on the grid is allocated in a spiral pattern starting at a
 * location marked 1 and then counting up while spiraling outward.
 * 
 * While this is very space-efficient (no squares are skipped), requested data
 * must be carried back to square 1 (the location of the only access port for
 * this memory system) by programs that can only move up, down, left, or right.
 * They always take the shortest path: the Manhattan Distance between the
 * location of the data and square 1.
 * 
 * @author MOS
 *
 */
public class AlgorithmForDay03 {

	public int runAlgorithm(int number) {
		int numberOfSteps = 0;

		int numberOfCircles = calculateNumberOfCircles(number);
		numberOfSteps += numberOfCircles;
		numberOfSteps += calculateAdditionalSteps(number, numberOfCircles);

		return numberOfSteps;
	}

	private int calculateAdditionalSteps(int number, int circle) {
		int steps;
		
		int quater1 = (circle * 2 - 1) * (circle * 2 - 1) + circle;
		int quater2 = quater1 + circle * 2;
		int quater3 = quater1 + circle * 4;
		int quater4 = quater1 + circle * 6;

		if (number < quater1) {
			steps = quater1 - number;
		} else if (number < quater2) {
			steps = number - quater1;
		} else if (number < quater3) {
			steps = number - quater2;
		} else if (number < quater4) {
			steps = number - quater3;
		} else {
			steps = number - quater4;
		}
		
		return steps;
	}

	private int calculateNumberOfCircles(int number) {
		int squareIndex = 1;
		int circleCounter = 0;

		while (number > squareIndex * squareIndex) {
			circleCounter++;
			squareIndex += 2;
		}

		return circleCounter;
	}

}

/**
 * 
 */
package day02;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * [5 1 9 5] [7 5 3] [2 4 6 8] The first row's largest and smallest values are 9
 * and 1, and their difference is 8. The second row's largest and smallest
 * values are 7 and 3, and their difference is 4. The third row's difference is
 * 6. In this example, the spreadsheet's checksum would be 8 + 4 + 6 = 18.
 * 
 * @author MOS
 *
 */
public class TestForDay02 {
	private AlgorithmForDay02 algorithm;

	@Before
	public void setUp() throws Exception {
		this.algorithm = new AlgorithmForDay02();
	}

	@Test
	public void testSimpleInput_1() {
		String[] spreadsheet = new String[1];
		spreadsheet[0] = "5195";
		
		assertEquals(8, algorithm.runAlgorithm(spreadsheet));
	}

	@Test
	public void testSimpleInput_2() {
		String[] spreadsheet = new String[1];
		spreadsheet[0] = "753";

		assertEquals(4, algorithm.runAlgorithm(spreadsheet));
	}

	@Test
	public void testSimpleInput_3() {
		String[] spreadsheet = new String[1];
		spreadsheet[0] = "2468";

		assertEquals(6, algorithm.runAlgorithm(spreadsheet));
	}

	@Test
	public void testComplexInput_1() {
		String[] spreadsheet = new String[3];
		spreadsheet[0] = "5195";
		spreadsheet[1] = "753";
		spreadsheet[2] = "2468";

		assertEquals(18, algorithm.runAlgorithm(spreadsheet));
	}
}

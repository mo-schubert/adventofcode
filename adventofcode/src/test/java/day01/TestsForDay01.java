/**
 * 
 */
package day01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author MOS
 * 
 * 1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
 * 1111 produces 4 because each digit (all 1) matches the next.
 * 1234 produces 0 because no digit matches the next.
 * 91212129 produces 9 because the only digit that matches the next one is the last digit, 9.
 *
 */
public class TestsForDay01 {

	private AlgorithmForDay01 algorithm;
	
	@Before
	public void setUp() throws Exception {
		this.algorithm = new AlgorithmForDay01();
	}
	
	@Test
	public void test1122() {
		assertEquals(3, algorithm.runAlgorithm("1122"));
	}
	
	@Test
	public void test1111() {
		assertEquals(4, algorithm.runAlgorithm("1111"));
	}
	
	@Test
	public void test1234() {
		assertEquals(0, algorithm.runAlgorithm("1234"));
	}

	@Test
	public void test91212129() {
		assertEquals(9, algorithm.runAlgorithm("91212129"));
	}

	@Test
	public void test11() {
		assertEquals(2, algorithm.runAlgorithm("11"));
	}

	@Test
	public void test1() {
		assertEquals(0, algorithm.runAlgorithm("1"));
	}

	@Test
	public void testEmptyString() {
		assertEquals(0, algorithm.runAlgorithm(""));
	}

}

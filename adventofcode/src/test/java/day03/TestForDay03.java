/**
 * 
 */
package day03;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * For example:
 * Data from square 1 is carried 0 steps, since it's at the access port. Data
 * from square 12 is carried 3 steps, such as: down, left, left. Data from
 * square 23 is carried only 2 steps: up twice. Data from square 1024 must be
 * carried 31 steps.
 * 
 * @author MOS
 *
 */
public class TestForDay03 {
	private AlgorithmForDay03 algorithm;

	@Before
	public void setUp() throws Exception {
		this.algorithm = new AlgorithmForDay03();
	}

	@Test
	public void test1() {
		assertEquals(0, algorithm.runAlgorithm(1));
	}

	@Test
	public void test10() {
		assertEquals(3, algorithm.runAlgorithm(10));
	}

	@Test
	public void test12() {
		assertEquals(3, algorithm.runAlgorithm(12));
	}

	@Test
	public void test17() {
		assertEquals(4, algorithm.runAlgorithm(17));
	}

	@Test
	public void test23() {
		assertEquals(2, algorithm.runAlgorithm(23));
	}

	@Test
	public void test24() {
		assertEquals(3, algorithm.runAlgorithm(24));
	}

	@Test
	public void test25() {
		assertEquals(4, algorithm.runAlgorithm(25));
	}

	@Test
	public void test26() {
		assertEquals(5, algorithm.runAlgorithm(26));
	}

	@Test
	public void test42() {
		assertEquals(5, algorithm.runAlgorithm(42));
	}

	@Test
	public void test46() {
		assertEquals(3, algorithm.runAlgorithm(46));
	}

	@Test
	public void test1024() {
		assertEquals(31, algorithm.runAlgorithm(1024));
	}
}

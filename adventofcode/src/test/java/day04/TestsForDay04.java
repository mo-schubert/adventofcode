/**
 * 
 */
package day04;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * aa bb cc dd ee is valid.
 * 
 * aa bb cc dd aa is not valid - the word aa appears more than once.
 * 
 * aa bb cc dd aaa is valid - aa and aaa count as different words.
 * 
 * @author MOS
 *
 */
public class TestsForDay04 {
	private AlgorithmForDay04 algorithm;

	@Before
	public void setUp() throws Exception {
		this.algorithm = new AlgorithmForDay04();
	}

	@Test
	public void testValid1() {
		assertEquals(true, algorithm.runAlgorithm("aa bb cc dd ee"));
	}

	@Test
	public void testValid2() {
		assertEquals(true, algorithm.runAlgorithm("aa bb cc dd aaa"));
	}

	@Test
	public void testValid3() {
		assertEquals(true, algorithm.runAlgorithm("aa bb cc dd aaa b c d"));
	}

	@Test
	public void testInvalid1() {
		assertEquals(false, algorithm.runAlgorithm("aa bb cc dd aa"));
	}

	@Test
	public void testInvalid2() {
		assertEquals(false, algorithm.runAlgorithm("aa bb cc dd aaa bb dd"));
	}

	@Test
	public void testInvalid3() {
		assertEquals(false, algorithm.runAlgorithm("aa bb cc dd cc a"));
	}
}

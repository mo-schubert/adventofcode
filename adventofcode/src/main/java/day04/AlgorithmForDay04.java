/**
 * 
 */
package day04;

/**
 * A new system policy has been put in place that requires all accounts to use a
 * passphrase instead of simply a password. A passphrase consists of a series of
 * words (lowercase letters) separated by spaces.
 * 
 * To ensure security, a valid passphrase must contain no duplicate words.
 * 
 * @author MOS
 *
 */
public class AlgorithmForDay04 {

	/**
	 * Algorithm returns true, if the phrase is valid
	 */
	public boolean runAlgorithm(String phrase) {
		String[] phraseElements = phrase.split(" ");
		boolean isFirstElement = true;

		Trie.createTrie();

		for (String element : phraseElements) {
			if (isFirstElement) {
				Trie.insert(element);
				isFirstElement = false;
				continue;
			}

			// Trie.search returns true if key presents in trie, else false
			if (Trie.search(element)) {
				return false;
			}
			Trie.insert(element);
		}

		return true;
	}

}

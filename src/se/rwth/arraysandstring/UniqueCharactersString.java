package se.rwth.arraysandstring;

/**
 * Checks, whether a string contains only unique characters without additional
 * data structures.
 * User: administrator
 * Date: 10/18/12
 * Time: 1:18 PM
 */
public class UniqueCharactersString {
    public boolean isOnlyUniqueCharacters(String test) {
        // Assumption: char with domain 0..255
        // use bucket sort. Allocate the array with frequencies initialized to
        // zero.
        short []frequencies = new short[255];

        // ALGO:
        // Each time a character is processed the corresponding bucket is
        // incremented. If a bucket contains the a value already, the algo
        // terminates with false.
        for (int c = 0; c < test.length(); ++c) {

            if (frequencies[test.charAt(c)] == 0) {
                frequencies[test.charAt(c)] = 1;
            } else {
                return false;
            }
        }
        // No multiple symbols were found
        return true;
    }
}

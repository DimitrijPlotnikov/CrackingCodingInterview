package se.rwth.arraysandstring;

/**
 * Implements the test to remove duplicate symbols from a the given string.
 * User: administrator
 * Date: 10/18/12
 * Time: 2:58 PM
 */
public class RemoveDuplicates {
    /**
     * Design an algorithm and write code to remove the duplicate characters in
     * a string without using any additional buffer. NOTE: One or two additional
     * variables are fine. An extra copy of the array is not.
     *
     * @param string String where the duplicates has to be removed.
     * @return String without duplicate symbols.
     */
    public String removeDuplicates(String string) {

        for (int c1 = 0; c1 < string.length(); ++c1) {
            int c2 = c1 + 1;
            for (c2 = c1 + 1; c2 < string.length(); ++c2) {
                if (string.charAt(c1) == string.charAt(c2)) {
                    break;
                }
            }
        }
        return string;
    }

}

package se.rwth.arraysandstring;

/**
 * Invokes all task methods and prints results.
 * User: administrator
 * Date: 10/18/12
 * Time: 1:03 PM
 */
public class Manager {
    public static void main(String []args) {
        Manager manager = new Manager();
        System.out.println("BEGIN...............");
        manager.testUniqueCharactersString();
        System.out.println("END.................");
    }

    /**
     *  Invokes the unique
     */
    private void testUniqueCharactersString() {
        String unique = "abcdefg";
        String notUnique = "abcdefga";
        UniqueCharactersString tester = new UniqueCharactersString();

        if (tester.isOnlyUniqueCharacters(unique)) {
            System.out.println("The string " + unique + " contains only " +
                    "unique characters.");
        }  else {
            System.out.println("Error: " + unique + " has to be true.");
        }

        if (!tester.isOnlyUniqueCharacters(notUnique)) {
            System.out.println("The string " + notUnique + " contains a " +
                    "non unique characters.");
        }  else {
            System.out.println("Error: " + notUnique + " has to be false.");
        }

    }

}

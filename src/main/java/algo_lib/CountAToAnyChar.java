package algo_lib;

public class CountAToAnyChar {

    // ASCII 65~ 90 (A~ Z)
    public int countAToAnyUpper(char anyUpperChar) {
        char A = 'A'; // 65

        // if over than N(77)
        if (anyUpperChar >= 78) {
            return 91 - anyUpperChar;
        }

        return anyUpperChar - A;
    }

    public int countAnyToAny(char inputChar, char anyCharacter) {
        return 0;
    }

}

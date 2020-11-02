package unpair;

public class ZeroOneStrings {

    public static int getMinimumPairs(String binaryString) {
        if (!binaryString.contains("0") && !binaryString.contains("1")) {
            return 0;
        }
        int count = 0;
        char begin = binaryString.charAt(0);
        if (begin == '?') {
            int index = getFirstNotEqualsQuestionMark(binaryString);
            if (index % 2 == 0) {
                begin = binaryString.charAt(index);
            } else {
                if (binaryString.charAt(index) == '0') {
                    begin = '1';
                } else {
                    begin = '0';
                }
            }
        }
        for (int i = 1; i < binaryString.length(); i++) {
            char currentChar = binaryString.charAt(i);
            if (currentChar == '?') {
                if (begin == '1') {
                    begin = '0';
                    continue;
                } else {
                    begin = '1';
                    continue;
                }
            }
            if (currentChar == begin) {
                count++;
            } else {
                begin = currentChar;
            }
        }
        return count;
    }

    private static int getFirstNotEqualsQuestionMark(String binaryString) {
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '?') {
                return i;
            }
        }
        return -1;
    }
}
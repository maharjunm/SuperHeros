package oracle;

public class BowlingProblem {
    public static void main(String[] args) {
        String string = "XXXXXXXXXXXX";
        System.out.println(getScore(string));
    }

    private static int getScore(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i < string.length() - 2) {
                if (Character.isDigit(string.charAt(i))) {
                    sum += string.charAt(i) - 48;
                } else if (string.charAt(i) == '-') {
                    sum += 0;
                } else if (string.charAt(i) == '/') {
                    sum += remainingValueForSpare(string.charAt(i - 1)) + getValueForChar(string.charAt(i + 1));
                } else {
                    sum += 10 + getValueForChar(string.charAt(i + 1));
                    if (string.charAt(i + 2) == '/') {
                        sum += remainingValueForSpare(string.charAt(i + 1));
                    } else {
                        sum += getValueForChar(string.charAt(i + 2));
                    }
                }
            } else {
                if(string.charAt(i) =='/') {
                    sum += remainingValueForSpare(string.charAt(i-1));
                }
                sum += getValueForChar(string.charAt(i));
            }

        }

        return  sum;
    }

    private static int remainingValueForSpare(char ch) {
        if (ch == '-')
            return 10;
        return 10 - (ch - 48);
    }

    private static int getValueForChar(char ch) {
        switch (ch) {
            case '-':
                return 0;
            case 'X':
                return 10;
            default:
                return (ch - 48);
        }
    }
}

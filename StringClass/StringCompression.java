package StringClass;

public class StringCompression {

    public static String compress(String s) {

        if (s.length() == 0)
            return "";

        String result = "";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = result + s.charAt(i) + count;
                count = 1;
            }
        }
        result = result + s.charAt(s.length() - 1) + count;

        return result;
    }

    public static void main(String[] args) {
        String s = "aaabbccccdaa";
        System.out.println(compress(s));
    }
}


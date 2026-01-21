package StringClass;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {

        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);

            if (index == -1)
                return false;

            s2 = s2.substring(0, index) + s2.substring(index + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        if (isAnagram(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}


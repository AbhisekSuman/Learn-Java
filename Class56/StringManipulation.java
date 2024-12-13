package Class56;

public class StringManipulation {
    public String stringReverse(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
        return s;
    }

    public String strinReverseWithSpace(String str) {
        char[] arr1 = str.toCharArray();
        char[] arr2 = new char[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == ' ') {
                arr2[i] = arr1[i];
            }
        }

        for (int i = 0, j = arr2.length - 1; i < arr1.length; i++) {
            if (arr1[j] == ' ') {
                j--;
            }
            if (arr2[i] == ' ') {
                continue;
            }
            arr2[i] = arr1[j];
            j--;
        }

        str = new String(arr2);
        return str;
    }

    public String wordReverseInString(String str) {
        String[] strings = str.split("");
        System.out.println(strings[0]);
        str = "";
        for (int i = 0; i < strings.length; i++) {
            strings[i] = stringReverse(strings[i]);
            str = str + strings[i];
        }
        return str;
    }

    public boolean rotationCheck(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String str = s1 + s2;
        return str.contains(s2);
    }

    public void printSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String subString = str.substring(i, j);
                System.out.println(subString);
            }
        }
    }


}

import java.util.ArrayList;
import java.util.Scanner;

public class FifthClass {

    public static void main(String[] args) {
//        What we Learn
//          HACKERRANK ->
        /*
            - how to practise code in Hackerrank
        */

//**************************        Probably Question   *********************************************
    /*


     */


//*********************************        Programme                 ********************************************

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        ArrayList<String> arrayList = new ArrayList<String>();

        String s1 = "";


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '!' ||s.charAt(i) == ',' ||s.charAt(i) == '?' || s.charAt(i) == '.' || s.charAt(i) == '_' || s.charAt(i) == '\'' ||s.charAt(i) == '@' ) {
                if (!s1.isEmpty()) {
                    arrayList.add(s1);
                    s1 = "";
                }

            }
            else {
                s1 = s1 + s.charAt(i);
            }
        }

        if (!s1.isEmpty()) {
            arrayList.add(s1);
        }

        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        scan.close();

//*******************************       Assignment      **************************************************

       /*

         */
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b =b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] charsOfA = new int[26];
        int[] charsOfB = new int[26];

        for (int i = 0; i < a.length(); i++) {

            charsOfA[a.charAt(i) - 'a']++;
            charsOfB[b.charAt(i) - 'a']++;
        }

        System.out.println();

        for (int i = 0; i < 26; i++) {
            System.out.print(charsOfA[i]);
        }

        System.out.println();

        for (int i = 0; i < 26; i++) {
            System.out.print(charsOfB[i]);
        }

        for (int i = 0; i < 26; i++) {
            if (charsOfA[i] != charsOfB[i]) {
                return false;
            }
        }

        return true;
    }

}



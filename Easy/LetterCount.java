package mod1;

import java.util.*;

public class LetterCount
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int[] freq = new int[26];      // frequency of a–z
        char[] firstCase = new char[26]; // store first appearance case for printing

        // Count frequency + record first appearance form
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // convert to lowercase index
            int idx;

            if (ch >= 'A' && ch <= 'Z')
                idx = ch - 'A';
            else if (ch >= 'a' && ch <= 'z')
                idx = ch - 'a';
            else
                continue;

            freq[idx]++;

            // record first appearance case WITHOUT boolean or list
            // check if already stored
            if (firstCase[idx] == 0) {
                firstCase[idx] = ch;
            }
        }

        // Print in order of appearance
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int idx;
            if (ch >= 'A' && ch <= 'Z')
                idx = ch - 'A';
            else if (ch >= 'a' && ch <= 'z')
                idx = ch - 'a';
            else
                continue;

            // check if this is first time printing (manual check, no built-in)
            boolean firstPrint = true;
            for (int j = 0; j < i; j++) {
                char prev = str.charAt(j);

                int prevIdx;
                if (prev >= 'A' && prev <= 'Z')
                    prevIdx = prev - 'A';
                else if (prev >= 'a' && prev <= 'z')
                    prevIdx = prev - 'a';
                else
                    continue;

                if (prevIdx == idx) {
                    firstPrint = false;
                    break;
                }
            }

            if (firstPrint) {
                System.out.print(firstCase[idx] + "=" + freq[idx] + " ");
            }
        }
    }
}

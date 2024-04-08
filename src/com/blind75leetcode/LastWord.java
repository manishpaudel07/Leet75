package Leet75.src.com.blind75leetcode;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
        Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
Constraints:
        1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/
public class LastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lengthOfString = s.length() - 1;
        int result = 0;
        if (lengthOfString == 0) {
            return 1;
        } else {
            for (int i = lengthOfString; lengthOfString >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    return result;
                } else {
                    result++;
                    lengthOfString--;
                }

            }
            return result;
        }
    }
    public static void main(String[] args)
    {
        String  s = "    day";

        LastWord test= new LastWord();
        int result= test.lengthOfLastWord(s);
        System.out.println(result);



    }
}


package Leet75.src.com.blind75leetcode;

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


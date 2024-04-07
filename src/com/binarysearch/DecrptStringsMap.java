package Leet75.src.com.binarysearch;

import java.util.HashMap;
import java.util.Map;

/*You are given a string s formed by digits and '#'.
We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.
The test cases are generated so that a unique mapping will always exist.
Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:
Input: s = "1326#"
Output: "acz"
Constraints:
1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.*/
public class DecrptStringsMap {
    public String freqAlphabets(String s)
    {
        Map<String, Character> decrptStrings= new HashMap<>();

        int k=1;
        for (char ch='a';ch<='z';ch++ )
        {
            if (ch<='i')
            {
                decrptStrings.put(String.valueOf(k++),ch);
            }else {
                decrptStrings.put(String.valueOf((k++)+"#"),ch);
            }
        }
        StringBuilder stringBuilder= new StringBuilder();
        int lengthOfString=s.length()-1;

        while(lengthOfString>=0)
        {
            if (s.charAt(lengthOfString)=='#')
            {
                stringBuilder.append(decrptStrings.get(s.substring(lengthOfString-2,lengthOfString+1)));
                lengthOfString -=3;
            }else {
                stringBuilder.append(decrptStrings.get(s.substring(lengthOfString,lengthOfString+1)));
                lengthOfString-=1;

            }
        }

        return stringBuilder.reverse().toString();
    }
    public static void main(String[] args)
    {
        String  s = "10#11#12";

        DecrptStringsMap test= new DecrptStringsMap();
        test.freqAlphabets(s);
        System.out.println(test.freqAlphabets(s));

    }
}


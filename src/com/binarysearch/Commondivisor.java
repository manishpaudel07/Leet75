package Leet75.src.com.binarysearch;
/*1071. Greatest Common Divisor of Strings
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB
Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
Constraints:
        1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.*/
public class Commondivisor {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int greatesCommonDivisor = greatesCommonDivisor(str1.length(), str2.length());
        return str2.substring(0, greatesCommonDivisor);
    }

    public int greatesCommonDivisor(int a, int b) {
        return (b == 0)? a : greatesCommonDivisor(b, a % b);
    }

    public static void main(String[] args){

        Commondivisor commondivisor=new Commondivisor();
        String str1="ABABAB";
        String str2="ABAB";
        String result=commondivisor.gcdOfStrings(str1,str2);
        System.out.println(result);

    }
}


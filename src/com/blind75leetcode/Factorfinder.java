package Leet75.src.com.blind75leetcode;

import java.util.ArrayList;

public class Factorfinder {
    public int kthFactor(int n, int k) {
        ArrayList list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }

        }
        if (list.size() < k) {
            return -1;
        } else
            return (int) list.get(k - 1);
    }

    public static void main(String[] args) {

        int n=1;
        int k=1;
        Factorfinder factorfinder=new Factorfinder();
        int result=factorfinder.kthFactor(n,k);
        System.out.println(result);

    }
}

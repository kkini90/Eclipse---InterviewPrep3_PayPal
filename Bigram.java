package Paypal;

import java.util.HashSet;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;
    public Bigram(char first, char second) {
        this.first  = first;
        this.second = second;
    }
    public boolean equals(Bigram b) {
        return b.first == first && b.second == second;
    }
    public int hashCode() {
        return 31 * first + second;
    }
    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<Bigram>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));
        System.out.println(s.size());
    }
}
/*
 * /* Given a sequence of numbers, find the monotonically increasing sub-sequences and print their frequencies.
 * e.g. Given 1 2 3 4 1 2 3 6 7 6 7 1 2 3 9, print the following:
 * 1 2 3 4 - 1
 * 1 2 3 - 2
 * 6 7 - 2

 */
*/
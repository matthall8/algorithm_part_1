/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double wordCount = 1;
        String winningWord = "";
        while (!StdIn.isEmpty()) {
            String currentWord = StdIn.readString();
            if (StdRandom.bernoulli(1 / wordCount)) {
                winningWord = currentWord;
            }
            wordCount++;
        }
        StdOut.println(winningWord);
    }
}

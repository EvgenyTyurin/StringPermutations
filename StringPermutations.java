import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Show all string permutations
 * Oct 2019 EvgenyT
 */

public class StringPermutations {

    public static void main(String[] args) {
        // Set with results to avoid duplicates
        Set<String> permutations = new LinkedHashSet<String>();
        // Recursive permutation
        permutation("", "abc", permutations);
        // Show results
        System.out.println(permutations); // abc, acb, bac, bca, cab, cba
    }

    // Recursive permutator: fixing prefix and mutate tail
    static void permutation(String prefix, String str, Set<String> permutations) {
        int n = str.length();
        if (n > 0)
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i),
                str.substring(0, i) + str.substring(i+1, n), permutations);
        else
            permutations.add(prefix);
    }
}

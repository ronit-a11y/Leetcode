import java.util.*;

class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        
        // Step 1: Sort
        Arrays.sort(properties, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; // defense ASC
            }
            return b[0] - a[0]; // attack DESC
        });

        int maxDefense = 0;
        int weak = 0;

        // Step 2: Traverse
        for (int[] p : properties) {
            int defense = p[1];

            if (defense < maxDefense) {
                weak++;
            } else {
                maxDefense = defense;
            }
        }

        return weak;
    }
}
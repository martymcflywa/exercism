class Scrabble {

    String word;

    /**
     * Solved with map and reduce. Very cool!
     * see https://community.oracle.com/docs/DOC-916777
     */

    // Populate this with scores for each letter
    // ie: scores[0] = A's score, scores[1] = B's score, ..., scores[25] = Z's score
    int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

    Scrabble(String word) {
        // Set everything to uppercase, avoid having to handle lowercase chars
        this.word = word.toUpperCase();
    }

    // 'word' is converted to char stream, where each char is mapped to its score, then reduced to a sum.
    int getScore() {
        return word
            .chars()
            .map(letter -> scores[letter - 'A']) // ie: ('A' - 'A' = 0) == (67 - 67 = 0), return scores[0]
            .sum(); // reduce to sum of scores
    }
}

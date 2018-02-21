import java.util.Arrays;

class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return Arrays.stream(phrase.split(" |-"))
            .map(word -> word.substring(0, 1))
            .map(letter -> letter.toUpperCase())
            .reduce("", String::concat);
    }

}

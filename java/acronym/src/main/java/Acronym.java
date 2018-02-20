import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PangramChecker {

    static List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));

    public boolean isPangram(String input) {

        List<String> letters = Arrays.asList(input.toLowerCase().split(""))
            .stream()
            .filter(letter -> letter != " ")
            .collect(Collectors.toList());

        return letters.containsAll(alphabet);
    }
}

import java.util.Arrays;
import java.util.Map;

class RnaTranscription {

    static Map<String, String> rnaMap = Map.of(
        "G", "C",
        "C", "G",
        "T", "A",
        "A", "U"
    );

    String transcribe(String dnaStrand) {
        return Arrays
            .stream(dnaStrand.split(""))
            .map(c -> rnaMap.get(c))
            .reduce("", String::concat);
    }
}

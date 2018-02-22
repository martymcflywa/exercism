import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RaindropConverter {

    Map<Integer, String> factorWords = new HashMap<>() {
		private static final long serialVersionUID = 1L;
        {
            put(3, "Pling");
            put(5, "Plang");
            put(7, "Plong");
        }
    };

    String convert(int number) {
        StringBuilder sb = new StringBuilder();

        for(int factor : getFactors(number))
            if(factorWords.containsKey(factor))
                sb.append(factorWords.get(factor));

        if(sb.length() > 0)
            return sb.toString();

        return String.valueOf(number);
    }

    List<Integer> getFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                factors.add(i);
                if(i != number / i)
                    factors.add(number / i);
            }
        }
        return factors;
    }
}

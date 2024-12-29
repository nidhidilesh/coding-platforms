import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character,Long> mapOfChars = inputString.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(mapOfChars);
    }
}

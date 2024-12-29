import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseDecimals {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}

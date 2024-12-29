import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxThreeMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> listOfMinimumInteger = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());

        System.out.println("List of Minimum Integer = "+listOfMinimumInteger);

        List<Integer> listOfMaximumInteger = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println("List of Maximum Integer = "+listOfMaximumInteger);
    }
}

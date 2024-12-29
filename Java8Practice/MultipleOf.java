import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> divisibleBy = listOfIntegers.stream().filter(x -> (x%5==0)).collect(Collectors.toList());

        System.out.println(divisibleBy);
    }
}

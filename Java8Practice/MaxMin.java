import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max((a, b) -> a-b).get();

        System.out.println(max);

        int min = listOfIntegers.stream().min((a,b) -> a-b).get();

        System.out.println(min);
    }
}

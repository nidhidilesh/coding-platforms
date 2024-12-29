import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println();
        
        List<Integer> list = Arrays.asList(2,4,17,12,45);

        int secondLargest = list.stream().sorted((a, b) -> b-a).skip(1).findFirst().get();

        System.out.println(secondLargest);
    }
}

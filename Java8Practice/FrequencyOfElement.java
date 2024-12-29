import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElement {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        //To find frequency of each element in an array

        Map<String, Long> mapOfStationery = stationeryList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(mapOfStationery);
    }
}

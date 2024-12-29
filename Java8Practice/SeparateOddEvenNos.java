import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SeparateOddEvenNos {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> mapOfNumbers = listOfNumbers.stream().collect(Collectors.partitioningBy(n -> (n%2==0)));

        Set<Entry<Boolean, List<Integer>>> entrySetOfNumbers = mapOfNumbers.entrySet();

        for(Entry<Boolean, List<Integer>> entry : entrySetOfNumbers){
            if(entry.getKey()){
                System.out.println("Even Values");
            }
            else{
                System.out.println("Odd Values");
            }
            List<Integer> list = entry.getValue();

            for(int i : list){
                System.out.println(i);
            }
        }



    }
}

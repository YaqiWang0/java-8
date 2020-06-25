package NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {

        List<Integer> integerList= IntStream.rangeClosed(1, 10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
        return integerList;
    }

    public static int unBoxing(List<Integer> integerList) {
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unBoxing(Arrays.asList(1, 2, 3)));
    }
}

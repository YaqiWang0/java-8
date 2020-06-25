package NumericStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
       int sum =  IntStream.rangeClosed(1, 50).sum();
        OptionalInt max =  IntStream.rangeClosed(1, 50).max();
        OptionalInt min = IntStream.rangeClosed(1, 50).min();
        OptionalDouble average = IntStream.rangeClosed(1, 50).average();

        System.out.println(sum + "," + max.getAsInt() + "," + min.getAsInt() + "," + average.getAsDouble());
    }
}

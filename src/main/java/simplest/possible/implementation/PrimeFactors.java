package simplest.possible.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        if (number == 2)
            return Arrays.asList(2);

        return Collections.emptyList();
    }
}

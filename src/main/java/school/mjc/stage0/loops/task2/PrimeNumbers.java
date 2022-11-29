package school.mjc.stage0.loops.task2;

import java.util.List;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive != 0) {
            int counter = 2;
            List<Integer> primeNumbersTillTen = List.of(2,3,5,7);

            while (counter <= printToInclusive) {
                if ((counter < 10 && primeNumbersTillTen.contains(counter)) ||
                        (counter % 2 != 0 && counter % 3 != 0 && counter % 5 != 0 && counter % 7 != 0)) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}

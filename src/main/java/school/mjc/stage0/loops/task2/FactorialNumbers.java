package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int factorial = 1;
        while (counter <= printToInclusive) {
            factorial = counter == 0 ? 1 : factorial * counter;
            System.out.println(factorial);
            counter++;
        }
    }
}

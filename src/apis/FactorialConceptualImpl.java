package apis;

import java.math.BigInteger;

public class FactorialConceptualImpl
        implements FactorialConceptualAPI {

    @Override
    public FactorialComputationResult factorialOperator(
            FactorialComputationRequest request) {

        BigInteger number = request.getInput();

        if (number.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException(
                "Factorial cannot be negative"
            );
        }

        BigInteger result = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE;
             i.compareTo(number) <= 0;
             i = i.add(BigInteger.ONE)) {

            result = result.multiply(i);
        }

        return new FactorialComputationResult(result);
    }
}
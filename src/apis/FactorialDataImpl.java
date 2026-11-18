package apis;

import java.math.BigInteger;
import java.util.List;

public class FactorialDataImpl implements FactorialData {

    private List<BigInteger> values;

    public FactorialDataImpl(List<BigInteger> values) {
        this.values = values;
    }

    @Override
    public Iterable<BigInteger> getValues() {
        return values;
    }
}
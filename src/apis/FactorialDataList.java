package apis;

import java.math.BigInteger;
import java.util.List;

public class FactorialDataList implements FactorialData {

    private List<BigInteger> values;

    public FactorialDataList(List<BigInteger> values) {
        this.values = values;
    }

    @Override
    public Iterable<BigInteger> getValues() {
        return values;
    }
}
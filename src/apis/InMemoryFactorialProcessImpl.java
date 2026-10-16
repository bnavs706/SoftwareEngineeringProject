package apis;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

public class InMemoryFactorialProcessImpl
        implements FactorialProcessAPI {

	@Override
	public FactorialData readData(InputSource inputSource) {

	    InMemoryInputSource memorySource =
	            (InMemoryInputSource) inputSource;

	    List<BigInteger> numbers = new ArrayList<>();

	    for (Integer number : memorySource.getNumbers()) {
	        numbers.add(BigInteger.valueOf(number));
	    }

	    return new FactorialDataList(numbers);
	}

	@Override
	public void dataStore(
	        OutputDestination outputDestination,
	        FactorialData results) {

	    InMemoryOutputDestination memoryDestination =
	            (InMemoryOutputDestination) outputDestination;

	    for (BigInteger result : results.getValues()) {
	        memoryDestination.getResults().add(result.toString());
	    }
	}
}
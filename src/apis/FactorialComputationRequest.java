package apis;
import java.math.BigInteger;

public class FactorialComputationRequest {

	private BigInteger input;
	
	public BigInteger getInput() {
	    return input;
	}
	public FactorialComputationRequest(BigInteger input) {
		this.input = input;
	}
}

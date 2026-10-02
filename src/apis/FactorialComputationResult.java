package apis;

import java.math.BigInteger;

public class FactorialComputationResult {
	
	private BigInteger result;
	
	public FactorialComputationResult(BigInteger result) {
		this.result = result;
	}
	public BigInteger getResult() {
		return result;
	}
}

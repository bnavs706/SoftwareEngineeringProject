package apis;

public class FactorialNetworkImpl implements FactorialNetworkAPI {
	
	private FactorialConceptualAPI conceptualAPI;
	private FactorialProcessAPI processAPI;

	 public FactorialNetworkImpl(FactorialConceptualAPI conceptualAPI, FactorialProcessAPI processAPI) {
	        this.conceptualAPI = conceptualAPI;
	        this.processAPI = processAPI;
	    }

	@Override
	public FactorialResponse factorialRequest(FactorialRequest request) {
		return null;
	}
}

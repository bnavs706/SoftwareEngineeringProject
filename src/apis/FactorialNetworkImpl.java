package apis;

public class FactorialNetworkImpl implements FactorialNetworkAPI {
	
	private FactorialConceptualAPI conceptualAPI;

	 public FactorialNetworkImpl(FactorialConceptualAPI conceptualAPI) {
	        this.conceptualAPI = conceptualAPI;
	    }

	@Override
	public FactorialResponse factorialRequest(FactorialRequest request) {
		return null;
	}
}

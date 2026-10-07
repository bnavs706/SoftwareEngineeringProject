package apis;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialJobHandler {

    private FactorialProcessAPI processAPI;
    private FactorialConceptualAPI conceptualAPI;

    public FactorialJobHandler(
            FactorialProcessAPI processAPI,
            FactorialConceptualAPI conceptualAPI) {

        this.processAPI = processAPI;
        this.conceptualAPI = conceptualAPI;
    }
    public void handleJob(InputSource source, OutputDestination destination) {
    	
    	FactorialData data = processAPI.readData(source);
    	
    	List<BigInteger> results = new ArrayList<>();
    	for (BigInteger value : data.getValues()) {
    		
    		 FactorialComputationRequest request =
    			        new FactorialComputationRequest(value);
    		 
    		 FactorialComputationResult result =
    			        conceptualAPI.factorialOperator(request);
    		 results.add(result.getResult());
    	}
    	FactorialData outputData = new FactorialDataList(results);

    	processAPI.dataStore(destination, outputData);
    }
    	
}
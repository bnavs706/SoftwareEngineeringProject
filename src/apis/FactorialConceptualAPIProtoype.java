package apis;

import project.annotations.ConceptualAPIPrototype;
import java.math.BigInteger;
public class FactorialConceptualAPIProtoype {

	 @ConceptualAPIPrototype
	 public void prototype(FactorialConceptualAPI api) {
	
		 FactorialComputationRequest request =
				    new FactorialComputationRequest(BigInteger.valueOf(5));
	}
	
}

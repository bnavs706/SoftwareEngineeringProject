package apis;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface FactorialConceptualAPI {

	FactorialComputationResult factorialOperator(
			FactorialComputationRequest request);
	// Give Factorial Operator a request it gives me back a result
}

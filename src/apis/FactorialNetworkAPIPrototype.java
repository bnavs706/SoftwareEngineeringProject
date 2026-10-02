package apis;

import project.annotations.NetworkAPIPrototype;

//demonstrating how to use the code
public class FactorialNetworkAPIPrototype {

	@NetworkAPIPrototype
	public void prototype(FactorialNetworkAPI api) {
	
		FactorialRequest request = new FactorialRequest(
		"input.txt",
		"output.txt",
		"=",
		",",
		false);
		
		
		  FactorialResponse response = api.factorialRequest(request);
	}
}

package apis;

import project.annotations.ProcessAPIPrototype;

public class FactorialProcessAPIPrototype {

	@ProcessAPIPrototype
	public void prototype(FactorialProcessAPI api) {
	
	InputSource source = new InputSource("input.txt");
	
	FactorialData data = api.readData(source);
	
	OutputDestination destination =
			new OutputDestination("output.tx");
	
	api.dataStore(destination, data);
	
	}
}


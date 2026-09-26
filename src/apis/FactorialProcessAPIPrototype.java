package apis;

import project.annotations.ProcessAPIPrototype;

public class FactorialProcessAPIPrototype {

	@ProcessAPIPrototype
	public int[] readData(String inputSource) {
		return new int[] {1, 2, 3};
	}
	
	@ProcessAPIPrototype
	public void dataStore(String outputDestination, int[] results) {
		
	}
}

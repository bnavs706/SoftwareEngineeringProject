package apis;

import project.annotations.ProcessAPI;


@ProcessAPI
public interface FactorialProcessAPI {

	FactorialData readData(InputSource inputSource);
	
	void dataStore(OutputDestination outputDestination, FactorialData results);
}

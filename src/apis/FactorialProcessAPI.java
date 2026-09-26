package apis;

import project.annotations.ProcessAPI;


@ProcessAPI
public interface FactorialProcessAPI {

	int[] readData(String inputSource);
	void dataStore(String outputDestination, int[] results);
}

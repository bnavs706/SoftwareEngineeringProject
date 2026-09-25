package apis;

import project.annotations.NetworkAPIPrototype;


public class FactorialNetworkAPIPrototype {

	@NetworkAPIPrototype
	public String factorialRequest(
	        String inputSource,
	        String outputDestination,
	        String inputResultDelimiter,
	        String resultDelimiter,
	        boolean useDefaultDelimiters) {

		return "Request recieved";
	}
}

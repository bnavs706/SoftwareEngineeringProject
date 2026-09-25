
package apis;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface FactorialNetworkAPI {

		String factorialRequest(String inputSource, String outputDestination,
				 String inputResultDelimiter, String resultDelimiter,
				 boolean useDefaultDelimiters);
}

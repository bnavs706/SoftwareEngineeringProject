
package apis;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface FactorialNetworkAPI {

		FactorialResponse factorialRequest(FactorialRequest request);
		//Retrieving all the things the request asked for
}

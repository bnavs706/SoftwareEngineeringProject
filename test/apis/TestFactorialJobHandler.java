package apis;

import java.math.BigInteger;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class TestFactorialJobHandler {

    @Test
    public void testHandleJob() {

        // Step 1: Create mock dependencies
        FactorialProcessAPI mockProcess =
                mock(FactorialProcessAPI.class);

        FactorialConceptualAPI mockConceptual =
                mock(FactorialConceptualAPI.class);

        // Step 2: Create the real job handler
        FactorialJobHandler handler =
                new FactorialJobHandler(mockProcess, mockConceptual);

        assertNotNull(handler);

        // Step 3: Create fake input data
        FactorialData fakeData = new FactorialDataList(
                List.of(
                        BigInteger.valueOf(3),
                        BigInteger.valueOf(4)
                )
        );

        // Step 4: Create mock input and output
        InputSource mockSource = mock(InputSource.class);

        OutputDestination mockDestination =
                mock(OutputDestination.class);

        // Step 5: Tell Mockito what data to return
        when(mockProcess.readData(mockSource))
                .thenReturn(fakeData);

        // Step 6: Create fake factorial results
        FactorialComputationResult result3 =
                new FactorialComputationResult(
                        BigInteger.valueOf(6)
                );

        FactorialComputationResult result4 =
                new FactorialComputationResult(
                        BigInteger.valueOf(24)
                );

        // Step 7: Configure the conceptual API mock
        when(mockConceptual.factorialOperator(
                org.mockito.ArgumentMatchers.any(
                        FactorialComputationRequest.class)))
                .thenReturn(result3, result4);

        // Step 8: Run the actual job handler
        handler.handleJob(mockSource, mockDestination);

        // Step 9: Verify that dataStore was called
        verify(mockProcess).dataStore(
                org.mockito.ArgumentMatchers.eq(mockDestination),
                org.mockito.ArgumentMatchers.any(FactorialData.class)
        );

        // Step 10: Prepare to capture the stored data
        ArgumentCaptor<FactorialData> dataCaptor =
                ArgumentCaptor.forClass(FactorialData.class);
        verify(mockProcess).dataStore(
                org.mockito.ArgumentMatchers.eq(mockDestination),
                dataCaptor.capture()
        );
        FactorialData storedData = dataCaptor.getValue();

        assertEquals(
                List.of(BigInteger.valueOf(6), BigInteger.valueOf(24)),
                storedData.getValues()
        );

    }
    
}
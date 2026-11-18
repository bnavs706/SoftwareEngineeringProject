package apis;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileFactorialProcessImplTest {
	// Creating a temporary file rather than having an existing .txt file saved somewhere
    @TempDir
    Path tempDir;

    @Test
    public void testReadData() throws IOException {

        Path inputFile = tempDir.resolve("numbers.txt");

        Files.writeString(inputFile, "3\n4\n5\n");
        

        InputSource source = new InputSource(inputFile.toString());

        FileFactorialProcessImpl process = new FileFactorialProcessImpl();
	
        FactorialData data = process.readData(source);     
        assertIterableEquals(
        	    List.of(
        	        BigInteger.valueOf(3),
        	        BigInteger.valueOf(4),
        	        BigInteger.valueOf(5)
        	    ),
        	    data.getValues()
        	);
    }
    
    @Test
    public void testWriteData() throws IOException {


        Path outputFile = tempDir.resolve("results.txt");

        OutputDestination destination =
            new OutputDestination(outputFile.toString());

        FactorialData results = new FactorialDataImpl(
            List.of(
                BigInteger.valueOf(6),
                BigInteger.valueOf(24),
                BigInteger.valueOf(120)
            )
        );

        FileFactorialProcessImpl process =
            new FileFactorialProcessImpl();

        process.dataStore(destination, results);

        String actual = Files.readString(outputFile).trim();

        assertEquals("6,24,120", actual);
        
    }
}
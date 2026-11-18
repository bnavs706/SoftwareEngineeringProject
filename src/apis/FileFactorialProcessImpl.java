package apis;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

public class FileFactorialProcessImpl implements FactorialProcessAPI {

    @Override
    public FactorialData readData(InputSource inputSource) {

        String filename = inputSource.getLocation();

        ArrayList<BigInteger> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                BigInteger number = new BigInteger(line.trim());

                numbers.add(number);
            }

        } catch (FileNotFoundException e) {

            throw new IllegalArgumentException(
                "Cannot find input file: " + filename, e
            );
        }

        return new FactorialDataImpl(numbers);
    }

    @Override
    public void dataStore(OutputDestination outputDestination,
                          FactorialData results) {
    	 String filename = outputDestination.getLocation();

    	    try (PrintWriter writer = new PrintWriter(new File(filename))) {

    	        boolean first = true;

    	        for (BigInteger number : results.getValues()) {

    	            if (!first) {
    	                writer.print(",");
    	            }

    	            writer.print(number);
    	            first = false;
    	        }

    	        writer.println();

    	    } catch (FileNotFoundException e) {
    	        throw new IllegalArgumentException(
    	            "Cannot write output file: " + filename, e
    	        );
    	    }
    }
}
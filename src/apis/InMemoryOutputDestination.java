package apis;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOutputDestination extends OutputDestination {

    private List<String> results;

    public InMemoryOutputDestination() {
        super("memory");
        this.results = new ArrayList<>();
    }

    public List<String> getResults() {
        return results;
    }
}
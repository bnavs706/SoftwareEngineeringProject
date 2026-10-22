package apis;

import java.util.List;

public class InMemoryInputSource extends InputSource {

    private List<Integer> numbers;

    public InMemoryInputSource(List<Integer> numbers) {
        super("memory");
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
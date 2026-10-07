package apis;

public class FactorialRequest {

    private String inputSource;
    // where inputs come from

    private String outputDestination;
    // where outputs go

    private String inputResultDelimiter;
    // separates the original number from its factorial result

    private String resultDelimiter;
    // separates one result from the next

    private boolean useDefaultDelimiters;

    public FactorialRequest(
            String inputSource,
            String outputDestination,
            String inputResultDelimiter,
            String resultDelimiter,
            boolean useDefaultDelimiters) {

        this.inputSource = inputSource;
        this.outputDestination = outputDestination;
        this.inputResultDelimiter = inputResultDelimiter;
        this.resultDelimiter = resultDelimiter;
        this.useDefaultDelimiters = useDefaultDelimiters;
    }
}
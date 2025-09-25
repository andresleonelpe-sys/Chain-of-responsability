public class Request {
    private RequestType type;
    private String description;

    public Request(RequestType type, String description) {
        this.type = type;
        this.description = description;
    }

    public RequestType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}

public interface Handler {
    Handler setNext(Handler nextHandler);

    void handleRequest(Request request);
    default boolean canHeandle(Request request) {
        return false;
    }
    Handler getNext();
}

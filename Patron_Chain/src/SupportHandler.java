public abstract class SupportHandler implements Handler {
   
    protected Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    protected abstract boolean canHandle(Request request);
    protected abstract void processRequest(Request request);

    public abstract void handleRequest(String request){
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }


    public void handleRequest(Request request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for request: " + request.getDescription());
        }

    }

    public Handler getNextHandler() {
        return nextHandler;
    }


    

}

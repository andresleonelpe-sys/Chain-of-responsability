public class DirectorSupport extends SupportHandler {
    public DirectorSupport() {
        super(SupportLevel.DIRECTOR);
    }
    @Override
    protected void handleRequest(SupportRequest request) { 
        System.out.println("Director handling request: " + request.getDescription());
    }
    @Override
    protected String getHandlerName() {
        return "Director";
    }

}

public class ReceptionistSupport extends SupportHandler {
    public ReceptionistSupport() {
        super(SupportLevel.RECEPTIONIST);
    }
    @Override
    protected void handleRequest(SupportRequest request) { 
        System.out.println("Receptionist handling request: " + request.getDescription());
    }
    @Override
    protected string getHandlerName() {
        return "Receptionist";
    }
}
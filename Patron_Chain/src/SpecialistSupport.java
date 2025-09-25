public class SpecialistSupport extends SupportHandler {
    public SpecialistSupport() {
        super(SupportLevel.ESPECIALIST);
    }
    @Override
    protected void handleRequest(SupportRequest request) { 
        System.out.println("Especialist handling request: " + request.getDescription());
    }
    @Override
    protected String getHandlerName() {
        return "Especialist";
    }

}

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NurseSupport extends SupportHandler {
    public NurseSupport() {
        super(SupportLevel.NURSE);
    }
    @Override
    protected void handleRequest(SupportRequest request) { 
        System.out.println("Nurse handling request: " + request.getDescription());
    }
    @Override
    protected String getHandlerName() {
        return "Nurse";
    }
}
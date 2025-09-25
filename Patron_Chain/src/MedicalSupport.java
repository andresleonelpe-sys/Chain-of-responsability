import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MedicalSupport extends SupportHandler {
    public MedicalSupport() {
        super(SupportLevel.MEDICAL);
    }
    @Override
    protected void handleRequest(SupportRequest request) { 
        System.out.println("Medical staff handling request: " + request.getDescription());
    }
    @Override
    protected String getHandlerName() {
        return "Medical Staff";
    }

}

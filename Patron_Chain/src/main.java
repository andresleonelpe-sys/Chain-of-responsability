import handlers.*;
import requests.*;
import enums.*;




public class main {
    public static void main(String[] args) {
        SupportHandler Recepcionist = new ReceptionistSupport();
        SupportHandler Nurse = new NurseSupport();
        SupportHandler Medical = new MedicalSupport();
        SupportHandler Specialist = new SpecialistSupport();
        SupportHandler Director = new DirectorSupport();

        Recepcionist.setNext(Nurse);
        Nurse.setNext(Medical);
        Medical.setNext(Specialist);
        Specialist.setNext(Director);

        Request [] requests = {
            new SupportRequest(SupportLevel.RECEPCIONIST, "Patient needs to check in."),
            new SupportRequest(SupportLevel.NURSE, "Patient needs assistance with mobility."),
            new SupportRequest(SupportLevel.MEDICAL, "Patient requires medication administration."),
            new SupportRequest(SupportLevel.ESPECIALIST, "Patient needs a specialist consultation."),
            new SupportRequest(SupportLevel.DIRECTOR, "Hospital policy review needed.")
        };
        for (int = 0; i < requests.length; i++) {
            System.out.println("\nProcessing request: " + requests[i].getDescription());    
            Recepcionist.processRequest(requests[i]);
        }

        Handler OnlyRecepcionist = new ReceptionistSupport();
        Handler OnlyDirectorirector = new DirectorSupport();
        OnlyRecepcionist.setNext(OnlyDirector);
      
        Request directorRequest = new SupportRequest(SupportLevel.DIRECTOR, "Urgent: Director-level decision required.");
        System.out.println("\nProcessing request: " + directorRequest.getDescription());
        OnlyRecepcionist.processRequest(directorRequest);
    }
}

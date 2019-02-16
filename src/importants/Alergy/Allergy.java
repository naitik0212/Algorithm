package importants.Alergy;

// Design an allergy class.
// What information would you need to gather from a patient and which data types would you use and why?
// Which information would need to be adjusted for the program to be used internationally?


//You have been asked to build a system for entering and displaying the allergies that patients may have.
// The allergy will have its own set of symptoms reactions.
// The allergy will also have a spectrum of severity which the clinician should be aware of,
// and allergies can be reported by the patient or by next of kin..

import java.util.ArrayList;
import java.util.HashMap;

public class Allergy {
    // PatientId
    // Name
    // Allergy Name (Unique)

    public HashMap<String, String> symptoms = new HashMap<>();
    public HashMap<String, String> reactions = new HashMap<>();

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public String allergyName;

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    private String severity;


    public String getSymptoms(String allergyName) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <symptoms.size(); i++) {
            sb.append(" ").append(symptoms.get(allergyName));
        }
        return sb.toString();
    }

    public String getReactions(String allergyName) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <reactions.size(); i++) {
            sb.append(" ").append(reactions.get(allergyName));
        }
        return sb.toString();
    }


    public void setSymptoms(String allergyName, String sym){
        StringBuilder sb = new StringBuilder();

        if(symptoms.containsKey(allergyName)){
            sb.append(symptoms.get(allergyName));
            sb.append(" ");
            sb.append(sym);
            symptoms.put(allergyName, sb.toString());
        }else{
            symptoms.put(allergyName,sym);
        }
    }

    public void setReactions(String allergyName, String react){
        StringBuilder sb = new StringBuilder();

        if(reactions.containsKey(allergyName)){
            sb.append(reactions.get(allergyName));
            sb.append(" ").append(react);
            reactions.put(allergyName, sb.toString());
        }else{
            reactions.put(allergyName,react);
        }
    }
}

package importants.Alergy;

import java.util.ArrayList;
import java.util.List;

public class PatientInfo {

    public static void main(String args[]) {
        Patient pt = new Patient();
        pt.setPatientName("Naitik");


        Allergy al = new Allergy();
        al.setAllergyName("rashes");
        al.setSeverity(Severity.HIGH);
        al.setSymptoms("rashes", "Fever");
        al.setReactions("rashes", "Itching, burns");


        Allergy al1 = new Allergy();
        al1.setAllergyName("sweling");
        al1.setSeverity(Severity.MEDIUM);

        List<Allergy> allergyList = new ArrayList<>();
        allergyList.add(al);
        allergyList.add(al1);
        pt.setAllergies(allergyList);
        System.out.println(patient(pt));

    }

    private static String patient(Patient pt) {
        StringBuilder sb = new StringBuilder();
        List<Allergy> list = pt.getAllergies();
        sb.append(pt.getPatientName());
        for(int i =0; i < list.size(); i++){
            sb.append(" Allergy: ").append(list.get(i).allergyName).append(" ").append("Symptoms:")
                    .append(list.get(i).getSymptoms(list.get(i).allergyName)).append(" ").append("Reactions:")
                    .append(list.get(i).getReactions(list.get(i).allergyName)).append("\n");
        }
        return sb.toString();
    }
}

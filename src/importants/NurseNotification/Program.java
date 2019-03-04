package importants.NurseNotification;

import java.util.ArrayList; import java.util.List;

public class Program { // private List patientList;

    public static void main(String[] args) {

        List<Frequency> freque1 = new ArrayList<Frequency>();
        freque1.add(new Frequency(Frequency.PartoftheDay.Morning));
        freque1.add(new Frequency(Frequency.PartoftheDay.Evening));

        // List<Medicine> medicine = new ArrayList<Medicine>();
        Medicine med1 = new Medicine("Paracetemol", "38g", "For fever");
        med1.setFrequencyList(freque1);

        List<Frequency> freque2 = new ArrayList<Frequency>();
        freque2.add(new Frequency(Frequency.PartoftheDay.Morning));
        freque2.add(new Frequency(Frequency.PartoftheDay.Evening));

        Medicine med2 = new Medicine("Ibuprofen", "38g", "For body pains");
        med2.setFrequencyList(freque2);

        List<Medicine> medicineList = new ArrayList<Medicine>();
        medicineList.add(med1);
        medicineList.add(med2);

        Patient patient1 = new Patient("Deepthi", "For body pains");
        patient1.setMedicineList(medicineList);

        List<Patient> patientList = new ArrayList<Patient>();
        patientList.add(patient1);

        for (Patient patientt : patientList) {
            System.out.println(patientt.getDisease());
            System.out.println(patientt.getName());

            for (Medicine medi : patientt.getMedicineList()) {

                System.out.println(medi.getDetails() + medi.getComposition()
                        + medi.getName());

                for (Frequency freq : medi.getFrequencyList()) {
                    System.out.println(freq.getPart());
                }

            }

        }

    }
}
package importants.NurseNotification;

import importants.Medication.Medication;

import java.util.List;

public class Patient {
    private String name;
    private String disease;
    private List<Medicine> medicineList;
    private Medication medication;


    public Patient() { }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }




    public Patient(String name, String disease) {
        this.setName(name);
        this.setDisease(disease);

    }



    public List<Medicine> getMedicineList() {
        return medicineList;
    }



    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }



    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the disease
     */
    public String getDisease() {
        return disease;
    }

    /**
     * @param disease the disease to set
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }
}


package importants.NurseNotification;

import java.util.List;

public class Medicine {
    private String name;
    private String disease;
    private String composition;
    private String details;
    private List<Frequency> frequencyList;

    public Medicine(String name, String disease, String details) {
        this.name = name;
        this.disease = disease;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<Frequency> getFrequencyList() {
        return frequencyList;
    }

    public void setFrequencyList(List<Frequency> frequencyList) {
        this.frequencyList = frequencyList;
    }


}

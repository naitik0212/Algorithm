package importants.Alergy;

import java.util.ArrayList;

public class Disease {
    private ArrayList<String> diseaseList = new ArrayList<>();

    public ArrayList<String> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<String> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public ArrayList addDisease(String s) {
        this.diseaseList.add(s);
        return diseaseList;
    }

}

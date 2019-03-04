package importants.NurseNotification;

// Medication class such that the nurse must get notified when a person should be given a medicine


import importants.Alergy.Patient;
import importants.Medication.Medication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NurseNotification {

    public static void main(String args[]) throws ParseException {
    Patient pt = new Patient();
    pt.setPatientName("Heidi");
    Date date1 = new Date();
    Date date2 = new Date();
    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        date1 = ft.parse("2018-11-11");
        date2 = ft.parse("2019-2-2");

        Medication m = new Medication("Heidi", date1,date2);



    }

}

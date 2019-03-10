package importants.Medication;
import importants.NurseNotification.Patient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicationDate {

    public static void main(String args[]) throws ParseException {

        // setting the patient with medications, start date and end date.
    Patient pt = new Patient();
    pt.setName("Heidi");
    Date date1;
    Date date2;
    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");

        date1 = ft.parse("2018-11-11");
        date2 = ft.parse("2019-2-2");
        Medication m = new Medication("Heidi", date1,date2);
        pt.setMedication(m);
        System.out.println( "Name : " +pt.getMedication().getName() +
                " Start Date " + pt.getMedication().getStart() +
                " End Date " + pt.getMedication().getEnd());



        // list of medication

        Medication aspirine = new Medication("Aspirine", new Date("01/01/2016"), new Date("01/01/2017"));
        Medication aspirine1 = new Medication("Aspirine1", new Date("01/01/2017"), new Date("01/01/2018"));


        List<Medication> medications = new ArrayList<>();
        medications.add(aspirine);
        medications.add(aspirine1);


        for(Medication i : medications) {
            System.out.println(i.getName() + " " + i.getStart() + " to " + i.getEnd());
        }


    }
}

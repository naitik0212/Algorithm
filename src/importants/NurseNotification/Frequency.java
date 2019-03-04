package importants.NurseNotification;

public class Frequency {
    public enum PartoftheDay{
        Morning, Afternoon, Evening, Night
    }
    public PartoftheDay part;

    public Frequency(PartoftheDay part ) {
        this.part = part;

    }

    public PartoftheDay getPart() {
        return part;
    }

    public void setPart(PartoftheDay part) {
        this.part = part;
    }
}

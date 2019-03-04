package importants.NurseNotification;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface AlarmListener {
    void notify(Frequency.PartoftheDay time, String msg);
}

class Nurse implements AlarmListener {
    private String name;
    private Set<Frequency.PartoftheDay> times = new HashSet<>();

    Nurse(String name) {
        this.name = name;
    }

    // Add times of day that this nurse will be notified
    public void addTime(Frequency.PartoftheDay time) {
        this.times.add(time);
    }

    public void notify(Frequency.PartoftheDay time, String msg) {
        if (times.contains(time)) {
            System.out.println("Nurse " + name + ", you are being notified of event:  " + msg);
        }
    }

    @Override
    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append(name).append(":  scheduled for\n");
        for (Frequency.PartoftheDay time : times) {
            b.append("  ").append(time).append("\n");
        }

        return b.toString();
    }
}

class Scheduler {
    List<AlarmListener> alarmListenerList = new ArrayList<>();

    public void addListener(AlarmListener alarmListener) {
        alarmListenerList.add(alarmListener);
    }

    public void rollCall() {
        System.out.println("Roll call:");
        for (AlarmListener a : alarmListenerList) {
            System.out.println(a.toString());
        }
    }

    public void notifyListeners(Frequency.PartoftheDay time) {
        for (AlarmListener a : alarmListenerList) {
            a.notify(time, time.name());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Nurse alice = new Nurse("Alice");
        alice.addTime(Frequency.PartoftheDay.Morning);
        alice.addTime(Frequency.PartoftheDay.Afternoon);

        Nurse bob = new Nurse("Bob");
        bob.addTime(Frequency.PartoftheDay.Afternoon);
        bob.addTime(Frequency.PartoftheDay.Evening);

        Scheduler scheduler = new Scheduler();
        scheduler.addListener(alice);
        scheduler.addListener(bob);

        // Show who is scheduled to respond to alarms and when
        scheduler.rollCall();

        // Do this if "Morning" has arrived
        System.out.println("Morning now! ----------------");
        scheduler.notifyListeners(Frequency.PartoftheDay.Morning);
        System.out.println("");

        // Do this if "Afternoon" has arrived
        System.out.println("Afternoon now! --------------");
        scheduler.notifyListeners(Frequency.PartoftheDay.Afternoon);
        System.out.println("");

        // Do this if "Evening" has arrived
        System.out.println("Evening now! --------------");
        scheduler.notifyListeners(Frequency.PartoftheDay.Evening);
    }
}

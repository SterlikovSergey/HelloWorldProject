package by.sterlikov.homework.lesson8.task2;

public class TreatmentPlan {

    public String tplan(int tplan) {
        if (tplan == 1) {
            Dentist dentist = new Dentist();
            return dentist.treat();
        } else if (tplan == 2) {
            Surgeon surgeon = new Surgeon();
            return surgeon.treat();
        } else {
            Therapist therapist = new Therapist();
            return therapist.treat();
        }
    }

}

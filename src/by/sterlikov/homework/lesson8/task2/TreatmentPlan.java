package by.sterlikov.homework.lesson8.task2;

public class TreatmentPlan {

    public String Tplan(int Tplan){
        if (Tplan == 1){
            Dentist dentist = new Dentist();
            return dentist.treat();
        } else if (Tplan == 2) {
            Surgeon surgeon = new Surgeon();
            return surgeon.treat();
        } else {
            Therapist therapist = new Therapist();
            return therapist.treat();
        }
    }

}

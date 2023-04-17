package by.sterlikov.homework.lesson8.task2;

public class Patient extends TreatmentPlan{
    private int plan;

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public Patient(int plan) {
        this.plan = plan;
        if (plan == 1){
            TreatmentPlan treatmentPlan = new TreatmentPlan();
            System.out.println(treatmentPlan.Tplan(1));
        } else if (plan == 2){
            TreatmentPlan treatmentPlan = new TreatmentPlan();
            System.out.println(treatmentPlan.Tplan(2));
        } else {
            TreatmentPlan treatmentPlan = new TreatmentPlan();
            System.out.println(treatmentPlan.Tplan(3));
        }
    }

}

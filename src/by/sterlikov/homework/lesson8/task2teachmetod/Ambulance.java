package by.sterlikov.homework.lesson8.task2teachmetod;

public class Ambulance {
    public static void main(String[] args) {
    // 1 создать пацциента
        Patient knowPatient = new Patient("Vasia", 35);
        Patient unknowPatient = new Patient();

        Patient[] patients = getPatients();
        for (Patient i: patients){
            setMedicalPlan(knowPatient);
            Doctor fistDoctor = getDoctorToPacient(knowPatient);
            fistDoctor.heal();
        }
        // 2 прописать план лечения
        setMedicalPlan(knowPatient);
        setMedicalPlan(unknowPatient);
        // 3 выделить доктора
        Doctor fistDoctor = getDoctorToPacient(knowPatient);
        Doctor secondDoctor = getDoctorToPacient(unknowPatient);
        // 4 вылечить
        fistDoctor.heal();
        secondDoctor.heal();
    }
        private static Doctor getDoctorToPacient (Patient pacient){
               if(pacient.getMedicalPlan() ==1) return new Terapist();
               if(pacient.getMedicalPlan() == 2) return new Dentist();
               return new Surgeun();
        }
        private static void setMedicalPlan (Patient patient){
            if (patient.getName() == null) {
                patient.setMedicalPlan(1);
            } else {
                patient.setMedicalPlan(2);
            }
        }

        private static Patient[] getPatients(){
        Patient[] patients = new Patient[2];
        patients[0] = new Patient("Vasia", 35);
        patients[1] = new Patient();
        return new Patient[0];
        }
    }



package com.teachmeskills.lesson8.task_1.doctors.doctors;

import com.teachmeskills.lesson8.task_1.doctors.Doctors;
import com.teachmeskills.lesson8.task_1.patientList.patients.Patient;

/**
 * Therapist Description Class
 */

public class Therapist extends Doctors {
    Patient human = new Patient();
    A_surgeon as = new A_surgeon();
    Dentist den = new Dentist();
    public void treat() {
        System.out.println("Померять температуру");
    }

    public void doctorsChoice(int number){
        if(number == 1){
            human.setDoctor("Хирург");
            as.treat();
        }else if(number == 2){
            human.setDoctor("Дантист");
            den.treat();
        }else{
            human.setDoctor("Терапевт");
            System.out.print("План лечения не назначен отправлен к терапевту: ");
            treat();
        }
    }
}

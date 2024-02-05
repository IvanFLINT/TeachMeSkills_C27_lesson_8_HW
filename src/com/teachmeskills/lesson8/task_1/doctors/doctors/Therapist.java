package com.teachmeskills.lesson8.task_1.doctors.doctors;

import com.teachmeskills.lesson8.task_1.doctors.Doctors;

/**
 * Therapist Description Class
 */

public class Therapist extends Doctors {
    Surgeon as = new Surgeon();
    Dentist den = new Dentist();
    public void treat() {
        System.out.println("Померять температуру");
    }
    public void doctorsChoice(int number){
        if(number == 1){
            as.treat();
        }else if(number == 2){
            den.treat();
        }else{
            treat();
        }
    }
}

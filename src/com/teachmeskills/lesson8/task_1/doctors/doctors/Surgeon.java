package com.teachmeskills.lesson8.task_1.doctors.doctors;

import com.teachmeskills.lesson8.task_1.doctors.Doctors;
import com.teachmeskills.lesson8.task_1.patientList.patients.Patient;

/**
 * Surgeon Description Class
 */
public class Surgeon extends Doctors {
    Patient human = new Patient();

    public void treat() {
        System.out.println("Произвести ампутацию");
    }
}

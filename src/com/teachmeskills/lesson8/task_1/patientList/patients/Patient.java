package com.teachmeskills.lesson8.task_1.patientList.patients;

/**
 * Patient Description Class
 */

public class Patient {

    private int treatmentPlan;
    private String doctor;

    public void setPlan(int id){
        treatmentPlan = id;
    }

    public void setDoctor(String doc){
        doctor = doc;
    }

    public int  getPlan(){
        return treatmentPlan;
    }

    public String getDoctor(){
        return doctor;
    }
}

package com.teachmeskills.lesson8.task_1.runer;

import com.teachmeskills.lesson8.task_1.doctors.doctors.Therapist;
import com.teachmeskills.lesson8.task_1.patientList.patients.Patient;

import java.util.Scanner;

/**
 * This program execution class
 */

public class Runer {
    public static void main(String[] args) {
        Patient human = new Patient();
        Therapist the = new Therapist();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер плана лечения 1-хирург, 2-дантист: ");
        int number = sc.nextInt();
        human.setPlan(number);
        switch (number){
            case 1: human.setDoctor("Хирург"); break;
            case 2: human.setDoctor("Дантист"); break;
            default: human.setDoctor("Терапевт"); break;
        }
        System.out.println("Назначенны план лечения: " + human.getPlan() + " Доктор: " + human.getDoctor());
        the.doctorsChoice(number);
    }

}

package com.company;


import java.util.Locale;

public class Main {


//PROCEDURAL PROGRAMMING
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        //here(in the Main) we call the method and stored it inside an int wage
        int wage = calculateWage(baseSalary,extraHours,hourlyRate);
        System.out.println(wage);
    }
    // methods
    public static int calculateWage(
        int baseSalary,
        int extraHours,
        int hourlyRate
    ){
        return baseSalary + (extraHours * hourlyRate);



    }
}



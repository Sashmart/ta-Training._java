package com.epam.training.student_Sashik_Martirosyan;

public class SumMulty {
    public static void main(String[] args) {
        int mult=1;
        int sum=0;
        for (int i = 0; i < args.length ; i++) {
             sum =sum+Integer.parseInt(args[i]);
             mult=mult*Integer.parseInt(args[i]);

        }System.out.println("mult = "+mult+ " "+"sum ="+sum);
    }
}

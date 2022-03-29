package com.epam.training.student_Sashik_Martirosyan;

public class ReversArgs {
    public static void main(String[] args) {
        for (int i = args.length-1; i >=0 ; i--) {
            for (int j = args[i].length()-1; j >=0 ; j--) {
                System.out.println(args[i].charAt(j));

            }

        }
    }
}

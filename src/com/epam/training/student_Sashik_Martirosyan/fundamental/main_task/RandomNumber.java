package com.epam.training.student_Sashik_Martirosyan;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int max=200;
        int min=100;
        int num=max-min;
        for (int i = 0; i < 5; i++) {
            Random random=new Random();
            int j= random.nextInt(num+1);
            j+=min;
            System.out.println(j);
        }
    }
}

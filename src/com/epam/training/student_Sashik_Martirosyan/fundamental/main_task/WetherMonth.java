package com.epam.training.student_Sashik_Martirosyan;

public class WetherMonth {
    public static void main(String[] args) {
        int month=25;
        if(month==1||month==2||month==12){
            System.out.println("The wether is winter");
        }else if(month==3||month==4||month==5) {
            System.out.println("The wether is spring");
        }else if(month==6||month==7||month==8) {
            System.out.println("The wether is summer");
        }else if(month==9||month==10||month==11) {
            System.out.println("The wether is autumn");
        }else{
            System.out.println("Not wether month");
        }
    }
}

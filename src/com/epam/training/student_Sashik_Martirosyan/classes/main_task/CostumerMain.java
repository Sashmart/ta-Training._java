package com.epam.training.student_Sashik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CostumerMain {
    public static void main(String[] args) {


     List<Costumer> costumerList=new ArrayList<>();
     costumerList.add(new Costumer("Balayan","Surik","Vardani","Goris","25587441",
             "849885"));
     costumerList.add(new Costumer("Balayan","Vardan","Karleni","Goris","25587441",
             "545611"));
     costumerList.add(new Costumer("Mirzoyan","Karen","Karlen","Goris","25587441",
             "215651"));
     costumerList.add(new Costumer("Balayan","Anush","Vladiki","Goris","25587441",
             "545136"));
     costumerList.add(new Costumer("Grigoryan","SuSan","Artusho","Goris","25587441",
             "456516"));
     Collections.sort(costumerList, new Comparator<Costumer>() {
         @Override
         public int compare(Costumer o1, Costumer o2) {
             return o1.getName().compareTo(o2.getName());
         }
     });
        for (Costumer st:costumerList
             ) {
            System.out.println(st);

        }
        System.out.println();

        for (Costumer dt:costumerList) {
            if(Integer.parseInt(dt.getBankNumberOfCount())>216000){
                System.out.println(dt.toString());
            }


        }
    }

    static class Costumer{
        static int ido=0;
        private int id;
        private String surname;
        private String name;
        private String middlename;
        private String address;
        private String numberCard;
        private String bankNumberOfCount;

        Costumer(String surname, String name, String middlename, String address, String numberCard, String bankNumberOfCount) {
            this.id=ido++;
            this.address=address;
            this.surname=surname;
            this.name=name;
            this.middlename=middlename;
            this.numberCard=numberCard;
            this.bankNumberOfCount=bankNumberOfCount;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getBankNumberOfCount() {
            return bankNumberOfCount;
        }

        public void setBankNumberOfCount(String bankNumberOfCount) {
            this.bankNumberOfCount = bankNumberOfCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMiddlename() {
            return middlename;
        }

        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumberCard() {
            return numberCard;
        }

        public void setNumberCard(String numberCard) {
            this.numberCard = numberCard;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Costumer{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", middlename='" + middlename + '\'' +
                    ", address='" + address + '\'' +
                    ", numberCard='" + numberCard + '\'' +
                    ", bankNumberOfCount='" + bankNumberOfCount + '\'' +
                    '}';
        }
    }
}



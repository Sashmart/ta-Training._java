package com.epam.training.student_Sashik;

import java.util.ArrayList;
import java.util.List;

public class AbiturientMain {
    public static void main(String[] args) {
        Abiturient abiturient1=new Abiturient("Vahagn","Xachatryan","Aruri","Goris",
                "37495154087",21);
        Abiturient abiturient2=new Abiturient("Artak","Xachatryan","Aruri","Goris",
                "37495154087",15);
        Abiturient abiturient3=new Abiturient("Artur","Sahakyan","Aruri","Goris",
                "37495154087",27);
        Abiturient abiturient4=new Abiturient("Andranik","Navasdyan","Aruri","Goris",
                "37495154087",19);
        Abiturient abiturient5=new Abiturient("Simon","Arzumanyan","Aruri","Goris",
                "37495154087",12);
          AbiturientList abiturientList=new AbiturientList();
          abiturientList.add(abiturient1);
          abiturientList.add(abiturient2);
          abiturientList.add(abiturient3);
          abiturientList.add(abiturient4);
          abiturientList.add(abiturient5);
          abiturientList.goodEstemites(20);
          abiturientList.badEstemites(20);
          abiturientList.finishAbiturient();


    }

    public static class AbiturientList {
        private List<Abiturient> abiturientList=new ArrayList();
          public void add (Abiturient c) {abiturientList.add(c);}
        public void badEstemites(int  estemites){
            System.out.println("Abiturient list of bad estemites ");
            for (Abiturient ab:abiturientList) {
                if(ab.getEstemites()<estemites){
                    System.out.println(ab.toString());
                }

            }}
        public void finishAbiturient(){
            System.out.println("Finish abitureint cours");
            for (Abiturient ab:abiturientList) {
                System.out.println(ab.toString());
            }
        }public void goodEstemites(int goodEstimetis){
            System.out.println("Abiturient list of good estimetis");
            for (Abiturient ab:abiturientList) {
                if (ab.getEstemites() > goodEstimetis) {
                    System.out.println(ab.toString());
                }

            }}


    }

    static class Abiturient{
        int id;
        private static int nextId = 0;
        private String name;
        private String middleName;
        private String surname;
        private String address ;
        private String phoneNumber;
        private int estemites;


        Abiturient(String name, String middleName, String surname, String address, String phoneNumber, int  estemites){
            this.id=nextId++;
            this.name=name;
            this.middleName=middleName;
            this.surname=surname;
            this.address=address;
            this.phoneNumber=phoneNumber;

                this.estemites=estemites;
            }


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getEstemites() {
            return estemites;
        }

        public void setEstemites(int estemites) {
            this.estemites=estemites;

            }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Abiturient{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", surname='" + surname + '\'' +
                    ", address='" + address + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", estemites=" + estemites +
                    '}';
        }
        }
}






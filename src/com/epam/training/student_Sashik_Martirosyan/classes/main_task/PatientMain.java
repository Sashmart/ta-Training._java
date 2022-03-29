package com.epam.training.student_Sashik;

import java.util.ArrayList;
import java.util.List;

public class PatientMain {
    public static void main(String[] args) {

        Patient patient1=new Patient("Balayan", "Surik", "Vardani", "Goris",
                "25587441", "98000", "shaqarayin diabet");
        Patient patient2=new Patient("Martirosyan", "Ashot", "Vardani", "Goris",
                "25587441", "216598", "shaqarayin diabet");
        Patient patient3=new Patient("Balayan", "sssss", "Vardani", "Goris",
                "25587441", "123456", "chnshum");
        Patient patient4=new Patient("Balayan", "aaaa", "Vardani", "Goris",
                "25587441", "847458", "shaqarayin diabet");
        Patient patient5=new Patient("Balayan", "dddd", "Vardani", "Goris",
                "25587441", "849214", "chnshum");

        PatientList patientList=new PatientList();
        patientList.addPatient(patient1);
        patientList.addPatient(patient2);
        patientList.addPatient(patient3);
        patientList.addPatient(patient4);
        patientList.addPatient(patient5);
        patientList.diagnozReturn("chnshum");
        patientList.medicalCard("158369");
        patientList.diagnozReturn("shaqarayin diabet");

    }

    public static class PatientList {

            private List<Patient> patientList = new ArrayList<>();

            public void addPatient(Patient b) {
                patientList.add(b);
            }

            public void diagnozReturn(String diagnoz) {
                System.out.println("Patient list of diagnoz  " + diagnoz);
                for (Patient pt : patientList) {
                    if (pt.getDiagnoz().equals(diagnoz)) {
                        System.out.println(pt.toString());
                    }
                }
            }
            public void medicalCard(String numberMedicalCard) {
                System.out.println("Patient list of number medical card whom number big than  " + numberMedicalCard);
                for (Patient pt : patientList) {
                    if (Integer.parseInt(pt.getNumberMedicalCard()) > Integer.parseInt(numberMedicalCard)) {
                        System.out.println(pt.toString());
                    }
                }}}

    static class Patient {
        static int ido = 0;
        private int id;
        private String surname;
        private String name;
        private String middlename;
        private String address;
        private String numberTelephone;
        private String numberMedicalCard;
        private String diagnoz;

        public Patient(String address, String surname, String name, String middlename, String numberTelephone,
                       String numberMedicalCard, String diagnoz) {

            this.address = address;
            this.surname = surname;
            this.name = name;
            this.middlename = middlename;
            this.numberMedicalCard = numberMedicalCard;
            this.numberTelephone = numberTelephone;
            this.diagnoz = diagnoz;


        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getNumberMedicalCard() {
            return numberMedicalCard;
        }

        public void setNumberMedicalCard(String numberMedicalCard) {
            this.numberMedicalCard = numberMedicalCard;
        }

        public String getDiagnoz() {
            return diagnoz;
        }

        public void setDiagnoz(String diagnoz) {
            this.diagnoz = diagnoz;
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

        public String getNumberTelephone() {
            return numberTelephone;
        }

        public void setNumberTelephone(String numberTelephone) {
            this.numberTelephone = numberTelephone;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "id=" + id +
                    ", surname='" + surname + '\'' +
                    ", name='" + name + '\'' +
                    ", middlename='" + middlename + '\'' +
                    ", address='" + address + '\'' +
                    ", numberTelephone='" + numberTelephone + '\'' +
                    ", numberMedicalCard='" + numberMedicalCard + '\'' +
                    ", diagnoz='" + diagnoz + '\'' +
                    '}';


        }
    }
}





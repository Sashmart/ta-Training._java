package com.epam.training.student_Sashik;

import java.util.*;

public class Main {

    public static void main(String[] args){
         Student student1=new Student("Arman","Arturi","Sirunyan","06.11.1985",
                 "37495155555","Iravaban","147","9");
        Student student2=new Student("Artak","Samveli","Mkrtchyan","06.11.1998",
                "37495155544","tntesagitakan","120","19");
        Student student3=new Student("Artur","Vazgeni","Martirosyan","06.11.1997",
                "37495155598","Iravaban","147","9");
        Student student4=new Student("Karen","Garniki","Mirzoyan","06.11.2000",
                "37495155577","tntesagitakan","120","7");
        Student student5=new Student("David","Miroi","Vardanyan","06.11.1989",
                "3749515577","Iravaban","147","25");

         StudentList studentList=new StudentList();
          studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);
        studentList.addStudent(student5);
        studentList.facultyPrint("Iravaban");
        studentList.yearOfBirthPrint("1986");
        studentList.facultyCoursePrint("tntesagitakan","120");

    }

    static class StudentList {
        private List<Student> studentsList= new ArrayList<>();
        public void addStudent(Student a){
            studentsList.add(a);
        }
        public void facultyPrint(String faculty){
            System.out.println("Student list of facultet "+faculty);
            for(Student st:studentsList){
                if(st.getFaculty().equals(faculty)){
                    System.out.println(st.toString());
                }
            }
        }
        public void groupPrint(String group){
            System.out.println("Students list of group"+group);
            for(Student st:studentsList){
                if(st.getGroup().equals(group)){
                    System.out.println(st.toString());
                }
            }
        }
        public void yearOfBirthPrint(String year){
            System.out.println("Students list born after in "+year+" year");
            for(Student st:studentsList){
                if(parseYear(st.getDateOfBirth().substring(6))>parseYear(year)){
                    System.out.println(st.toString());}
            }
        }
        public void yearOfBirthPrint(){
            System.out.println("Student list years");
            for(Student st:studentsList){
                System.out.println(st.toString());}
        }

        public void facultyCoursePrint(String faculty,String course){
            System.out.println("Students list of faculty "+faculty+" course "+course);
            for(Student st:studentsList){
                if(st.getFaculty().equals(faculty)&st.getCourse().equals(course)){
                    System.out.println(st.toString());}
            }
        }
        public void facultyCoursePrint(String faculty) {
            System.out.println("Student list of faculty" + faculty + "all course");
            for (Student st : studentsList) {
                if (st.getFaculty().equals(faculty)) {
                    System.out.println(st.toString());
                }
            }
        }

        public void facultyCoursePrint(int course){
            System.out.println("Students list of all faculty and course "+course);
            for(Student st:studentsList){
                if(Integer.parseInt(st.getCourse())==course){
                    System.out.println(st.toString());}
            }
        }
        public int parseYear(String years){
            return Integer.parseInt(years);
        }
    }

    static class Student {

       int id;
       private static int nextId = 0;
       private String name;
       private String middleName;
       private String dateOfBirth;
       private String surname;
       private String phoneNumber;
       private String faculty;
       private String course;
       private String group;

       public Student(String name, String middleName, String surname, String dateOfBirth, String phoneNumber, String faculty, String course, String group) {

           this.name = name;
           this.middleName = middleName;
           this.surname = surname;
           this.dateOfBirth = dateOfBirth;
           this.phoneNumber = phoneNumber;
           this.faculty = faculty;
           this.course = course;
           this.group = group;
           id = nextId++;
           setName(name);
           setMiddleName(middleName);
           setSurname(surname);
           setDateOfBirth(dateOfBirth);
           setPhoneNumber(phoneNumber);
           setFaculty(faculty);
           setCourse(course);
           setGroup(group);
       }


       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getMiddleName() {
           return name;
       }

       public void setMiddleName(String middleName) {
           this.middleName = middleName;
       }

       public String getSurname() {
           return surname;
       }

       public void setSurname(String surname) {
           this.surname = surname;
       }

       public String getPhoneNumber() {
           return phoneNumber;
       }

       public void setPhoneNumber(String phoneNumber) {
           this.phoneNumber = phoneNumber;
       }

       public String getFaculty() {
           return faculty;
       }

       public void setFaculty(String faculty) {
           this.faculty = faculty;
       }

       public String getCourse() {
           return course;
       }

       public void setCourse(String course) {
           this.course = course;
       }

       public String getGroup() {
           return group;
       }

       public void setGroup(String group) {
           this.group = group;
       }

       public String getDateOfBirth() {
           return dateOfBirth;
       }

       public void setDateOfBirth(String dateOfBirth) {
           this.dateOfBirth = dateOfBirth;
       }


       public String toString() {
           return "Student{" + " id " + id +
                   ", name='" + name + '\'' +
                   ", middleName='" + middleName + '\'' +
                   ", dateOfBirth='" + dateOfBirth + '\'' +
                   ", surname='" + surname + '\'' +
                   ", phoneNumber='" + phoneNumber + '\'' +
                   ", faculty='" + faculty + '\'' +
                   ", course='" + course + '\'' +
                   ", group='" + group + '\'' +
                   '}';
       }

       public String fullName() {
           return surname + " " + middleName + " " + name;
       }

   }
}



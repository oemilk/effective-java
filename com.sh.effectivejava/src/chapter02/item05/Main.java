package chapter02.item05;

import chapter02.item04.DefaultConstructor;

class Main {

    public static void main(String[] args) {

        String s1 = new String("test"); // new String
        String s2 = "test"; // literal pool

        Boolean b1 = new Boolean("true");
        Boolean b2 = Boolean.valueOf("true");

        Student student = new Student(null);
        student.isHighSchoolStudent();

        NewStudent newStudent = new NewStudent(null);
        newStudent.isHighSchoolStudent();

    }

}



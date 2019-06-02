package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student("Kate");
	    student1.setRating(12);
	    Student student2 = new Student("Vasia");
	    student2.setRating(5);
        Student student3 = new Student("Lilia");
        student3.setRating(7);

        Student[] students = new Student[] {student1, student2, student3};
        System.out.println(Student.getAverageRating(students));
        student1.changeRating(2);
        System.out.println(Student.getAverageRating(students));
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student("Kate", 12);
	    Student student2 = new Student("Vasia", 5);
        Student student3 = new Student("Lilia", 7);

        Student[] students = new Student[] {student1, student2, student3};
        System.out.println(Student.getAverageRating(students));
        student2.changeRating(10);
        System.out.println(Student.getAverageRating(students));
    }
}

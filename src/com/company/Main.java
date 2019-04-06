package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student("Kate", 12);
	    Student student2 = new Student("Vasia", 5);
        Student student3 = new Student("Lilia", 7);

	    System.out.println((double)(student1.getRating() + student2.getRating() + student3.getRating()) / 3);
        student2.changeRating(10);
        System.out.println((double)(student1.getRating() + student2.getRating() + student3.getRating()) / 3);

    }
}
